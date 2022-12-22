package demo.v6;



public class PayPackDetails 
{
    private double basicSalary = 500000d;
    private double incentive = 50000d;
 
    public double getSalary() {
        return getBasicSalary()+getIncentive();
    }
 
    public double getBasicSalary() {
        return basicSalary;
    }
 
    public double getIncentive() {
        return incentive;
    }
 
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
 
    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }


    public PayPackDetails(PayPackDetails details){
        basicSalary = details.getBasicSalary();
        incentive = details.getIncentive();
    }
 
 

    public PayPackDetails() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Employee employee1 = new Employee("Ram","1",new PayPackDetails());
        employee1.print();
        Employee employee2 = new Employee(employee1);
        employee2.print();
    }
}