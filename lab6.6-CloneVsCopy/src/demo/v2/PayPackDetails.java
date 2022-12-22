package demo.v2;

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

 

 
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee("Ram","1",new PayPackDetails());
        System.out.println("1: "+employee1);
        employee1.print();
 
        Employee employee2 = employee1.clone();
        System.out.println("2: "+employee2);
        employee2.print();
    }
}