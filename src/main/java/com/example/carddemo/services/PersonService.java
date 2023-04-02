package com.example.carddemo.services;

import com.example.carddemo.dto.response.PersonResponseDto;

public interface PersonService {

    PersonResponseDto createPerson(String name, int age, String email, String phoneNumber);
    PersonResponseDto getPerson(Long id);
}
