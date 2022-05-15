public class EmployeeBook {
    private Employee[] employeeArray;

    public EmployeeBook(int arrSize) {
        employeeArray = new Employee[arrSize];
    }

    public Employee[] returnBookObj(Employee employee) {
        return employeeArray;
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] == null) {
                employeeArray[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee findEmployeeId(int id) {
        for (Employee employee : employeeArray) {
            if (id == employee.id) {
                System.out.println("Сотрудник: " + employee.toString());
                return employee;
            }
        }
        return null;
    }
    public Employee findEmployeeFullName (String fullName) {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                if (fullName.equals(employee.getName() + " " + employee.getSecondName() + " " + employee.getThirdName())) {
                    System.out.println(employee.toString());
                    return employee;
                }
            }
        }
        System.out.println("Введите в формате: Имя, Фамилия, Отчество");
        return null;
    }

    public void changeSalary (String fullName, double newSalary) {
        System.out.println("Изменена зарплата у сотрудника:");
        findEmployeeFullName(fullName).setSalary(newSalary);
    }

    public boolean deleteEmployee(Employee employee) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].id == employee.id) {
                employeeArray[i] = null;
                System.out.println("Сотрудник удалён");
                return true;
            }
        }
        return false;
    }

    public boolean updateEmployee(Employee employee) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].id == employee.id) {
                employeeArray[i] = employee;
                return true;
            }
        }
        return false;
    }

    // Method which can show list with all information about Employees
    public void showAllEmployeesList() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    // Seek amount of payroll costs
    public double checkAmount() {
        double sumOfSalary = 0;
        for (Employee employee : employeeArray) {
            if (employee != null) {
                sumOfSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в месяц = " + sumOfSalary + " рублей.");
        return sumOfSalary;
    }

    // Seek employee with the smallest salary
    public double checkMinSalary() {
        double minSalary = employeeArray[employeeArray.length - 1].getSalary();
        for (Employee employee : employeeArray) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                }
            }
        }
        return minSalary;
    }
    public int ifEqual (double salary) {
        int person = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                if (employeeArray[i].getSalary() == salary) {
                    ++person;
                }
            }
        }
        return person;
    }
    public double findEmployeeWithMinSalary () {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                if (employee.getSalary() == checkMinSalary() && ifEqual(checkMinSalary()) > 1) {
                    System.out.println("Минимальная зарптала одинакова: " + employee.getSalary() + " рублей у Сотрудника: " + employee.getFullName_Id());
                } else if (employee.getSalary() == checkMinSalary() && ifEqual(checkMinSalary()) == 1) {
                    System.out.println("Мининимальная зарплата " + checkMinSalary() + " рублей у Сотрудника" + employee.getFullName_Id());
                }
            }
        }
        return checkMinSalary();
    }

    // Seek employee with the biggest salary
    public double checkMaxSalary() {
        double maxSalary = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                if (employeeArray[i].getSalary() > maxSalary) {
                    maxSalary = employeeArray[i].getSalary();
                }
            }
        }
        return maxSalary;
    }
    public double findEmployeeWithMaxSalary () {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                if (employee.getSalary() == checkMaxSalary() && ifEqual(checkMaxSalary()) >= 2) {
                    System.out.println("Максимальная зарптала одинакова: " + employee.getSalary() + " рублей у Сотрудника: " + employee.getFullName_Id());
                } else if (employee.getSalary() == checkMaxSalary() && ifEqual(checkMaxSalary()) < 2) {
                    System.out.println("Максимальная зарплата " + checkMaxSalary() + " рублей у Сотрудника " + employee.getFullName_Id());
                }
            }
        }
        return checkMaxSalary();
    }
    //Get Average Salary
    public double getAverageSalary() {
        int sumAllPersons = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                sumAllPersons++;
            }
        }
        double averageSalary = checkAmount() / sumAllPersons;
        System.out.println("Средняя зарплата: " + averageSalary + " рублей из расчета " + sumAllPersons + " работников");
        return averageSalary;
    }

    // Get Employees List with Full Name
    public void getFullNameList() {
        String fullNamePerson = null;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                fullNamePerson = employeeArray[i].getSecondName() + " " + employeeArray[i].getName() + " " + employeeArray[i].getThirdName();
                System.out.println("ID:" + employeeArray[i].id + " ФИО: " + fullNamePerson);
            }
        }
    }

    //--------------------------Additional Methods------------------------

    public void conductIndexation(double index) {
        double newSalary = 0;
        if (index >= -100 && index <= 100) {
            for (int i = 0; i < employeeArray.length; i++) {
                if (employeeArray[i] != null) {
                    newSalary = employeeArray[i].getSalary() + employeeArray[i].getSalary() * index / 100;
                    employeeArray[i].setSalary(newSalary);
                    System.out.println("Новая зарплата у сотрудника: " + employeeArray[i].getFullName_Salary());
                }
            }
        } else {
            System.out.println("Индексация в процентах");
        }
    }

    public Employee[] makeDepartmenArray(int departmentID) {
        //Find count of Employees in department
        int personsInDepartment = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                if (employeeArray[i].getDepartment() == departmentID) {
                    personsInDepartment++;
                }
            }
        }
        //Create new Massive and put in Department Employees
        Employee[] departmentPerson = new Employee[personsInDepartment];
//        System.out.println("Информация по департаменту " + departmentID + ":");
        for (int j = 0; j < departmentPerson.length; j++) {
            //          System.out.println("LoopJ#" + j);
            for (int i = employeeArray.length - 1; i >= 0; i--) {
                if (employeeArray[i] != null) {
                    if (employeeArray[i].getDepartment() == departmentID && personsInDepartment > 0) {
                        //                      System.out.println("LoopI#" + i);
                        departmentPerson[personsInDepartment - 1] = employeeArray[i];
                        personsInDepartment--;
                    }
                }
            }
        }
        return departmentPerson;
    }

    public void changeArrays (double myFunc, int department)  {
        Employee[] departmentArray;
        departmentArray = employeeArray;
        employeeArray = makeDepartmenArray(department);
        employeeArray = departmentArray;
    }

    public void getDepartmentMinSalary(int department) {
        Employee[] departmentArray;
        departmentArray = employeeArray;
        employeeArray = makeDepartmenArray(department);
        findEmployeeWithMinSalary();
        employeeArray = departmentArray;
    }

    public void getDepartmentMaxSalary(int department) {
        Employee[] departmentArray;
        departmentArray = employeeArray;
        employeeArray = makeDepartmenArray(department);
        findEmployeeWithMaxSalary();
        employeeArray = departmentArray;
    }

    public void getDepartmentAverageSalary(int department) {
        Employee[] departmentArray;
        departmentArray = employeeArray;
        employeeArray = makeDepartmenArray(department);
        getAverageSalary();
        employeeArray = departmentArray;
    }

    public void getDepartmentAmountSalary(int department) {
        Employee[] departmentArray;
        departmentArray = employeeArray;
        employeeArray = makeDepartmenArray(department);
        checkAmount();
        employeeArray = departmentArray;
    }

    public void departmentIndexationSalary(int department, int index) {
        Employee[] departmentArray;
        departmentArray = employeeArray;
        employeeArray = makeDepartmenArray(department);
        conductIndexation(index);
        for (int j = 0; j < employeeArray.length; j++) {
            for (int i = departmentArray.length - 1; i >= 0; i--) {
                if (departmentArray[i] != null && employeeArray[j] != null) {
                    if (departmentArray[i].equals(employeeArray[j])) {
                        departmentArray[i] = employeeArray[j];
                    }
                }
            }
        }
        employeeArray = departmentArray;
    }

    public void showDepartmentInfo(int department) {
        Employee[] departmentArray;
        departmentArray = employeeArray;
        employeeArray = makeDepartmenArray(department);
        System.out.println("Сотрудники департамента " + department + ":");
        for (Employee employee:
                employeeArray) {
            System.out.println(employee.getDepartmentEmployeeFullname());
        }
        employeeArray = departmentArray;
    }


    public void findEmployeesSalaryLessThen(double number) {
        System.out.println("Зарплата ниже чем " + number + " руб. у сотрудников: ");

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                if (employeeArray[i].getSalary() < number) {
                    System.out.println(employeeArray[i].getDepartmentEmployeeFullname());
                }
            }
        }
    }
    public void findEmployeesSalaryMoreThen(double number) {
        System.out.println("Зарплата выше чем " + number + " руб. у сотрудников: ");
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                if (employeeArray[i].getSalary() >= number) {
                    System.out.println(employeeArray[i].getDepartmentEmployeeFullname());
                }
            }
        }
    }
}
