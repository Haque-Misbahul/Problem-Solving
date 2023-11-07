
package oop;


public class Food 
{
    
    String food_type;
    double food_price;
    int food_count,foodID;
    
    public Food(int fID,String Fname, double price, int count)
    {   
          foodID = fID;
          food_type = Fname;
          food_price = price;
          food_count = count;
          
    
    }
    
    void add_food( String f,int n )
    {
        food_type = f;
        food_count = n+food_count;
        ///count = count+1;
        System.out.println("now the number of " 
                          + food_type + " is " + food_count);
        System.out.println("\n===========================\n");
        
    }
    void delete_food( String f,int n )
    { 
        food_type = f;
        food_count = food_count-n;
        System.out.println("now the number of " 
                          + food_type + " is " + food_count);
        System.out.println("\n===========================\n");
    }
    
    void displayFood()
    {
     System.out.println("Food Item no :" + " " + foodID);
     System.out.println("Food Name :" + " " + food_type);
     System.out.println("Food Price :" + " " + food_price);
     System.out.println("Available"+ " " + food_type + ":" + " " + food_count);
     System.out.println("");
    }
    
    
}
