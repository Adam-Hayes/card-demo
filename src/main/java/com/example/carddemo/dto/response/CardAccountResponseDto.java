package com.example.carddemo.dto.response;

import java.util.List;
import com.example.carddemo.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardAccountResponseDto {

    private Long id;

    private String accountNumber;

    private AccountType accountType;

    private Double balance;

    private List<CardResponseDto> cards;
}
