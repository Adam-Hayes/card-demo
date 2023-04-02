package com.example.carddemo.services;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.example.carddemo.dto.response.PersonResponseDto;
import com.example.carddemo.entity.PersonEntity;
import com.example.carddemo.factories.PersonDtoFactory;
import com.example.carddemo.repo.PersonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonDtoFactory personDtoFactory;

    @Transactional
    @Override
    public PersonResponseDto createPerson(final String name, final int age, final String email, final String phoneNumber) {

        final PersonEntity personToSave =
                PersonEntity.builder().name(name).age(age).email(email).phoneNumber(phoneNumber).build();
        PersonEntity savedPerson = personRepository.saveAndFlush(personToSave);

        return PersonResponseDto.builder()
                .id(savedPerson.getId())
                .name(savedPerson.getName())
                .age(savedPerson.getAge())
                .email(savedPerson.getEmail())
                .phoneNumber(savedPerson.getPhoneNumber())
                .build();
    }

    @Override
    public PersonResponseDto getPerson(final Long id) {
        return null;
    }

    //    @Override
//    public PersonDto getPerson(final Long id){
//        personRepository.findById(id).orElseThrow(() ->{
//            new
//        });
//        return personDtoFactory.getPerson(person);
//    }
}
