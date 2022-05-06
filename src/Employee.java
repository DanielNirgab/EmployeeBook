public class Employee {
    private String name;
    private String secondName;
    private String thirdName;
    private int department;
    private double salary;
    static int count = 1;
    int id = count;

    //Constructor of Employee
    Employee(String name1, String secondName1, String thirdName1, int department1, double salary1) {
        name = name1;
        secondName = secondName1;
        thirdName = thirdName1;
        department = department1;
        salary = salary1;
        count++;
    }

    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    //--------------------------Additional Methods------------------------


    @Override
    public String toString() {
        return "Сотрудник - " +
                "Имя:'" + name + '\'' +
                ", Фамилия:'" + secondName + '\'' +
                ", Отчество:'" + thirdName + '\'' +
                ", Департамент:" + department +
                ", Зарплата: " + salary +
                ", id#" + id;
    }

    public String getFullName_Salary() {
        return  "Имя:'" + name + '\'' +
                ", Фамилия:'" + secondName + '\'' +
                ", Отчество:'" + thirdName + '\'' +
                ", Зарплата: " + salary;
    }

    public String getFullName_Id() {
        return  "Имя:'" + name + '\'' +
                ", Фамилия:'" + secondName + '\'' +
                ", Отчество:'" + thirdName + '\'' +
                ", id#" + id;
    }

    public String getDepartmentEmployeeFullname () {
        return "Сотрудник - " +
                "Имя:'" + name + '\'' +
                ", Фамилия:'" + secondName + '\'' +
                ", Отчество:'" + thirdName + '\'' +
                ", Зарплата: " + salary +
                ", id#" + id;
    }
}
