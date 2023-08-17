package predicate_samples;

import java.util.function.Predicate;

public class SoftwareEngineer {
	
	String name;
	
	int age;
	
	boolean isHavingGf;

	public SoftwareEngineer(String name, int age, boolean isHavingGf) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}

	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args)
	{
		SoftwareEngineer[] list = {
				new SoftwareEngineer("Raj", 20, false),
				new SoftwareEngineer("kumat", 22, false),
				new SoftwareEngineer("rajkumar", 24, true),
				new SoftwareEngineer("rathod", 24, true),
				new SoftwareEngineer("bunny", 21, false),
				new SoftwareEngineer("sunny", 18, true)
				
		};
		
		Predicate<SoftwareEngineer> isAllowed = se->se.age>18 && se.isHavingGf==true;
		System.out.println("The allowed members into the pub are as follows");
		
		for(SoftwareEngineer se : list)
		{
			if(isAllowed.test(se))
			{
				System.out.println(se);
			}
		}
	}

}
