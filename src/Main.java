import roles.Dev;
import roles.QA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee ninaY = new Employee("Nina", "Yakavets", new QA(2), 5000);
        Employee johnS = new Employee("John", "Snow", new Dev(4), 50000);

        ninaY.printEmployeeInfo();
        johnS.printEmployeeInfo();

        Company myCompany = new Company("Playtika");

        myCompany.addEmployee(ninaY);
        myCompany.addEmployee(johnS);
        myCompany.printCompanyInfo();

        String str;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nDo you want to increase salary? yes/no?: ");
            str = scanner.nextLine();
            if (str.equalsIgnoreCase("yes")) {
                System.out.println("Enter how much raise you want: ");
                int raise = scanner.nextInt();
                String tempString = scanner.nextLine(); // to fix problem with nextInt and Enter symbol
                try {
                    ninaY.increaseSalary(raise);
                    System.out.println("Your new salary is: " + ninaY.getSalary());
                } catch (RuntimeException e) {
                    System.out.println("Salary increase failed, reason:" + e.getMessage());
                }
            }
        } while (!str.equalsIgnoreCase("no"));

    }

}
