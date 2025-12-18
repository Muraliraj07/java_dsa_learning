package problems_2;

public class Employee {

	public int id;
	
	public String name;

	public String dept;
	
	public String city;

	public long salary;
	
	public Employee(int id, String name, String dept, String city, long salary) {
		 this.id = id;
	     this.name = name;
	     this.dept = dept;
	     this.city = city;
	     this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", " + "Dept: " + dept + ", " + "City: " + city + ", "+ "Salary: " + salary ;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
