import roles.Role;

public class Employee {
    private String name;
    private String surname;
    private Role role;
    private int salary;

    public Employee(String name, String surname, Role role, int salary) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Role getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    public void increaseSalary(int raiseAmount) {
        if (raiseAmount <= 0) {
            throw new RuntimeException("Can not decrease salary, ha-ha-ha");
        }
        salary += raiseAmount;
    }


    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

    public void printEmployeeInfo() {
        System.out.println("EmployeeInfo:");
        System.out.println("Name: " + getName());
        System.out.println("Surname:" + getSurname());
        System.out.println("Role:" + getRole().getRoleInfo());
        System.out.println("Salary:" + getSalary() + "\n");

    }
}


