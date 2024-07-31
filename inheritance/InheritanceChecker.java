package inheritance;

import java.security.spec.RSAOtherPrimeInfo;

public class InheritanceChecker {

    public static void main(String[] args){

        System.out.println("Creating a person object");
        Person person = new Person();
        System.out.println("Creating an employee object");
        Employee employee = new Employee();

        person.setName("John Doe");
        person.setAge(30);
        person.setGender("Male");

        employee.setName("Jane Smith");
        employee.setAge(28);
        employee.setGender("Female");
        employee.setEmployeeId("E123");
        employee.setTitle("Software Engineer");

        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge() + ", Gender: " + person.getGender());
        System.out.println("Employee: " + employee.getName() + ", Age: " + employee.getAge() + ", Gender: " + employee.getGender() + ", Employee ID: " + employee.getEmployeeId() + ", Title: " + employee.getTitle());
    }
}
