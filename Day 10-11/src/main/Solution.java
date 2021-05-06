package imcs.assignment.day10_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import imcs.cls.Product;
import imcs.cls.Employee;

public class Solution {

	// 1
	static double getFilteredAverage(List<Product> products) {
		return products.stream().filter(p -> p.getPrice()<4).mapToDouble(p -> p.getPrice()).average().orElse(0);
	}

	//2
	@FunctionalInterface
	interface CustomComparator<T>{
		int customCompare(T obj1, T obj2);
	}

	//3
	static Set<Employee> filterCollectEmployee(List<Employee> employees){
		Set<String> set = new HashSet<>();
		return employees.stream().filter(e -> e.getLastName().equals("Williams") && set.add(e.getFirstName()))
				.sorted((e1,e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
				.collect(Collectors.toSet());
	}

	//4
	static int[] getMinMaxStream(int[] arr) {
		IntSummaryStatistics stats =  Arrays.stream(arr).summaryStatistics();
		return new int[] {stats.getMin(),stats.getMax()};
	}

	static int[] getMinMax(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int x : arr) {
			min = (x<min)?x:min;
			max = (x>max)?x:max;
		}
		
		return new int[] {min,max};
	}

	//5
	static Map<Integer, Employee> getAgeMap(){
		Path path = Paths.get("D:\\Eclipse Workspace\\imcs\\data\\employees.txt");
		
		try {
			return Files.lines(path).map(s -> new Employee(s.split(" ")[0],s.split(" ")[1],Integer.parseInt(s.split(" ")[2]),s.split(" ")[3]))
				.collect(Collectors.toMap(Employee::getAge, Employee::getEmployee));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	static Map<String,List<Employee>> getDistinctGenderMap(){
		Path path = Paths.get("D:\\Eclipse Workspace\\imcs\\data\\employees.txt");
		
		try {
			return Files.lines(path).map(s -> new Employee(s.split(" ")[0],s.split(" ")[1],Integer.parseInt(s.split(" ")[2]),s.split(" ")[3]))
				.collect(Collectors.groupingBy(Employee::getGender));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
				new Product("p1",3.99),
				new Product("p2",2.99),
				new Product("p3",8.99),
				new Product("p4",0.99));
		System.out.println("Average of products with price less than 3: " + getFilteredAverage(products));
		System.out.println();
		
		List<Employee> employees = Arrays.asList(
				new Employee("John","Smith",25,"M"),
				new Employee("Alex","Williams",21,"M"),
				new Employee("Michell","Williams",29,"F"),
				new Employee("Alex","Williams",21,"M"));
		System.out.println("Custom filtered and sorted set of Employee list: " + filterCollectEmployee(employees));
		System.out.println();
		
		int[] arr = {-20,0,10,50,3};
		System.out.println("MinMax in arr using Stream [min,max]: " + Arrays.toString(getMinMaxStream(arr)));
		System.out.println("MinMax in arr without using Stream [min,max]: " + Arrays.toString(getMinMax(arr)));
		System.out.println();
		
		System.out.println("Get Employee Map by Age:\n" +  getAgeMap());
		System.out.println();
		System.out.println("Get Employee Distinct Map by Gender:\n" + getDistinctGenderMap());
	}

}