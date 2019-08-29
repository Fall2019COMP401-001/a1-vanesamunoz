package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberofpeople = scan.nextInt();
		
        
        
		
		for(int i = 0; i < numberofpeople; i++) {
			char c = scan.next().charAt(0);  
	        String lastname = scan.next();
	        double total = 0.0;
	        double product = 1.0;
	         
	       
	      
		
		int numberofitems = scan.nextInt();
		
		for(int a = 0; a < numberofitems; a++ ) {
	        	int numberofitem = scan.nextInt();
	        	String nameofitem = scan.next();
	        	double priceofitem = scan.nextDouble();
	        	
	        	if(nameofitem.contains("Banana")) {
	        		product = numberofitem * priceofitem;
	        		total += product;
	        	
	        	} else if(nameofitem.contains("Orange")) {
	        		product = numberofitem * priceofitem;
	        		total += product;
	        	
	        	} else if(nameofitem.contains("Milk")) {
	        		product = numberofitem * priceofitem;
	        		total += product;;
	        	
	        	} else if(nameofitem.contains("Sponge")) {
	        		product = numberofitem * priceofitem;
	        		total += product;
	        	
	        	} else {
	        		product = numberofitem * priceofitem;
	        		total += product;
	        	
	        	}
		}
	        	
		String newLine = System.getProperty("line.separator");
		
	   	  
		System.out.println(newLine + c + ". " + lastname + ": " + total);
	
		}
	
		
                    
        scan.close(); 

		
	}
}
