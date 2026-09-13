package com.ducthai.accounts.service;

import com.ducthai.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * Create a new account for the given customer.
     *
     * @param customerDto the customer data transfer object containing customer details
     */
    void createAccount(CustomerDto customerDto);
}
