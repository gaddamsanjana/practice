class Employee {
    void calculateSalary() {
        System.out.println("Employee salary is based on basic pay");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        double basicPay = 40000;
        double bonus = 10000;
        System.out.println("Manager salary: " + (basicPay + bonus));
    }
}

public class EmployeeOverriding {
    public static void main(String[] args) {
        Employee emp = new Manager();
        emp.calculateSalary();
    }
}
