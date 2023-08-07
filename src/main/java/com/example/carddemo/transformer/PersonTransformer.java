package com.example.carddemo.transformer;

import org.springframework.stereotype.Component;
import com.example.carddemo.dto.request.PersonRequestDto;
import com.example.carddemo.dto.response.PersonResponseDto;
import com.example.carddemo.model.Person;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class PersonTransformer {

    private final CardAccountTransformer cardAccountTransformer;

    public PersonResponseDto toExistPerson(final Person person) {
        //@formatter:off
        return PersonResponseDto.builder()
                .id(person.getId())
                .name(person.getName())
                .age(person.getAge())
                .email(person.getEmail())
                .phoneNumber(person.getPhoneNumber())
                .cardAccounts(person.getCardAccounts().stream().map(cardAccountTransformer::toCardAccount).toList()).build();
        //@formatter:on
    }

    public PersonResponseDto toNewPerson(final Person person) {
        //@formatter:off
        return PersonResponseDto.builder()
                .id(person.getId())
                .name(person.getName())
                .age(person.getAge())
                .email(person.getEmail())
                .phoneNumber(person.getPhoneNumber())
                .build();
        //@formatter:on
    }

    public Person toExistPerson(final PersonRequestDto personRequest) {
        return Person.builder()
                .name(personRequest.getName())
                .age(personRequest.getAge())
                .email(personRequest.getEmail())
                .phoneNumber(personRequest.getPhoneNumber())
                .build();
    }

}
