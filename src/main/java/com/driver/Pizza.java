package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese = -1;
    private int toppings = -1;
    private int takeway = -1;
    private boolean isbill = false;
    
    
  	final int VegPizzaBasePrice = 300;
  	final int NonvegPizzaBasePrice = 400;
  	final int ExtraCheesePrice = 80;
  	final int ExtraToppingsForVegPizza = 70;
  	final int ExtraToppingsForNonvegPizza = 120;
  	final int PaperbagPrice = 20;
  	
  	
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true) {
        	this.price= VegPizzaBasePrice;

        	}
        else {
        	this.price= NonvegPizzaBasePrice;
        }
        bill="";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
    	if(cheese==-1) {
    			this.price+=ExtraCheesePrice;
    			cheese = ExtraCheesePrice;
    		return;
    	}
    	return;
    }

    public void addExtraToppings(){
        // your code goes here
    	if(toppings==-1) {
    		 if(isVeg==true) {
    			 this.price += ExtraToppingsForVegPizza;
    			 toppings = ExtraToppingsForVegPizza;
    		 }
    	       
    		 else {
    			 this.price += ExtraToppingsForNonvegPizza;
    			 toppings = ExtraToppingsForNonvegPizza;
    		 }
    			 
    		 return;
    		
    	}
    	return;
    }

    public void addTakeaway(){
        // your code goes here
    	if(takeway==-1) {
    		this.price += PaperbagPrice;
    		takeway = PaperbagPrice;
    		return;
    	}
    	return;
    }

    public String getBill(){
        // your code goes here
    	if(isbill==false) {
    	if(isVeg==true)
    		bill+="Base Price Of The Pizza: "+VegPizzaBasePrice+"\n";
    	else
    		bill+="Base Price Of The Pizza: "+NonvegPizzaBasePrice+"\n";
    	if(cheese!=-1)
    		bill+="Extra Cheese Added: "+cheese+"\n";
    	if(toppings!=-1)
    		bill+="Extra Toppings Added: "+toppings+"\n";
    	if(takeway!=-1)
    		bill+="Paperbag Added: "+takeway+"\n";
    	bill+="Total Price: "+price;
    	isbill = true;
    	}
        return this.bill;
        
    }
}
