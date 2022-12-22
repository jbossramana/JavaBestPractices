package demo;



/**
 * Represents an <i>Object Adapter</i>. Implements the <i>Target</i> interface
 * and stores a private variable of type <i>Adaptee</i> (here: <code>
 * SystemOutWriter</code>) to which it forwards appropriate method calls. <p>
 * 
 * It is not possible to use a class adapter in Java as it requires multiple
 * inheritance. 
  */
 
public class PrinterAdapter implements Writer { 
    
    /**
     * the adaptee to forward appropriate messages to.
     */
     
	private SystemOutPrinter adaptee = null;


    /**
     * Creates a new Adapter for a given Adaptee.
     *
     * @param screen the screen to adapt
     */

    public PrinterAdapter(SystemOutPrinter adaptee) {
        this.adaptee = adaptee;
    }
	
	/**
	 * Implements the <i>Target</i> interface. This is where the actual
	 * adaption happens: calls to write(String) trigger calls
	 * to printToSystemOut(String) on the adaptee.
     *
     * @param s the string to print
     * @see Writer#write(String)
     * @see SystemOutPrinter#printToSystemOut(String)
	 */
	
	public void write(String s) {
		adaptee.printToSystemOut(s);
	}
}