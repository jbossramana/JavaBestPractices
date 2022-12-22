package demo.v3;

public class Employee implements Cloneable {
	 
    private String name;
    private String identifier;
    private PayPackDetails packDetails;
 
    public Employee(String name, String identifier, PayPackDetails packDetails) {
        this.name = name;
        this.identifier = identifier;
        this.packDetails = packDetails;
    }
 
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
    public PayPackDetails getPackDetails() {
        return packDetails;
    }
 
    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }
 
    public void print() {
        System.out.println("id:"+ identifier +"\n"+ "name:"+ name+ "\n" + "package:"+ packDetails.getSalary());
    }
}