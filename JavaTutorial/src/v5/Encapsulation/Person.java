package v5.Encapsulation;

public class Person {

	private String name;
	private Integer age;
	private Integer year;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		age = age<0? 0 : age;// kullanýþlý bir if condition
		setYear(2018-age);
		this.age = age;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
