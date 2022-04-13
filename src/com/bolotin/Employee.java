package com.bolotin;

public class Employee {
        private String fio;
        private int department;
        private double salary;
        private int id;
        private static int nextId;

        public Employee(String fio, int department, double salary) {
                this.id = ++nextId;
                this.fio = fio;
                this.department = department;
                this.salary = salary;
        }

        public String getFio() {
                return this.fio;
        }

        public int getDepartment() {
                return department;
        }

        public double getSalary() {
                return salary;
        }

        public void setFio(String fio) {
                this.fio = fio;
        }

        public void setDepartment(int department) {
                this.department = department;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        @Override
        public String toString() {
                return "Сотрудник: " + this.fio + " Отдел: " + this.department + " Зарплата: " + this.salary;
        }
}
