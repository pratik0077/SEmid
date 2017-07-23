package src;
/**
 * Created by user on 7/23/2017.
 */
public interface InterfaceBoth {
    boolean search(int product_id); //returns true or false upon find the product or not
    String addIntoInterest(int product_id); //add the product into the favoriteList
                                          // and if the product is searched next time, print that you have already added this product into favoritesvoid 
    }
