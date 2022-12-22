package demo.v3;



public class PayPackDetails{
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


    public PayPackDetails clone() throws CloneNotSupportedException {
        return (PayPackDetails)super.clone();
    }
    
 

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee("Ram","1",new PayPackDetails());
        Employee employee2 = employee1.clone();
        employee2.setName("Krish"); employee2.setIdentifier("2");
        employee2.getPackDetails().setBasicSalary(700000d);
        employee1.print();
        employee2.print();
    }
}