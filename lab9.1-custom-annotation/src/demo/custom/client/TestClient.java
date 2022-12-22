package demo.custom.client;

import demo.custom.annotations.ObjectToJsonConverter;
import demo.custom.annotations.Person;

public class TestClient {

	public static void main(String[] args) {


		 Person person = new Person("ramana", "venkat", "50");
		 person.setAddress("Hyderabad");
		    ObjectToJsonConverter serializer = new ObjectToJsonConverter(); 
		    String jsonString = serializer.convertToJson(person);
		    
		    System.out.println(jsonString);
	}

}
