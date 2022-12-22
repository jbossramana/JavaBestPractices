package demo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 Account account = ctx.getBean(Account.class);
		 System.out.println("Balance :" + account.getAmount());
		 
		 Account account2 = ctx.getBean(Account.class);
		 
		 if(account==account2)
			 System.out.println("Equal");

		 
		}

}
