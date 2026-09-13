package com.ducthai.accounts.service.impl;

import com.ducthai.accounts.dto.CustomerDto;
import com.ducthai.accounts.repository.AccountsRepository;
import com.ducthai.accounts.repository.CustomerRepository;
import com.ducthai.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
