package demo.v2.serialization;

import java.io.Serializable;

class Singleton implements Serializable {
	 
    // public instance initialized
    // when loading the class
    public static Singleton instance = new Singleton();
 
    private Singleton()
    {
        // private constructor
    }
}