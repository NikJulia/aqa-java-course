package course.homework3;

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Test Test 1", "Test Position 1", "test1@test.com", "111-111-111", 3000, 38);
        employeesArray[1] = new Employee("Test Test 2", "Test Position 2", "test2@test.com", "222-222-222", 2500, 39);
        employeesArray[2] = new Employee("Test Test 3", "Test Position 3", "test3@test.com", "333-333-333", 2000, 40);
        employeesArray[3] = new Employee("Test Test 4", "Test Position 4", "test4@test.com", "444-444-444", 1500, 41);
        employeesArray[4] = new Employee("Test Test 5", "Test Position 5", "test5@test.com", "555-555-555", 1000, 42);

        for (int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getAge() > 40){
                employeesArray[i].employeeInfo();
            }
        }
    }
}