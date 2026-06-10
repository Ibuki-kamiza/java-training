public class Employee {

    private String employeeId;
    private String name;
    private int age;
    private String department;

    public Employee(String employeeId, String name, int age, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}