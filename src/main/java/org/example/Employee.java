package org.example;

public class Employee {

    String name;
    String surname;

    int age;

    int workExperienceInYears;

    public Employee(String name, String surname, int age, int workExperienceInYears) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workExperienceInYears = workExperienceInYears;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperienceInYears +
                '}';
    }
}
