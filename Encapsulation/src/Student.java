/*
Write a Java program to create a class called Student that encapsulates the following details:

Private attributes:

name (String)
age (int)
grade (char)
Provide:

Public getter and setter methods for each attribute.
A method displayDetails() to print the student’s details.
In the main method:

Create an object of the Student class.
Set values for the name, age, and grade using setter methods.
Retrieve and print the values using getter methods.
Call the displayDetails() method.

 */


class Student {
    private String name;
    private int age;
    private char grade;

    public String setname(String name){
        this.name=name;
        return name;
    }
    public String getname(){
        return name;
    }
    public int setage(int age){
        this.age=age;
        return age;
    }
    public int getage(){
        return age;
    }

    public char setgrade(char grade){
        this.grade=grade;
        return grade;
    }
    public char getgrade(){
        return grade;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setage(19);
        s.setgrade('A');
        s.setname("vasanth");
        System.out.println(s.getname());
        System.out.println(s.getage());
        System.out.println(s.getgrade());
    }
}
