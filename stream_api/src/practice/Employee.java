package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private String gender;

    public Employee(int id, String name, String department, double salary, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return name + " (" + department + ", " + salary + ")";
    }
    
    public static void main(String args[]) {
    	List<Employee> employees = Arrays.asList(
        	    new Employee(1, "Murali", "IT", 75000, 28, "Male"),
        	    new Employee(2, "Anu", "HR", 50000, 26, "Female"),
        	    new Employee(3, "Kumar", "Finance", 60000, 35, "Male"),
        	    new Employee(4, "Arun", "IT", 90000, 32, "Male"),
        	    new Employee(5, "Vijay", "HR", 48000, 25, "Male"),
        	    new Employee(6, "Priya", "Finance", 62000, 30, "Female"),
        	    new Employee(7, "Mohan", "IT", 95000, 40, "Male")
        	);
    	practice(employees);
    }
    
    public static void practice(List<Employee> emps) {
    	List<Employee> itEmployees = emps.stream().filter(a -> a.getDepartment().equalsIgnoreCase("IT")).toList();   
      //  itEmployees.forEach(System.out::println);
        
        List<Employee> salGreater = emps.stream().filter(a -> a.salary>90000).toList();
      //  salGreater.forEach(System.out::println);
        
        
        List<Employee> thenComparingEx = emps.stream()
        		.sorted(Comparator.comparing(Employee::getName)
        				.thenComparing(Employee::getSalary).reversed()) // Desc Salary
        		.toList();
      //  thenComparingEx.forEach(System.out::println);
    
        int n = 3;
        Employee secHighSal = emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
        		.skip(1) // n-1 --> To find Nth
        		.findFirst().get();
      //  System.out.println(secHighSal);
    
        Map<String, Long> groupByDept = emps.stream()
        		.collect(Collectors.groupingBy(d  -> d.getDepartment(), Collectors.counting()));
        System.out.println(groupByDept);
        
// Find the highest paid employee in each department.
        Map<String, Optional<Employee>> highestByDept = emps.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment, 
        				Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(highestByDept);
    }
    
}

