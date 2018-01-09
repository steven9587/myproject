package ticket;

public class Ticket {
	String date;
	String time;
	String startlocation;
	String finallocation;
	int cost;
	
	public Ticket(String date,String time,String startlocation,String finallocation,int cost){
		this.date =date;
		this.time=time;
		this.startlocation=startlocation;
		this.finallocation=finallocation;
		this.cost=cost;
	}
	
	public void print() {
		System.out.println(date + "\t" + time + "\t" + startlocation+ "\t" +finallocation+ "\t" +cost);
	}
	
}
