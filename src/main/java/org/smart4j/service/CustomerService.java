package org.smart4j.service;

import org.smart4j.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务service
 */
public class CustomerService {

    public List<Customer> getCustomerList(String keyword){

        return null;
    }

    public Customer getCustomerById(Long id){
        return null;
    }

    public boolean createCustomer(Map<String,Object> customerMap){
        return false;
    }

    public boolean updateCustomer(long id, Map<String,Object> customerMap){
        return false;
    }

    public boolean deleteCustomer(Long id){
        return false;
    }
}
