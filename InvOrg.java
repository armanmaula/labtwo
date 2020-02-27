package labTwo;

public class InvOrg {
	protected String name;
	protected double price;
	protected int id;


	public InvOrg (String InvName, double InvPrice, int InvID){
		name = InvName;
		price = InvPrice;
		id = InvID;
	}
	
	// Set name
	public void setName (String InvName) {
		name = InvName;
	}
	
	// Get name
	public String getName() {
		return name;
	}
	
	// Set price
	public void setprice (double InvPrice) {
		price = InvPrice;
	}
	
	// Get price
	public double getPrice() {
		return price;
	}
	
	// Set ID
	public void setID (int InvID) {
		id = InvID;
	}
	
	// Get ID
	public int getID() {
		return id;
	}
	
	
}
