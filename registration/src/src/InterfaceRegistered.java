package src;
public interface InterfaceRegistered {
	void order(int product_id); //order the product if the product is found
    void payOrder(); //pay for the product and add it to the buying history
    int buyHistory(int user_id); //show the amount of the cost that user already purchased

}
