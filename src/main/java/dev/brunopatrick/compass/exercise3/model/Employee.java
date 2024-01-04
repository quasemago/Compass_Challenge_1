package dev.brunopatrick.compass.exercise3.model;

public class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return Bonus or discount value.
     */
    public Double calculateBonusOrDiscount() {
        final double salary = this.getSalary();
        if (salary <= 1000.00) {
            return salary * 0.2;
        } else {
            return salary * 0.1;
        }
    }

    /**
     * @return Net salary value.
     */
    public Double calculateNetSalary(Double salary, Double bonusOrDiscount) {
        if (this.shouldReceiveBonus()) {
            return salary + bonusOrDiscount;
        } else {
            return salary - bonusOrDiscount;
        }
    }

    /**
     * @return True if the employee is entitled to receive a bonus, false otherwise.
     */
    public Boolean shouldReceiveBonus() {
        return this.getSalary() < 2000.00;
    }
}
