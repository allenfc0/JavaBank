package Person;

/*
 * @author: Allen Farias Chavez
 * Date: 3/4/23
 * Description: this Bank account class is the parent class to other types of Bank Accounts
 */
public abstract class Person {
	
	private String firstName;
	private String lastName;
	//bDay will have a Type Change
	private String bDay;
	
	public Person(String firstName, String lastName, String bDay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bDay = bDay;
	}
	
	//first name methods
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//last name methods
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//b day methods
	public String getBDay() {
		return this.bDay;
	}

	public void setBDay(String bDay) {
		this.bDay = bDay;
	}



	//need to be implemented by child classes
	public abstract String toString();
	
}
