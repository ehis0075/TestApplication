/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Customer;
import javax.ejb.Stateless;

/**
 *
 * @author Fincode
 */

@Stateless
public class CustomerService {
    
    public Customer addCustomer(Customer customer) {
        
        Customer v = new Customer();
        v.setName(customer.getName());
        v.setGender(customer.getGender());
        v.setLocation(customer.getLocation());
        
        return v;
        
    }
    
    
    
    
    
}
