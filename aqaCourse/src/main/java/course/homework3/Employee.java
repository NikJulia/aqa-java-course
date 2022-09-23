package course.homework3;

public class Employee {
        private String full_name;
        private String position;
        private String email;
        private String tel_number;
        private int salary;
        private int age;

    public Employee(String full_name, String position, String email, String tel_number, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.tel_number = tel_number;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo() {
        System.out.println("Full name: " + full_name + "; Position: " + position + "; Email: " + email + "; Telephone number: " + tel_number + "; Salary: " + salary + "; Age: " + age);
    }

    public int getAge() {
        return age;
    }
}
