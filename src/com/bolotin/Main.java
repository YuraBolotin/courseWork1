package com.bolotin;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
	// write your code here

        employees[2] = new Employee("Иванов Иван Иванович", 1, 125356.45);
        employees[5] = new Employee("Петров Петр Петрович", 2, 135356.45);
        employees[6] = new Employee("Иванов Александр Иванович", 3, 135000.45);
        employees[7] = new Employee("Петров Петр Петрович", 4, 145356.45);
        employees[8] = new Employee("Петров Иван Петрович", 5, 135356.35);
        employees[9] = new Employee("Петров Иван Иванович", 6, 135100.45);
       listOfEmployees();
        System.out.println("Сумма зарплат за месяц " + totalSalary());
        System.out.println(employeeMinSalary());
        System.out.println(employeeMaxSalary());
        System.out.println("Средняя зарплата " + avgSalary());
        fioEmpoyee();
    }
    public static void listOfEmployees() {
        for (Employee employee : employees) {
           if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double totalSalary() {
       double result = 0;
        for (Employee employee: employees){
            if (employee != null) {

               result += employee.getSalary();

            }
        }
        return result;
        }

    public static Employee employeeMinSalary() {
       Employee minSalary = null;
        for (Employee employee: employees){
            if (employee != null)  {
                if (minSalary == null || employee.getSalary() < minSalary.getSalary()) {
                    minSalary = employee;
                }

             }
       }
        return minSalary;
        }
    public static Employee employeeMaxSalary() {
        Employee maxSalary = null;
        for (Employee employee: employees){
            if (employee != null)  {
                if (maxSalary == null || employee.getSalary() > maxSalary.getSalary()) {
                    maxSalary = employee;
                }

            }
        }
        return maxSalary;
    }

    public static double checkCountEmployee() {
        int count = 0;
        for (Employee employee: employees){
            if (employee != null) {
                count++;
            }
        }
        return count;
    }
    public static double avgSalary() {

            return totalSalary()/checkCountEmployee();
    }
    public static void fioEmpoyee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFio());
            }
        }

    }
}


