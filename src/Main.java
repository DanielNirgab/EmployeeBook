public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee(new Employee("Ivan", "Ivanov", "Ivanovich", 5, 17500.0));
        employeeBook.addEmployee(new Employee("Fedor", "Denisov", "Petrovich", 1, 27250.0));
        employeeBook.addEmployee(new Employee("Fedor", "Sidorov", "Fedorovich", 2, 25580.0));
        employeeBook.addEmployee(new Employee("Petr", "Petrov", "Petrovich", 2, 22550.0));
        employeeBook.addEmployee(new Employee("Vasilii", "Ivanov", "Artemovich", 3, 21570.0));
        employeeBook.addEmployee(new Employee("Nikolai", "Tolstoi", "Alekseevich", 2, 25580.0));
        employeeBook.addEmployee(new Employee("Aleksei", "Shtern", "Olegovich", 4, 25000.0));
        employeeBook.addEmployee(new Employee("Ivan", "Petrov", "Andreevich", 4, 25550.0));
        employeeBook.addEmployee(new Employee("Aleksandr", "Smirnov", "Borisovich", 5, 15350.0));
        employeeBook.addEmployee(new Employee("Andrei", "Tolstoi", "Alekseevich", 5, 18650.0));

    //Basic Methods
        employeeBook.showAllEmployeesList();
        employeeBook.checkAmount();
        employeeBook.findEmployeeWithMinSalary();
        employeeBook.findEmployeeWithMaxSalary();
        employeeBook.getAverageSalary();
        employeeBook.getFullNameList();
        employeeBook.deleteEmployee(employeeBook.findEmployeeId(3));
    //Additional Methods
        System.out.println();
        employeeBook.conductIndexation(10);
        employeeBook.getDepartmentMinSalary(2);
        employeeBook.getDepartmentMaxSalary(2);
        employeeBook.getDepartmentAverageSalary(2);
        employeeBook.getDepartmentAmountSalary(2);
        employeeBook.departmentIndexationSalary(2, 10);
        employeeBook.showDepartmentInfo(2);
        employeeBook.findEmployeesSalaryLessThen(20000);
        employeeBook.findEmployeesSalaryMoreThen(20000);
        employeeBook.changeSalary("Ivan Petrov Andreevich", 27750);
        employeeBook.findEmployeeFullName("Ivan Petrov Andreevich");

        employeeBook.findEmployeeWithMaxSalary();
    }
}