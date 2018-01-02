package customer;

public class GlodenCustomer extends SilverCustomer {

	public GlodenCustomer(int amount) {
		super(amount);
	}
	
	@Override
	public void print() {
		int total = (int)(amount*(1-discount));
		System.out.println(amount + "\t" + total +"\t"+"¬õ§Qª÷¬°¡G"+total);
		
	}

}
