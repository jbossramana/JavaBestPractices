package demo.v3.cloning.solution;

//Java code to explain overcome
//cloning issue with singleton

class SuperClass implements Cloneable {
 int i = 10;

 @Override
 protected Object clone()
     throws CloneNotSupportedException
 {
     return super.clone();
 }
}
