import java.util.Scanner;

public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private float salary;
    public int id;
    public static int count;


    public Employee(String firstName, String middleName, String lastName, int department, float salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = ++count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        String data = "Ф.И.О.: \n" + lastName + " " + firstName + " " + middleName;
        data += " зарплата: " + salary;
        data += " отдел: " + department;
        data += " id: " + id + "\n";
        return data;
    }

    public static void printListEmployee(Employee[] employees) {
        String person = employees[0].toString();
        for (int i = 1; i < employees.length; i++) {
            person += employees[i].toString();
        }
        System.out.println(person);
    }

    public static float getSumSalaryEmployees(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalaryEmployee(Employee[] employees) {
        Employee employeeMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }
    public static Employee getMinSalaryEmployeeOfDepartment(Employee[] employees, int departmentEmployee) {
        float employeeMinSalary = 100000000;
        Employee employeeWithMinSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (departmentEmployee == employees[i].getDepartment()) {
                if (employees[i].getSalary() < employeeMinSalary) {
                    employeeMinSalary = employees[i].getSalary();
                    employeeWithMinSalary = employees[i];
                }
            }
        }
        return employeeWithMinSalary;
    }
    public static Employee getMaxSalaryEmployeeOfDepartment(Employee[] employees, int departmentEmployee) {
        float employeeMaxSalary = 0;
        Employee employeeWithMaxSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (departmentEmployee == employees[i].getDepartment()) {
                if (employees[i].getSalary() > employeeMaxSalary) {
                    employeeMaxSalary = employees[i].getSalary();
                    employeeWithMaxSalary = employees[i];
                }
            }
        }
        return employeeWithMaxSalary;
    }
    public static float getSumSalaryEmployeesOfDepartment(Employee[] employees, int departmentEmployee) {
        int sumOfDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (departmentEmployee == employees[i].getDepartment()) {
                sumOfDepartment += employees[i].getSalary();
            }
        }
        return sumOfDepartment;
    }

    public static float getAverageSalaryOfDepartment(Employee[] employees, int departmentEmployee) {
        int counter = 0;
        int sumOfDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (departmentEmployee == employees[i].getDepartment()) {
                sumOfDepartment += employees[i].getSalary();
                counter++;
            }
        }
        return (float) sumOfDepartment/counter;
    }
    public static void indexationSalaryOfDepartment(Employee[] employees, int departmentEmployee) {
        System.out.println("Введите процент индексации зарплаты");
        Scanner index = new Scanner(System.in);
        float indexation = index.nextFloat();
        for (int i = 0; i < employees.length; i++) {
            if (departmentEmployee == employees[i].getDepartment()) {
                float indexSalary = employees[i].getSalary() * indexation / 100;
                employees[i].setSalary(employees[i].getSalary() + indexSalary);
            }
        }
    }
    public static void printListEmployeeOfDepartment(Employee[] employees, int departmentEmployee) {
        System.out.println("Сотрудники " + departmentEmployee + " отдела:");
        for (int i = 0; i < employees.length; i++) {
            if (departmentEmployee == employees[i].getDepartment()) {
                System.out.println("Ф.И.О: " + employees[i].getLastName() + " " + employees[i].getFirstName() +
                        " " + employees[i].getMiddleName() + " зарплата: " + employees[i].getSalary() +
                        " id: " + employees[i].getId());
            }
        }
    }
    public static void getSalaryEmployeeLess(Employee[] employees, int salaryEmployee) {
        System.out.println("Сотрудники с зарплатой не выше " + salaryEmployee + " рублей:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() <= salaryEmployee) {
                System.out.println(employees[i]);
            }
        }
    }
    public static void getSalaryEmployeeMore(Employee[] employees, int salaryEmployee) {
        System.out.println("Сотрудники с зарплатой не ниже " + salaryEmployee + " рублей:");
        for (int i = 0; i < employees.length; i++) {
            if (salaryEmployee <= employees[i].getSalary()) {
                System.out.println(employees[i]);
            }
        }
    }

    public static Employee getMaxSalaryEmployee(Employee[] employees) {
        Employee employeeMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    public static void printNicEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }

    public static void printSalaryEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Зарплата сотрудника " + employee.getLastName() + " " + employee.getFirstName() +
                    " " + employee.getMiddleName() + " составляет " + employee.getSalary() + " рублей \n");
        }
    }

    public static void indexationOfSalary(Employee[] employees) {
        System.out.println("Введите процент индексации зарплаты");
        Scanner index = new Scanner(System.in);
        float indexation = index.nextFloat();
        for (Employee employee : employees) {
            float indexSalary = employee.getSalary() * indexation / 100;
            employee.setSalary(employee.getSalary() + indexSalary);
        }
    }
}
