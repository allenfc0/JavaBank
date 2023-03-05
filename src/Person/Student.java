package Person;

public class Student extends Person {

	
	public Student(String firstName, String lastName, String birthDay) {
		super(firstName,lastName,birthDay);
	}

	@Override
	public String toString() {
		return String.format("Name: %s %s. Birth Day: %s", getFirstName(), getLastName(), getBDay());
	}
	
}
