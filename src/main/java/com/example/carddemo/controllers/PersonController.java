package com.example.carddemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.carddemo.dto.response.PersonResponseDto;
import com.example.carddemo.services.PersonService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class PersonController {

    private final PersonService personService;

    @PostMapping("api/persons")
    public PersonResponseDto createPerson(@RequestParam final String name ,@RequestParam final int age,
            @RequestParam final String email,@RequestParam final String phoneNumber){

        return personService.createPerson(name, age, email, phoneNumber);
    }

    @GetMapping("api/persons/{id}")
    public PersonResponseDto testEndpoint(@PathVariable final Long id){

        return personService.getPerson(id);
    }
}
