package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExampleOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> listA = new ArrayList<>();
		
		listA.add("Nimesh");
		listA.add("Rohit");
		listA.add("wasim");
		
		
		
		ArrayList<String> listB = new ArrayList<>();
		
		listB.add("Om");
		listB.add("Nimesh");
		listB.add("Sahil");
		listB.add("Adi");
		listB.add("Shiv");
		
		
		
		//Map - > traverse each element and convert one object to another
		List<Integer> square =  Arrays.asList(1,2,3,4,5,6);
		square.stream().map(number -> number * number).forEach(System.out::println); 
  
 
		
		//remove common
		listA.stream().distinct().forEach(System.out::println);
		
		//find one element exist or not
		List<String> findOne = listA.stream().filter(e -> e.contains("Nimesh")).collect(Collectors.toList());
		System.out.println(findOne);
		
		//reversed
		Collections.reverse(listA);
		System.out.println(listA);
		
		
		//count
		long count =listA.stream().count();
		System.out.println(count);
		
		
		//find common between two list
		List<String> duplicate = listB.stream().filter(listA::contains).toList();
		
		System.out.println(duplicate);
		
		
		
		int product = IntStream.range(2, 8) 
                .reduce((num1, num2) -> num1 * num2) 
                .orElse(-1); 
		
	
		 
		
		
		
		
		
		
		
		

	}

}
