package com.ducthai.accounts.dto;


import lombok.Data;

// gen all th getter setter and all stuff hashcode for the data
@Data
public class AccountsDto {
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
