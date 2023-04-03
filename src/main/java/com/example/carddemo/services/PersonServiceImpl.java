package com.example.carddemo.services;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.example.carddemo.dto.request.PersonRequestDto;
import com.example.carddemo.dto.response.PersonResponseDto;
import com.example.carddemo.model.Person;
import com.example.carddemo.transformer.PersonTransformer;
import com.example.carddemo.repo.PersonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonTransformer personTransformer;

    @Transactional
    @Override
    public PersonResponseDto createPerson(final PersonRequestDto personRequest) {
        final Person personToSave = personTransformer.toPerson(personRequest);
        Person savedPerson = personRepository.save(personToSave);
        return personTransformer.toPerson(savedPerson);
    }

    @Override
    public PersonResponseDto getPerson(final Long id) {
       return personRepository.findById(id).map(personTransformer::toPerson).orElseThrow(() -> {
             throw new RuntimeException("Person not found");
        });
    }
}
