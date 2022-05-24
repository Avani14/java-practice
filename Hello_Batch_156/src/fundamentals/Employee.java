package fundamentals;

public class Employee {
	String name = new String();
	int empCode;
	int phoneNumber;
	int workingHours;
	String address = new String();
	
	public static void main(String[] args)
	{
		Employee fullTime = new Employee();
		fullTime.workingHours = 8;
		Employee partTime = new Employee();
		partTime.workingHours = 4;
 		Employee intern = new Employee();
 		intern.workingHours=4;
 		System.out.println(fullTime.workingHours);
	}
}
