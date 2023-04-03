package com.example.carddemo.dto.request;

import java.util.List;
import javax.validation.constraints.NotNull;
import com.example.carddemo.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardAccountRequestDto {

    @NotNull
    private Long personId;
    @NotNull
    private String accountNumber;
    @NotNull
    private AccountType accountType;
    @NotNull
    private Double balance;

    private List<CardRequestDto> cards;
}
