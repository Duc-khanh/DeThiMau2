package DeNangCao.cau1;

import DeNangCao.cau1.Employee;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 1.5;
    }
}
