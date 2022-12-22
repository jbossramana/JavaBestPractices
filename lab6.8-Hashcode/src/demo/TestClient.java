package demo;

import java.util.HashSet;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Account> accounts = new HashSet<Account>();
		
		
		Account acc = new Account();
		acc.setId(1);
		acc.setName("good");
		Account acc2 = new Account();
		acc2.setId(1);
		acc2.setName("good");
		
		accounts.add(acc);
		accounts.add(acc2);
		 
		for(Account test : accounts)
		System.out.println(test);
		
		System.out.println("Hashcode,acc1 :"+ acc.hashCode());
		System.out.println("Hashcode,acc2 :"+ acc2.hashCode());
		
		if(acc==acc2) System.out.println("same reference");
		if(acc.equals(acc2)) System.out.println("same content...");
	}
	

}
