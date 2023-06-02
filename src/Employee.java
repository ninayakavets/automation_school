
public class Employee {
    private String name;
    private String surname;
    private String role;
    private int age;
    private int salary;

    public Employee(String name, String surname, String role, int salary) {
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

    public String getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getName() + " "+ getSurname();
    }

    public void printEmpoyeeInfo(){
        System.out.println("EmployeeInfo:");
        System.out.println("Name: " + getName());
        System.out.println("Surname:" + getSurname());
        System.out.println("Role:" + getRole());
        System.out.println("Salary:" + getSalary()+"\n");

    }
}


