package com.example.carddemo.dto.request;

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
public class PersonRequestDto {

    @NotNull
    private String name;
    @NotNull
    private int age;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;

    private List<CardAccountRequestDto> cardAccounts;
}
