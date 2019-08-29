package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberofitems = scan.nextInt();
		
		String[] products = new String[numberofitems];
		double[] priceofproducts = new double[numberofitems];
		
		for(int i = 0; i < numberofitems; i++) {
			products[i] = scan.next();
			priceofproducts[i] = scan.nextDouble();
		}
		
		
		int numberofpeople = scan.nextInt();
		
		int quantity = 0;
		String product = "";

		String[] personfirstname = new String[numberofpeople];
		
		String[] personlastname = new String[numberofpeople];
		
		int[] quantityofitemsbought = new int[numberofitems];
		
		int[] quantityofpersons = new int[numberofitems];
		
		for(int a = 0; a < numberofpeople; a++) {
			String firstname = scan.next();
			String lastname = scan.next();
			
			personfirstname[a] = firstname;
			personlastname[a] = lastname;
			
			int itemsbought = scan.nextInt();
			boolean[] jack = new boolean[numberofitems];
			for(int z = 0; z < itemsbought; z++) {
				
				quantity = scan.nextInt();	
				product = scan.next();
				
				for(int v = 0; v < numberofitems; v++) {
					if(products[v].equals(product)) {
						quantityofitemsbought[v] += quantity;
						jack[v] = true;
					}
				}
			}
			
			for(int t = 0; t < jack.length; t++) {
				if(jack[t]) {
					quantityofpersons[t]++;
				}
			}
		}
		for(int y = 0; y < numberofitems; y++) {
			if(quantityofpersons[y] == 0 ) {
				System.out.println("No customers bought " + products[y]);
			} else {
		
			System.out.println(quantityofpersons[y] + " customers bought " + quantityofitemsbought[y] + " " + products[y]);
		}
			scan.close();
		}	
	}
	
}
		
	

