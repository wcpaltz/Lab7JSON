package Json;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String department;
	private String phoneNumber;
	
	public Employee(String first, String last, String dept, String num){
		firstName = first;
		lastName = last;
		department = dept;
		phoneNumber = num;
	}
	
	public String toString(){
		return (lastName+", " + firstName+ " "+ phoneNumber + " " + department);
	}

}
