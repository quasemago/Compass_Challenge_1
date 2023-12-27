package dev.brunopatrick.compass.exercise3;

import dev.brunopatrick.compass.exercise3.model.Employee;
import dev.brunopatrick.compass.exercise3.service.EmployeeService;

import java.util.*;

// Bonus Program.
public class Program3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe o número de funcionários: ");
            final int n = sc.nextInt();

            // Get employees data.
            System.out.println();
            final List<Employee> employeeList = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                sc.nextLine(); // clear buffer.
                System.out.println("Funcionário #" + (i));

                System.out.print("Informe o nome do funcionário: ");
                final String name = sc.nextLine();

                System.out.print("Informe o salário do funcionário: ");
                final double salary = sc.nextDouble();

                employeeList.add(new Employee(name, salary));
                System.out.println();
            }

            // Calculate bonus or discount.
            final EmployeeService employeeService = new EmployeeService();

            System.out.println("RELATÓRIO:");
            for (Employee employee : employeeList) {
                System.out.printf("Funcionário: %s%n", employee.getName());
                System.out.printf("Salário: R$ %.2f%n", employee.getSalary());

                // Check if bonus or discount.
                final double bonusOrDiscount = employeeService.calculateBonusOrDiscount(employee);
                if (employeeService.shouldReceiveBonus(employee)) {
                    System.out.printf("Bônus: R$ %.2f%n", bonusOrDiscount);
                } else {
                    System.out.printf("Desconto: R$ %.2f%n", bonusOrDiscount);
                }

                final double netSalary = employeeService.calculateNetSalary(employee);
                System.out.printf("Salário Líquido: R$ %.2f%n", netSalary);
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Informe os dados no formato correto.");
        }
    }
}
