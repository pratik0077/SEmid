package src;
public class UnregisteredUser extends User implements InterfaceBoth {

	Product pc = new Product();
	
	int [] favoriteHistory=new int[100];
	 int totalFavourites=0;
	@Override
	public boolean search(int product_id) {
		// TODO Auto-generated method stub
		for(int i=0;i<pc.n;i++)
		{
			if(product_id==pc.productId[i])
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

}
