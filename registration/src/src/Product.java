package src;
/**
 * Created by user on 7/23/2017.
 */
public class Product
{
    int n=10;
    int []productId;
    int []productPrice;

    Product()
    {
        productId = new int[n];
        productPrice = new int[n];

        for(int i=0; i<n; i++)
        {
            productId[i] = i+1;
            productPrice[i] = (i+1)*100;
        }
    }

    void showInformation()
    {
        //System.out.println(productId.toString());
        for(int i=0; i<n;i++)
            System.out.print("Product Id: " +productId[i]+"  Price:"+productPrice[i]+"\n");
    }
    
    int returnPrice(int product_id)
    {
    	for(int i=0;i<n;i++)
    	{
    		if(productId[i]==product_id)
    		{
    			return productPrice[i];
    		}
    	}
		return 0;
    }
}
