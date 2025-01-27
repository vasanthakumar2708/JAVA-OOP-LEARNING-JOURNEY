abstract class Person{
    String name;
    String aadhar;

    Person(String name, String aadhar){
        this.name=name;
        this.aadhar=aadhar;
    }
}
class Student extends Person{
    int sid;

    Student(String name, String aadhar, int sid){
        super(name, aadhar);
        this.sid=sid;
    }
}

class Employee extends Person{
    int eid;

    Employee(String name, String aadhar, int eid){
        super(name, aadhar);
        this.eid=eid;
    }
}
public class aadharDetails {
    public static void main(String[] args) {
        Student s = new Student("vasanth","94542536",1);
        Employee e = new Employee("manoj","948464433",4);
        //employee
        System.out.println(e.name);
        System.out.println(e.aadhar);
        System.out.println(e.eid);
        //student
        System.out.println(s.name);
        System.out.println(s.aadhar);
        System.out.println(s.sid);
    }
}

/*
here I created a person class which contains common details, and i created classes like student and employee
I added a specific fiels in the child classes.

To access parent class, I used super keyword

This is an example of hierarchial inheritance.
 */
