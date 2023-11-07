
package oop;
import java.util.Scanner;


public class Restaurant 
{
   
    
 public static void main(String[] args) 
  {
      
      Food pizza =  new Food(1, "pizza", 10, 20);
   
      Food burger =  new Food(2, "burger", 8, 15);

      Food coke =  new Food(3, "coke", 2, 12);
      
      
      Customer polin = new Customer(1,"Polin",223,34);
      
     
         Order firstOrder = new Order(1,polin);
         
         firstOrder.Foods.add(pizza);
             firstOrder.Foods.add(burger);
                 firstOrder.Foods.add(coke);
                 
                 
                 firstOrder.Print();
                 
        
  
  }    
}
