package Bai2;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
   public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void addBonus(double bonus){
        this.salary += bonus;
        System.out.println("Them tien thuong cho nhan vien" + name + " : " + bonus);
    }

    public void addBonus(Employee[] employees, double bonus){
        System.out.println("Them tien cho nhom nhan vien" + bonus);
        for (Employee employee : employees) {
            employee.salary += bonus;
            System.out.println("Them tien thuong cho nhan vien" + employee.name );
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}