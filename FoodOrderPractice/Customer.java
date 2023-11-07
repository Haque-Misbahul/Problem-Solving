
package oop;

public class Customer {
    
   int customer_id, phone_number, customer_age;
   String customer_name;
   
    public Customer(int C_id,String C_name, int C_phone_number, int C_age)
    {   
        customer_id = C_id;
        customer_name = C_name;
        phone_number = C_phone_number;
        customer_age = C_age;
        

    }
    
    public void PrintCustomer()
    {
        System.out.println(customer_name);
        System.out.println(phone_number);
        
    }
   
    
}
