package com.example.carddemo.dto.response;

import javax.validation.constraints.NotNull;
import com.example.carddemo.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardResponseDto {
    @NotNull
    private Long id;
    @NotNull
    private String cardNumber;
    @NotNull
    private Currency currency;
    @NotNull
    private String expirationDate;
}
