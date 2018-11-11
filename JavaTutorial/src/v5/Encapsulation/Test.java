package v5.Encapsulation;

public class Test {
	public static void main(String[] args) {

		Person createdPerson = CreatePerson();
		callPerson(createdPerson);
	}

	/**
	 * @param createdPerson
	 */
	private static void callPerson(Person createdPerson) {
		System.out.println(
				"Name : " + createdPerson.getName() + "\nAge : " + createdPerson.getAge() + "\nYear : " + createdPerson.getYear() + "\nSalary : " + createdPerson.getSalary());

	}

	private static Person CreatePerson() {
		Person person = new Person();
		person.setAge(25);
		person.setName("Onur");
		person.setSalary(25000);
		return person;
	}
}
