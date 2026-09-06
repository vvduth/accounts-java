package com.ducthai.accounts.repository;

import com.ducthai.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// spring jap will create a bean implemtation
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
