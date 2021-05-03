package in.sankarvinoth;

import java.util.HashMap;
import java.util.Set;

public class Products {

	static HashMap<Integer, String> productList = new HashMap<Integer, String>();

	static {
		// List of products to be displayed
		productList.put(1, "1: Air Conditioner");
		productList.put(2, "2 :Washing Machine");
		productList.put(3, "3 :Refrigerator");
		productList.put(4, "4 :Induction Stove");
		productList.put(5, "5 :vacuum Cleaner");
		productList.put(6, "6 :Camera");   
		productList.put(7, "7 :Microwave Oven");
		productList.put(8, "8 :Water Purifier");
		productList.put(9, "9 :Television");
		productList.put(10,"10:Mixer Grinder");
	}
	/**
	 * method to Display all the available products with its serial number
	 * 
	 */
	public static void display() {
		System.out.println("\t ****************************");
		System.out.println("\t List of Our Products");
		System.out.println("\t ****************************");
		Set<Integer> keySet = productList.keySet(); // getting values with respective to keys
		for (Integer Key : keySet) {
			String value = productList.get(Key); // Logic for printing keys
			System.out.println( value);
			}
         }
	}
