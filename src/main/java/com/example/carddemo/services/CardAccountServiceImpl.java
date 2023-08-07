package com.example.carddemo.services;

import org.springframework.stereotype.Service;
import com.example.carddemo.dto.request.CardAccountRequestDto;
import com.example.carddemo.dto.response.CardAccountResponseDto;
import com.example.carddemo.exception.EntityNotFoundException;
import com.example.carddemo.model.CardAccount;
import com.example.carddemo.model.Person;
import com.example.carddemo.repo.CardAccountRepository;
import com.example.carddemo.repo.PersonRepository;
import com.example.carddemo.transformer.CardAccountTransformer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CardAccountServiceImpl implements CardAccountService {
    private final PersonRepository personRepository;
    private final CardAccountRepository cardAccountRepository;
    private final CardAccountTransformer cardAccountTransformer;

    @Override
    public CardAccountResponseDto createCardAccount(final Long personId,
            final CardAccountRequestDto cardAccountRequest) {
        Person person = personRepository.findById(personId).orElseThrow(() -> {
            throw new EntityNotFoundException(String.format("Person with id %s not found", personId));
        });
        final CardAccount cardAccount = cardAccountTransformer.toCardAccount(cardAccountRequest);
        person.addCardAccount(cardAccount);
        CardAccount savedCardAccount = cardAccountRepository.save(cardAccount);
        return cardAccountTransformer.toCardAccount(savedCardAccount);
    }

    @Override
    public CardAccountResponseDto getCardAccount(final Long personId, final Long cardAccountId) {
        return cardAccountRepository.findByPersonIdAndId(personId, cardAccountId)
                .map(cardAccountTransformer::toCardAccount).orElseThrow(() -> {
                    throw new EntityNotFoundException(String.format(
                            String.format("Card account with id %s not found for person with id %s", cardAccountId,
                                    personId)));
                });
    }

    @Override
    public void deleteCardAccount(final Long cardAccountId) {
        cardAccountRepository.deleteById(cardAccountId);
    }

}
