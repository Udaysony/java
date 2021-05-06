package imcs.cls;

import java.util.Objects;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	
	public Employee(String firstName, String lastName, int age, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Employee getEmployee() {
		return this;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee e = (Employee)o;
		return Objects.equals(firstName, e.firstName) && Objects.equals(lastName, e.lastName) && Objects.equals(age, e.age)
				&& Objects.equals(gender, e.gender);
	}
	
	@Override
	public String toString() {
		return "Employee{firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ "}";
	}
}
