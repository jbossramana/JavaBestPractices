package demo.singleton;

// Lazy initialization, non-thread-safe:
public class Singleton {
	
    private static Singleton instance = null;
    
    public static Singleton Instance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    private Singleton() {}
    
}