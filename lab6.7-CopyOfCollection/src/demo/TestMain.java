package demo;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	
	public static void main(String args[])

	{
		List<String>names = new ArrayList<String>(); 
		
		names.add("name1");
		names.add("name2");
		
		List<String> copyOfNames = List.copyOf(names);
		doNotChange(copyOfNames);
	}
	
	
	public static void doNotChange(List<String> names)
	{
		names.add("name3");
		System.out.println(names);
	}
}
