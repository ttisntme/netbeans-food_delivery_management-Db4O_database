/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        this.customerList = new ArrayList<>();
        
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    
    public Customer createCustomer(String name){
        Customer c = new Customer();
        c.setName(name);
        customerList.add(c);
        return c;
    }
    public Customer getCustomerByName(String name) {
        for(Customer c : customerList) {
            if(c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
    public Customer getCustomerById(int id) {
        for(Customer c : customerList) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }
    
    
    public boolean deleteCustomerById(int id) {
        for(Customer c : customerList) {
            if(c.getId() == id) {
                customerList.remove(c);
                return true;
            }
        }
        return false;
    }
}
