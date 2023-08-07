package com.example.carddemo.dto.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonResponseDto {

    private Long id;

    private String name;

    private int age;

    private String email;

    private String phoneNumber;

    private List<CardAccountResponseDto> cardAccounts;
}
