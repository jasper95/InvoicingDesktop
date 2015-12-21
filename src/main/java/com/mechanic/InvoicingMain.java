/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mechanic;

import com.domain.Customer;
import com.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Bert
 */
public class InvoicingMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = (CustomerService) context.getBean("customerService");
        Customer cust = service.find(1);
        System.out.println(" "+cust.getFirstName());
    }
}