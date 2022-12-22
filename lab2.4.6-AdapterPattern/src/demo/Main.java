package demo;



/**
 * Implements the driver for the Adapter design pattern example. <p> 
 *
 * Intent: <i> Convert the interface of a class into another interface clients
 * expect. Adapter lets classes work together that couldn't otherwise because
 * incompatible interfaces.</i><p>
 *
 * Experimental setup: anloguous to the pattern structure as described on page
 * 141 of the "Design Patterns" book: 
 * 
 * <code>Adaptee</code> can print strings to <code>System.out</code>. 
 * <code>Adapter</code> allows to access <code>Adaptee</code>'s functionality
 * via <code>Target</code>'s interface.<p>  
 * 
 * <i>This is the Java implementation.</i><p>
 *
 * Participants and their roles: <ul>
 *   <LI> Main (Client)
 *   <LI> Writer (Target)
 *   <LI> SystemOutPrinter (Adaptee)
 *   <LI> PrinterAdapter (Adapter)
 * </ul>
 * 
 * The implementation is that of an <i>object adapter</i> (NOT class adapter),
 * as the latter requires multiple inheritance which Java does not provide. 
  */

public class Main { 
	
    /**
     * the Target in the scenario
     */
     	
	private static Writer myTarget; 

    /**
     * the Adaptee in the scenario
     */
     	
	private static SystemOutPrinter adaptee; 

    /**
     * Implements the driver.  
     * 
     * @param args required for a main method, but ignored
     */
     
	public static void main(String[] args) {

		System.out.println("Creating the Adaptee...");
		adaptee = new SystemOutPrinter();

	    System.out.println("Creating the Adapter...");
		myTarget = new PrinterAdapter(adaptee); 

		System.out.print  ("Adapter and Adaptee are the same object: ");
		System.out.println(myTarget.equals(adaptee));

		System.out.println("Issuing the request() to the Adapter...");
		myTarget.write("Test successful."); 
		
	}
}