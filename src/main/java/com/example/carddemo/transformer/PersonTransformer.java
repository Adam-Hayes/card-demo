package com.example.carddemo.transformer;

import org.springframework.stereotype.Component;
import com.example.carddemo.dto.request.PersonRequestDto;
import com.example.carddemo.dto.response.PersonResponseDto;
import com.example.carddemo.model.Person;


@Component
public class PersonTransformer {

    public PersonResponseDto toPerson(final Person person){
        return PersonResponseDto.builder()
                .id(person.getId())
                .name(person.getName())
                .age(person.getAge())
                .email(person.getEmail())
                .phoneNumber(person.getPhoneNumber())
                .build();
    }

    public Person toPerson(final PersonRequestDto personRequest){
        return Person.builder()
                .name(personRequest.getName())
                .age(personRequest.getAge())
                .email(personRequest.getEmail())
                .phoneNumber(personRequest.getPhoneNumber())
                .build();
    }


}
