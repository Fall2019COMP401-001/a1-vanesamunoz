package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		
		
		int numberofitems = scan.nextInt();
		
		//Matched the name with the price
		
		String[] products = new String[numberofitems];
		
		double[] priceofproducts = new double[numberofitems];
		
		for(int i = 0; i < numberofitems; i++) {
			products[i] = scan.next();
			priceofproducts[i] = scan.nextDouble();
		}
		
		
		// Put the names with their firstname and lastname into an array
		
		int numberofpeople = scan.nextInt();
		
		String[] personfirstname = new String[numberofpeople];
		
		String[] personlastname = new String[numberofpeople];
		
		
		
		int[] quantityofitemsbought = new int[numberofitems];
		
		int[] quantityofpersons = new int[numberofitems];
		
	
		
		
		// for loop goes through the number of people (3)
		// puts the first name and last name into corresponding arrays
		
		for(int a = 0; a < numberofpeople; a++) {
			String firstname = scan.next();
			String lastname = scan.next();
			
			personfirstname[a] = firstname;
			personlastname[a] = lastname;
			
			int itemsbought = scan.nextInt();
			
			
			
			// for loop that goes through the number of items (differs slightly from people)
			
			for(int z = 0; z < itemsbought; z++) {
				
				int quantity = scan.nextInt();	
				String nameofproduct = scan.next();
				
		// for loop goes through the number of items (6)
				
				for(int v = 0; v < numberofitems; v++) {
		
		// if the product contains the name of product then the array of quantity of 
		// items bought changes as well as the quantity of persons
					
					if(products[v].equals(nameofproduct)) {
						quantityofitemsbought[v] += quantity;
						quantityofpersons[v] += 1;
					}
					
					
				}
				
			
			}
			 
			
			
		}
		
		for(int y = 0; y < numberofitems; y++) {
			if(quantityofitemsbought[y] == 0 ) {
				System.out.println("No" + " " + "customers bought " + products[y]);
			} else {
		
			System.out.println(quantityofpersons[y] + " " + "customers bought " + quantityofitemsbought[y] + " " + products[y]);
			
		}
		}
		
		
	scan.close();
		
	
		
	
	
	}
		
	}

