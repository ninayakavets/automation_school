
public class Main {
    public static void main(String[] args) {

        Employee ninaY = new Employee("Nina", "Yakavets","QA", 5000);
        Employee johnS = new Employee("John", "Snow","SEO", 50000);

        ninaY.printEmpoyeeInfo();
        johnS.printEmpoyeeInfo();

        Company myCompany = new Company("Playtika");

        myCompany.addEmployee(ninaY);
        myCompany.addEmployee(johnS);
        myCompany.printCompanyInfo();

    }
}