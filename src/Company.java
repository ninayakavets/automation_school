import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }


    public String getName(){
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printCompanyInfo(){
        System.out.println("Company name:" + getName());
        System.out.println("Emproyees" + getEmployees());
    }
}
