package in.sankarvinoth;

import java.util.HashMap;
import java.util.Set;

public class ProductsList {

	static HashMap<Integer, String> order = new HashMap<Integer, String>();

	static {
		// List of products to be displayed
		order.put(1, "\t1: Air Conditioner");
		order.put(2, "\t2 :Washing Machine");
		order.put(3, "\t3 :Refrigerator");
		order.put(4, "\t4 :Induction Stove");
		order.put(5, "\t5 :vacuum Cleaner");
		order.put(6, "\t6 :Camera");
		order.put(7, "\t7 :Microwave Oven");
		order.put(8, "\t8 :Water Purifier");
		order.put(9, "\t9 :Television");
		order.put(10,"\t10:Mixer Grinder");
	}
	/**
	 * method to Display all the available products with its serial number
	 * 
	 */
	public static void display() {
		System.out.println("\t ****************************");
		System.out.println("\t List of Our Products");
		System.out.println("\t ****************************");
		Set<Integer> keySet = order.keySet(); // getting values with respective to keys
		for (Integer Key : keySet) {
			String value = order.get(Key); // Logic for printing keys
			System.out.println( value);
			}
         }
	}
