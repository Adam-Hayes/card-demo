package com.example.carddemo.factories;

import org.springframework.stereotype.Component;
import com.example.carddemo.dto.response.PersonResponseDto;
import com.example.carddemo.entity.PersonEntity;


@Component
public class PersonDtoFactory {

    public PersonResponseDto getPerson(final PersonEntity person){
        return PersonResponseDto.builder()
                .id(person.getId())
                .name(person.getName())
                .age(person.getAge())
                .email(person.getEmail())
                .phoneNumber(person.getPhoneNumber())
                .build();
    }
}
