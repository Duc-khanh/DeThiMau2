package DeNangCao.cau1;

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
    public double  calculateSalary(){
        return salary;
    }

    public void addBonus(double bonus) {
        this.salary += bonus;


    }
    public void addBonus(Employee[] employees, int bonus) {

        for (Employee employee : employees) {
            employee.salary += bonus;

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
