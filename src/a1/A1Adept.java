package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numberofitems = scan.nextInt();
		
		String[] products = new String[numberofitems];
		
		double[] price = new double[numberofitems];
		
		
		
		
		
		for(int i = 0; i < products.length; i++) {
			products[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
		int numberofpeople = scan.nextInt();
		
		String[] personfirstname = new String[numberofpeople];
		
		String[] personlastname = new String[numberofpeople];
		
		double[] thearraythateachcustomerspends = new double[numberofpeople];
		
		
 		
		for(int a = 0; a < numberofpeople; a++) {
			
			String firstname = scan.next();
			String lastname = scan.next();
			
			personfirstname[a] = firstname;
			personlastname[a] = lastname;
			
			double total = 0.0;
			
			
			int itemsbought = scan.nextInt();
			for(int c = 0; c < itemsbought; c++) {
				int quantity = scan.nextInt();
				
				String productbeingbought = scan.next();
				
				
				for(int d = 0; d < products.length; d++) {
					if(products[d].equals(productbeingbought)) {
						total += quantity * price[d];
						
					}
				}
				
			
				
			}
			
			thearraythateachcustomerspends[a] = total;
		 
		 
		 
			
			
		}  
		
		for(int e = 0; e < thearraythateachcustomerspends.length; e++) {
			System.out.println(thearraythateachcustomerspends[e]);
		}
		
		
		
		double totalofprices = 0;
		double average = 0;
		
		for(int w = 0; w < thearraythateachcustomerspends.length; w++) {
			totalofprices += thearraythateachcustomerspends[w];
			average = totalofprices / thearraythateachcustomerspends.length;
		}
		
		
		double cur_max = 0;
		double cur_min = 0;
		int indexinwhichcurrentminexists = 0;
		int indexinwhichcurrentmaxexists = 0;
		
		
		for(int z = 1; z < thearraythateachcustomerspends.length; z++) {
		//	cur_max = thearraythateachcustomerspends[0];
			if(thearraythateachcustomerspends[z] > cur_max) {
				cur_max = thearraythateachcustomerspends[z];
				indexinwhichcurrentmaxexists = z;
			}
		}
		
		for(int y = 0; y < thearraythateachcustomerspends.length; y++) {
			if(y == 0) {
				cur_min = thearraythateachcustomerspends[0];
			}
		//	cur_min = thearraythateachcustomerspends[0];
				if (thearraythateachcustomerspends[y] < cur_min) {
					cur_min = thearraythateachcustomerspends[y];
					indexinwhichcurrentminexists = y;
					
				}
				
		}
		
		System.out.println("Biggest: " + personfirstname[indexinwhichcurrentmaxexists] + " " + personlastname[indexinwhichcurrentmaxexists] + " " + "(" + String.format("%.02f", cur_max) + ")");
		System.out.println("Smallest: " + personfirstname[indexinwhichcurrentminexists] + " " + personlastname[indexinwhichcurrentminexists] + " " + "(" + String.format("%.02f", cur_min) + ")");
		System.out.println("Average: " + String.format("%.02f", average));	
		scan.close();
		
	}
		
		
		
		
	}
		
			
