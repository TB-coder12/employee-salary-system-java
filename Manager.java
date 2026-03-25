class Manager extends Employee {
    Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;
    }
    @Override
    void calculateTransportAllowance() {
        double transportAllowance = (15 * basicSalary) / 100;
        System.out.println("Transport Allowance of Manager " + employeeName + " = " + transportAllowance);
    }
}
