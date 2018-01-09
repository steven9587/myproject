package customer;

import java.util.ArrayList;

public class Texter {

	public static void main(String[] args) {
		
		/*ArrayList<Customer> customers = new ArrayList();
		Customer c1 = new Customer(10000);
		SilverCustomer c2 = new SilverCustomer(10000);
		GlodenCustomer c3 = new GlodenCustomer(10000);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		
		for (int i=0;i<customers.size();i++){
			Customer c = customers.get(i);
			c.print();
		}
		
		
		ArrayList<Integer> list = new ArrayList();
		list.add(94);
		list.add(87);
		list.add(55);
		list.add(4); 
		int n = list.get(2);
		int n2 = list.get(3);
		
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		*/
		Customer c1 = new Customer(1000);
		SilverCustomer c2 = new SilverCustomer(1000);
		GlodenCustomer c3 = new GlodenCustomer(1000);
		c1.print();
		c2.print();
		c3.print();
	}

}
