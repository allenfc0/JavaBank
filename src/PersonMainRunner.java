import Person.Person;
import Person.Student;

public class PersonMainRunner {
	public static void main(String[] args) {
		//Change the Account type to something other than a String type
		Person p1 = new Student("Allen", "Farias", "4-27-2001");
		
		System.out.printf("%s", p1);
		
	}
}
