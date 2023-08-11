package lambda_expressions_with_collections;

public class Employee {
	
	int eNo;
	String eName;
	
	public Employee(int eNo , String eName)
	{
		this.eNo=eNo;
		this.eName=eName;
	}

	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + "]";
	}
	
	

}
