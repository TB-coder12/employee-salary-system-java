class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;
    Employee(long id, String name, String address, long phone) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
    }
    void calculateSalary() {
        double salary = basicSalary
                + (basicSalary * specialAllowance / 100)
                + (basicSalary * hra / 100);

        System.out.println("Salary of " + employeeName + " = " + salary);
    }
    void calculateTransportAllowance() {
        double transportAllowance = (10 * basicSalary) / 100;
        System.out.println("Transport Allowance of " + employeeName + " = " + transportAllowance);
    }
}
