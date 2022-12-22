package demo.v1;



public class Employee implements Cloneable{
    private String name;
    private String identifier;
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
 
    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }
 
    public void print() {
        System.out.println("Name :"+name+"\n"+"Identifier:"+identifier);
    }
 
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee();
        employee1.setName("Ram");
        employee1.setIdentifier("1");
        System.out.println("1: "+employee1);
        employee1.print();
 
        Employee employee2 = employee1.clone();
        System.out.println("2: "+employee2);
        employee2.print();
    }
}
