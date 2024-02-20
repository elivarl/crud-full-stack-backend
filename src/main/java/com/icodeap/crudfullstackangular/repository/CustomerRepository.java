package com.icodeap.crudfullstackangular.repository;

import com.icodeap.crudfullstackangular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer> {
}
