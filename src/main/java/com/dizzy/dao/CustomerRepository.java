package com.dizzy.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dizzy.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findByName(String name);



}
