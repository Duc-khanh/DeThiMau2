package DeNangCao.cau1;

import DeNangCao.cau1.Employee;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() ;
    }
}
