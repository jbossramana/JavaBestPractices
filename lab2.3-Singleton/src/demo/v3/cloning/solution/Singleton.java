package demo.v3.cloning.solution;

//Singleton class
class Singleton extends SuperClass {

 // public instance initialized when loading the class
 public static Singleton instance = new Singleton();

 private Singleton()
 {
     // private constructor
 }

 @Override
 protected Object clone()
     throws CloneNotSupportedException
 {
	 // throw new CloneNotSupportedException();
     return instance;
 }
}