package labTwo;

public class Department extends InvOrg {
	protected String department;

	public Department(String InvName, double InvPrice, int InvID, String InvDep) {
		super(InvName, InvPrice, InvID);
		department = InvDep;
		
	}

	public void setDep (String InvDep){
		department = InvDep;
	}
	
	public String getDep() {
		return department;
	}
	
	public void sentence() {
		System.out.print(name + " " + price + " " + id + " " + department);
	}
	
}
