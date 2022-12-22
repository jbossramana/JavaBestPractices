package demo.v6;

public class Employee  {
	 
    private String name;
    private String identifier;
    private final PayPackDetails packDetails;
 
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
 
    protected Employee(Employee emp) {
        name = emp.name;
        identifier = emp.identifier;
        packDetails = new PayPackDetails(emp.packDetails);
    }
 
 

    

 
    public void print() {
        System.out.println("id:"+ identifier +"\n"+ "name:"+ name+ "\n" + "package:"+ packDetails.getSalary());
    }
}