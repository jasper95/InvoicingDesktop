/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.domain.Customer;

/**
 *
 * @author Bert
 */
public interface CustomerService {
    public Customer find(Integer id);
}
