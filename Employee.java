 class Emp{
    private double salary;
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
public class Employee{
    public static void main(String[] args) {
        Emp e=new Emp();
        e.setSalary(10000);
        System.out.println("employee salary: "+e.getSalary());
    }
}
