/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ShoppingCart implements Serializable {
    
    private ArrayList<ShopItem> cartList=new ArrayList();
    private Shop s;
    private String cartID;
    private double totalCost;
    
    ShoppingCart(Shop s, String id)
    {
        this.s = s;
        cartID = id;
        totalCost = 0;

    }
    //Buy mobile by NAME. Update cartList and total price. 
    public void buyMobile(String name){
    	
    	for (int i = 0; i < s.getList().size(); i++){
    		
            if (s.getList().get(i) instanceof MobilePhone){
            	
                if (((MobilePhone) s.getList().get(i)).getName().equals(name)){
                	
                    cartList.add(((MobilePhone)s.getList().get(i)));
                    
                    totalCost += ((MobilePhone) s.getList().get(i)).price;
                    
                }
            }
        }
        
    }

    public double getTotalCost() {
        return totalCost;
    }
    
     //Buy LED by MODEL. Update cartList and total price
    public void buyLED(String model){
    	
    	for (int i = 0; i < s.getList().size(); i++){
    		
            if (s.getList().get(i) instanceof LED){
            	
                if (((LED) s.getList().get(i)).getModel().equals(model)){
                	
                    cartList.add(((LED)s.getList().get(i)));
                    
                    totalCost += ((LED) s.getList().get(i)).price;
                }
            }  
    }
    	
// Remove all the bought items (items in the cartList) from the Shop. 
        void checkOut() {
        
        	for(int i = 0 ; i < cartList.size();i++){
                cartList.remove(i);
            } 
        }
        
// Show the detail of each item in the cart. 
        public void showDetailCart() {
        	for(int i = 0 ; i < cartList.size();i++)
        		System.out.println(cartList.get(i));
        }

    }
    
    //Cancel an item by itemID. Update cartList and total price.
    public void cancelOrder(String itemID)
    {
       
        
        
        
        
    }
    
    
   // Write the Cart to the File. 
    public void writeCartToFile( )  
    {
        
        
        
        
    }
    

