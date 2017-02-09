
public class AdvanceTicket extends Ticket{
	private int daysBefore;
	public AdvanceTicket(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	public void setDaysBefore(){
		daysBefore = 10;
	}
	public double getPrice(){
		double price = super.getPrice();
		if (daysBefore >= 10){
			price -= 20;
		}else if(daysBefore < 10 && daysBefore > 0){
			price-= 10;
		}
		return(price);
	}

}
