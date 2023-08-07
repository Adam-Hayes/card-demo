package com.example.carddemo.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.carddemo.dto.request.PersonRequestDto;
import com.example.carddemo.dto.response.PersonResponseDto;
import com.example.carddemo.services.PersonService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/person")
public class PersonController {
    private final PersonService personService;

    @PostMapping()
    public PersonResponseDto createPerson(@Valid @RequestBody final PersonRequestDto personRequest) {
        return personService.createPerson(personRequest);
    }

//    @GetMapping
//    public List<PersonResponseDto> getAllPersons(@SortDefault Pageable pageable){
//        pageable.
//       // return personService.getAllPersons();
//    }

    @GetMapping("{id}")
    public PersonResponseDto getPerson(@PathVariable final Long id) {
        return personService.getPerson(id);
    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable final Long id) {
         personService.deletePerson(id);
    }
}
