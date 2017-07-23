package src;
import java.util.Scanner;

/**
 * Created by user on 7/23/2017.
 */
public class Runner
{
    public static void main(String[] args) {
    	Product product = new Product();
        product.showInformation();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your User ID : ");
        int userId = scan.nextInt();
        
        if(userId%2==0) //Even userID
        {
        	RegisteredUsers regUser = new RegisteredUsers();
        	regUser.user_id=userId;
        	while(true)
        	{
        		System.out.println("\n1. Search the product\n2. Order the product\n3. Pay the order\n4. Add the product into interest\n5. Show the user buying history\n");
            	int option=scan.nextInt();
            	if(option==1)
            	{
            		System.out.println("Please Enter The Product ID : ");
            		int productId=scan.nextInt();
            		boolean result = regUser.search(productId);
            		
            		
            			System.out.println(""+result);
            		
           
            	
            	}
            	else if(option==2)
            	{
            		System.out.println("Please Enter The Product ID : ");
            		int productId=scan.nextInt();
            		System.out.println("Please Enter Your User ID : ");
            		int userIdtoOrder=scan.nextInt();
            		regUser.order(productId); 
            	}
            	else if(option==3)
            	{
            		regUser.payOrder();
            	}
            	else if(option==4)
            	{
            		System.out.println("Please Enter The Product ID : ");
            		int productId=scan.nextInt();
            		System.out.println(regUser.addIntoInterest(productId));
            	}
            	else if(option==5)
            	{
            		System.out.println(regUser.buyHistory(userId));
            	}
            

        	}
        	            
        }
        else
        {
        	UnregisteredUser unregUser = new UnregisteredUser();
        	unregUser.user_id=userId;
        	while(true)
        	{
        		System.out.println("What do you want to do?\n1. Search the product\n2. Add the product into interest\n");
            	int Options=scan.nextInt();
            	if(Options==1)
            	{
            		System.out.println("Please Enter The Product ID : ");
            		int productId=scan.nextInt();
            		boolean result = unregUser.search(productId);
            		if(result == true)
            		{
            			System.out.println("Found");
            		}
            		else
            		{
            			System.out.println("Not Found");
            		}
            	}
            	else if(Options==2)
            	{
            		System.out.println("Please Enter The Product ID : ");
            		int productId=scan.nextInt();
            		System.out.println(unregUser.addIntoInterest(productId));
            	}
            
            	
        	}
        	
            
        }
        
    }
}
