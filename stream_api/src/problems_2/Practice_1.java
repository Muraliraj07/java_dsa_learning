package problems_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice_1 {
	
	public static void main (String args[]) {
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, "Murali", "IT", "Chennai", 60000L));
        empList.add(new Employee(2, "Arun", "HR", "Bangalore", 45000L));
        empList.add(new Employee(3, "Priya", "Finance", "Chennai", 70000L));
        empList.add(new Employee(4, "Karthik", "IT", "Hyderabad", 80000L));
        empList.add(new Employee(5, "Kavya", "HR", "Bangalore", 50000L));
        empList.add(new Employee(6, "Suresh", "IT", "Chennai", 90000L));

//		groupByCity(empList);
		
//      getTopThreeSalByDept(empList);
        
        getTopThreeEmpBySal(empList);
	}

	/*
	 *  Group By City
	*/	
	public static void groupByCity(List<Employee> empList) {
		
		Map<String, List<Employee>> groupByCity = empList.stream()
				.collect(Collectors.groupingBy(Employee::getCity));
		
		groupByCity.entrySet().stream().forEach(System.out::println);
		
		groupByCity.forEach((city, employee) -> {
			System.out.println(city + " -> " + employee);
		});
	}
	
	/*
	 *  Get Top 3 Salary by Dept
	*/
	
	// collectingAndThen - It allows post-processing of the grouped result
	public static void getTopThreeSalByDept(List<Employee> empList) {
		Map<String, List<Long>> getTopThreeSal = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, 
						Collectors.collectingAndThen(Collectors.mapping(Employee::getSalary, Collectors.toList()),
								list -> list.stream()
								.sorted(Comparator.reverseOrder())
								.limit(3)
								.toList())));
		//Option 1
		// if want to block lambda, it need to return the value
		getTopThreeSal.forEach((dept, city) -> {
			System.out.println(dept +  " -> " + city);
		});
		
		//Option 2
		getTopThreeSal.forEach((dept, city) -> 
			System.out.println(dept +  " -> " + city)
		);
	}
	
	/*
	 *  Get Top 3 High Salary Employee by Dept
	*/
	public static void getTopThreeEmpBySal(List<Employee> empList) {
		Map<String, List<Employee>> getTopThreeEmpBySal = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, 
						Collectors.collectingAndThen(
								Collectors.toList(), 
								list -> list.stream()
								.sorted(Comparator.comparing(Employee::getSalary)
										.reversed())
								.limit(3)
								.toList())));
		
		getTopThreeEmpBySal.forEach((dept, emp) -> {
			System.out.println(dept  + " -> " + emp);
		});
		
		Map<String, List<Employee>> result =
		        empList.stream()
		               .collect(Collectors.groupingBy(Employee::getDept));
		
		result.replaceAll((dept, emp) -> {
			return emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
			.limit(3).toList();
		});
	}
	
	/*
	 *  Get High Salary Employee
	*/
	public static void highSalaryEmployee(List<Employee> empList) {
		Employee emp = empList.stream()
				.max(Comparator.comparingLong(Employee::getSalary))
				.orElse(null);
		System.out.println(emp);
	}
	
	/*
	 *  Get Second Highest Salary
	*/
	public static void secHighestEmployee(List<Employee> empList) {
		Employee emp = empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(1)
				.findFirst()
				.orElse(null);
		System.out.println(emp);
	}
	
}
