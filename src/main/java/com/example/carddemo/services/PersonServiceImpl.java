package com.example.carddemo.services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.carddemo.dto.request.PersonRequestDto;
import com.example.carddemo.dto.response.PersonPageResponseDto;
import com.example.carddemo.dto.response.PersonResponseDto;
import com.example.carddemo.exception.EntityNotFoundException;
import com.example.carddemo.model.Person;
import com.example.carddemo.repo.PersonRepository;
import com.example.carddemo.transformer.PersonTransformer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonTransformer personTransformer;

    @Transactional
    @Override
    public PersonResponseDto createPerson(final PersonRequestDto personRequest) {
        final Person savedPerson = personRepository.save(personTransformer.toExistPerson(personRequest));
        return personTransformer.toNewPerson(savedPerson);
    }

    @Override
    public PersonResponseDto getPerson(final Long id) {
        return personRepository.findById(id).map(personTransformer::toExistPerson).orElseThrow(() -> {
            throw new EntityNotFoundException(String.format("Person with id %s not found", id));
        });
    }



    @Override
    public void deletePerson(final Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public PersonPageResponseDto getAllPersons(final Pageable pageable) {
        return null;
    }
}
