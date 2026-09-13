package com.ducthai.accounts.controller;

import com.ducthai.accounts.constants.AccountsConstants;
import com.ducthai.accounts.dto.CustomerDto;
import com.ducthai.accounts.dto.ResponseDto;
import com.ducthai.accounts.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(
            @RequestBody CustomerDto customerDto
            ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201)
        );
    }

}
