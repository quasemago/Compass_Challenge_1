package dev.brunopatrick.compass.exercise3.service;

import dev.brunopatrick.compass.exercise3.model.Employee;

public class EmployeeService {
    /**
     * @return Bonus or discount value.
     */
    public Double calculateBonusOrDiscount(Employee employee) {
        final double salary = employee.getSalary();
        if (salary <= 1000.00) {
            return salary * 0.2;
        } else {
            // For any other value above 1000.00,
            // the percentage used in the calculation is 10%,
            // so we don't need to worry about whether it is a bonus or discount.
            return salary * 0.1;
        }
    }

    /**
     * @return Net salary value.
     */
    public Double calculateNetSalary(Employee employee) {
        final double salary = employee.getSalary();
        final double bonusOrDiscount = calculateBonusOrDiscount(employee);

        if (shouldReceiveBonus(employee)) {
            return salary + bonusOrDiscount;
        } else {
            return salary - bonusOrDiscount;
        }
    }

    /**
     * @return True if the employee is entitled to receive a bonus, false otherwise.
     */
    public Boolean shouldReceiveBonus(Employee employee) {
        return employee.getSalary() < 2000.00;
    }
}
