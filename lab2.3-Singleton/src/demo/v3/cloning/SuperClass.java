package demo.v3.cloning;

//Java code to explain cloning
//issue with singleton

class SuperClass implements Cloneable {

 int i = 10;

 @Override
 protected Object clone()
     throws CloneNotSupportedException
 {
     return super.clone();
 }
}
