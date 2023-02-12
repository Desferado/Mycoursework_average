import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        for (int n = 0; n < employees.length; n++) {
            System.out.println("Введите Имя сотрудника");
            Scanner name1 = new Scanner(System.in);
            String firstNameEmployee = name1.nextLine();
            System.out.println("Введите Отчество сотрудника");
            Scanner name2 = new Scanner(System.in);
            String middleNameEmployee = name2.nextLine();
            System.out.println("Введите Фамилию сотрудника");
            Scanner name3 = new Scanner(System.in);
            String lastNameEmployee = name3.nextLine();
            System.out.println("Введите отдел сотрудника от 1 до 5");
            Scanner departmentEmployee = new Scanner(System.in);
            int departmentPerson = departmentEmployee.nextInt();
            System.out.println("Введите зарплату сотрудника");
            Scanner salaryEmployee = new Scanner(System.in);
            int salaryPerson = salaryEmployee.nextInt();
            employees[n] = new Employee(firstNameEmployee, middleNameEmployee, lastNameEmployee, departmentPerson, salaryPerson);
        }
        float averageSalary = Employee.getSumSalaryEmployees(employees) / employees.length;
        System.out.println("Сумма всех затрат на зарплаты в месяц составляет " + Employee.getSumSalaryEmployees(employees) + " рублей.");
        System.out.println("Сотрудник с минимальной зарплатой: \n" + Employee.getMinSalaryEmployee(employees));
        System.out.println("Сотрудник с максимальной зарплатой: \n" + Employee.getMaxSalaryEmployee(employees));
        System.out.println("Среднее значение зарплат за месяц = " + averageSalary);
        Employee.printNicEmployee(employees);
        Employee.indexationOfSalary(employees);
        Employee.printSalaryEmployee(employees);
        Employee.printListEmployee(employees);
        System.out.println("Введите номер отдела:");
        Scanner inputDepartment = new Scanner(System.in);
        int departmentEmployee = inputDepartment.nextInt();
        System.out.println("Сотрудник " + departmentEmployee + " отдела с минимальной зарплатой: \n" + Employee.getMinSalaryEmployeeOfDepartment(employees, departmentEmployee));
        System.out.println("Сотрудник " + departmentEmployee + " отдела с максимальной зарплатой: \n" + Employee.getMaxSalaryEmployeeOfDepartment(employees, departmentEmployee));
        System.out.println("Сумма всех затрат на зарплаты " + departmentEmployee + " отдела в месяц составляет " + Employee.getSumSalaryEmployeesOfDepartment(employees, departmentEmployee) + " рублей.");
        System.out.println("Среднее значение зарплат по " + departmentEmployee + " отделу за месяц = " + Employee.getAverageSalaryOfDepartment(employees, departmentEmployee) + " рублей.");
        Employee.printListEmployeeOfDepartment(employees, departmentEmployee);
        System.out.println("Введите уровень зарплаты:");
        Scanner inputSalary = new Scanner(System.in);
        int salaryEmployee = inputSalary.nextInt();
        Employee.getSalaryEmployeeLess(employees, salaryEmployee);
        Employee.getSalaryEmployeeMore(employees, salaryEmployee);
    }
}




