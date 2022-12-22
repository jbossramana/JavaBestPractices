package demo.v2.serialization.solution;

import java.io.Serializable;

class Singleton implements Serializable {
	 
    // public instance initialized when loading the class
    public static Singleton instance = new Singleton();
 
    private Singleton()
    {
        // private constructor
    }
 
    // implement readResolve method
    //By implementing the readResolve method, a class can directly control the types and instances 
    // of its own instances being deserialized
    
    protected Object readResolve() { return instance; }
}
