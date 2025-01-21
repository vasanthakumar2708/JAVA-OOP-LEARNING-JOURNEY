
/*
* Abstraction is nothing but highlighting the service by hiding the implementation to others
for eg, indigo flight service has all flight information, so an app called ibibo which has to provide
flight information, so they get requried services from indigo by abstraction here only the service is
provided not the actual implementation of the service.

* By using abstraction we can achieve security and enhancement of the code.

 */

//here the below class only provided to the client , the client  can't see the actual implementation
abstract class car {
    public abstract void drive();
    public abstract void wheel();
    public void music() {
        System.out.println("music is playing./");

    }

}

abstract class audi extends car{
    public void drive(){
        System.out.println("Driving/...");
    }
}
class mrf extends audi{
    public void wheel(){
        System.out.println("wheel is running");
    }
}

class company{
    public static void main(String[] args) {
        car a = new mrf();
        a.drive();
        a.wheel();
    }
}
/*
points to remember:

*We can't create an object for abstract class, but we can use parent type reference pointing to child
object. like    car a = new mrf();
*All abstract methods should be defined in other classes, if we can't able to define it then we will get
compilation error to overcome this error we can declare the class as abstract, but it should be defined in
other class(child class).
 */