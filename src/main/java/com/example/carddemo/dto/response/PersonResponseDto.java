package com.example.carddemo.dto.response;

import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonResponseDto {

    @NotNull
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private int age;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;


    private List<CardAccountResponseDto> cardAccounts;
}
