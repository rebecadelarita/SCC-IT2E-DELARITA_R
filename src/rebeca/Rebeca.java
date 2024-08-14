
 
package rebeca;
import java.util.Scanner;



public class Rebeca {
    
    public static void main (String[] args){
        Scanner input = new  Scanner (System.in);
        String cname,pname;
        int gty, price, cash, tdue, change;
        
        System.out.print("Enter customer Name: ");
        cname = input.nextLine();
        System.out.print ("Enter Product Name: "); 
        pname= input.nextLine();
        System.out.print ("Enter Quantity: ");
       gty =input.nextInt();
       System.out.print("Enter Price:  ");
       price =input.nextInt();
       System.out.print("Enter Cash: ");
       cash = input.nextInt();
       
      
      System.out.println("------------------------------");
     System.out.println ("RECEIRT");
      System.out.println("-------------------------------");
      
      System.out.println("Name:"+cname);
      System.out.println("Item Name:"+pname);
      
       System.out.println("Quantity:"+gty);
       
       System.out.println("-------------------------------");
       
       tdue = price*gty;
       System.out.println("Total Due:"+tdue+".00");
        System.out.println("Cash:"+cash+".00");
   
        System.out.println("-------------------------------");    
        
       change = cash -tdue;
         System.out.println("change:"+change+".00"); 
      
      
      
      
      
      
      
      
      
      
      
      
       
       
        
     
   
     
     
    }
        
        
        }