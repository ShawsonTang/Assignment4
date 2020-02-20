/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apple
 */
public class CustomerDirectory {
     private ArrayList<Customer> customerList;
     
     public CustomerDirectory(){
        customerList = new ArrayList<>();
        Customer c1 = new Customer("Jiaoli");
        Customer c2 = new Customer("Shaocong");
        Customer c3 = new Customer("Hao");
        
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public Customer searchName(String name){
        for(Customer customer : customerList){
            if(customer.getName().equals(name)){
                 return customer;
          }
        }
         return null;
    }
    
    public Customer addCustomer(){
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
    
        public void deleteCustomer(Customer customer){
            
             customerList.remove(customer);
        }
    
    
}
