package com.icodeap.crudfullstackangular.service;

import com.icodeap.crudfullstackangular.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> findAll();
    Customer findById (Integer id);
    void deleteById(Integer id);
    Customer update(Customer customer);
}
