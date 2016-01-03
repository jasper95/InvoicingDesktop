/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.dao.springdatajpa.CustomerRepository;
import com.domain.Customer;
import com.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bert
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository custRepo;
    
    @Transactional(readOnly=true)
    @Override
    public Customer find(Integer id) {
        return custRepo.findOne(id);
    }
    
    @Transactional(readOnly=true)
    @Override
    public List<Customer> findAll() {
        return custRepo.findAll();
    }
    
    @Transactional
    @Override
    public void saveForm(Customer c) {
        custRepo.save(c);
    }
}
