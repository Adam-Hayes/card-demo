package com.example.carddemo.services;

import java.util.List;
import org.springframework.data.domain.Pageable;
import com.example.carddemo.dto.request.PersonRequestDto;
import com.example.carddemo.dto.response.PersonPageResponseDto;
import com.example.carddemo.dto.response.PersonResponseDto;

public interface PersonService {

    PersonResponseDto createPerson(PersonRequestDto personRequestDto);
    PersonResponseDto getPerson(Long id);

    void deletePerson(Long id);

    PersonPageResponseDto getAllPersons(Pageable pageable);
}
