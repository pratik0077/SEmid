package src;
public class RegisteredUsers extends User implements InterfaceBoth,InterfaceRegistered {
	 
	 Product proClass = new Product();
	 int[] orderHistory=new int[100];
	 int[] orderPrice= new int[100];
	 int totalFavourites=0;
	 int totalBuying=0;
	
	 int totalOrder=0;
	 int totalPayment=0;
	
	 int[] buyingPrice= new int[100];
	 int[] buyingHistory=new int[100];
	 int [] favoriteHistory=new int[100];
	 
	
	 

	@Override
	public void order(int product_id) {
		// TODO Auto-generated method stub
		
			orderHistory[totalOrder]=product_id;
			orderPrice[totalOrder]=proClass.returnPrice(product_id);
			totalOrder++;
			
			System.out.println("Ordered");
	
		
		
		
	}

	@Override
	public void payOrder() {
		// TODO Auto-generated method stub
		if(totalPayment>10000)
		{
			for(int i=0;i<totalOrder;i++)
			{
				buyingHistory[i]=orderHistory[i];
				buyingPrice[i]=orderPrice[i]*(15/100);
				
			}
			totalBuying=totalOrder;
			totalOrder=0;
			System.out.println("Payment Successfull\nYou've got 15 percent discount in your orders");
		}
		else
		{
			for(int i=0;i<totalOrder;i++)
			{
				buyingHistory[i]=orderHistory[i];
				buyingPrice[i]=orderPrice[i];
				System.out.println(""+buyingPrice[i]);
			}
			totalBuying=totalOrder;
			totalOrder=0;
			System.out.println("Payment Successfull");
			
		}
		
		
	}

	@Override
	public boolean search(int product_id) {
		// TODO Auto-generated method stub
		for(int i=0;i<proClass.n;i++)
		{
			if(product_id==proClass.productId[i])
			{
				return true;
			}
		}
		
		return false;
	}
	
	

	@Override
	public String addIntoInterest(int product_id) {
		// TODO Auto-generated method stub
		if(totalFavourites==0)
		{
			favoriteHistory[totalFavourites]=product_id;
			totalFavourites++;
			return "added to interest";
			
		}
		else
		{
			for(int i = 0;i<=totalFavourites;i++)
			{
				if(product_id==favoriteHistory[i])
				{
					return "already added this product into favorites";
    
				}
			}
			favoriteHistory[totalFavourites]=product_id;
			return "added to interest";
			
		}
		
		
	}

	@Override
	public int buyHistory(int user_id) {
		// TODO Auto-generated method stub
	
			for(int i=0;i<totalBuying;i++)
			{
				totalPayment=totalPayment+buyingPrice[i];
			}
			return +totalPayment;
			
	
		
	}


	
}
