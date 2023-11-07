
package oop;
import java.util.ArrayList;

public class Order 
{

   private int orderNumber;
   public Customer OrderedCustomer ;
   public  ArrayList<Food> Foods = new ArrayList<Food>();
    
    public Order(int token,Customer newCustomer)
    {
        orderNumber=token;
        OrderedCustomer=newCustomer;
    }
    
    public void Print()
    {
         System.out.println("===========================");
         System.out.println("Order # :"+orderNumber);
         System.out.println("===========================");
        OrderedCustomer.PrintCustomer();
        
        System.out.println("========= Ordered foods =======");
        
        for(Food item: Foods )
                {
                    item.displayFood();
                }
        
    }
           
    
}
