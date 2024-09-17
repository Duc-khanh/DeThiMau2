package DeNangCao.cau1;

import DeNangCao.cau1.Employee;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Nguyen van A", 1000);
        Employee employee1 = new Employee("Nguyen van B", 2000);
        Employee employee2 = new Employee("Nguyen van C", 3000);

        Employee[] employees = new Employee[]{ employee1, employee2};
        employee.addBonus( 1000);
        System.out.println("Nhan vien cu the:    " + employee.toString());
        employee1.addBonus(employees , 1000);
        for (Employee employee3 : employees) {
            System.out.println(employee3.toString());
        }

    }
}
