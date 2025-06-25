package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;

import java.util.Optional;

public interface ICustomerRepository {
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
