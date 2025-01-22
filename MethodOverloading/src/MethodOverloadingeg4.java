class Person {
}
class Student extends Person{

}

class test{
    public static void m1(Person l){
        System.out.println("person");
    }
    public static void m1(Student d){
        System.out.println("student");
    }

    public static void main(String[] args) {
        Person p = new Person();

        Student s = new Student();
        m1(p);
        m1(s);
        Person ps = new Student();
        m1(ps);//here since I used parent reference, so person is printed because,
               //method resolution is taken care by compiler based on a reference type.
    }
}
/*
Important point:
Here how a person is an argument in a method?

It is because every class is a subclass of object, so an object is a datatype, in the above scenario
the method accepts exactly the person object type or a subclass of the person class object type(i.e student).

In overloading method resolution is taken care by compiler based on a reference type. Hence, it is called
static polymorphism or compile time polymorphism or early binding.

Why is It Called Static Polymorphism?
Polymorphism means "many forms." In the context of overloading:

The same method name (m1 in the example above) takes on many forms, depending on the argument types.
Since the method resolution happens at compile time, before the program runs, this is called static polymorphism.
 */