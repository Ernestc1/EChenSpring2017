
public class Ticket {
	private int number;
	private double price;
	public Ticket(int n){
		n = number;
	}
	public void setPrice(){
		price = 50.0;
	}
	public double getPrice(){
		setPrice();
		return price;
	}
	public String toString(){
		return("Number: " + number + "," + " Price: $" + price);
	}
}
