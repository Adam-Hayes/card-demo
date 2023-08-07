package com.example.carddemo.controllers;

import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.carddemo.dto.request.CardAccountRequestDto;
import com.example.carddemo.dto.response.CardAccountResponseDto;
import com.example.carddemo.services.CardAccountService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/person/{personId}/card-account")
public class CardAccountController {
    private final CardAccountService cardAccountService;

    @PostMapping
    public CardAccountResponseDto createCardAccount(@PathVariable(name = "personId") final Long personId,
            @Valid @RequestBody final CardAccountRequestDto cardAccountRequest) {
        return cardAccountService.createCardAccount(personId, cardAccountRequest);
    }

    @GetMapping("/{id}")
    public CardAccountResponseDto getCardAccount(@PathVariable(name = "personId") final Long personId,
            @PathVariable final Long id) {
        return cardAccountService.getCardAccount(personId, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCardAccount(@PathVariable final Long id, @PathVariable final String personId) {
        cardAccountService.deleteCardAccount(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
