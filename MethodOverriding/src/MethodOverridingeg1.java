/*
Method Overriding:
Through Is-A-Relationship whatever parent has (properties and behaviour) are by default available to the
child class. If the child class is not satisfied with the parent method behaviour, then the child can change that
behaviour by using method overriding.

Here Method resolution is taken care by JVM based on a runtime object. Hence, it is called as dynamic polymorphism,
or runtime polymorphism or late binding
 */

abstract class Animal {
    abstract  void eat();
}

class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger is eating");
    }
}

class cow extends Animal{
    public void eat(){
        System.out.println("Cow is mewing");
    }
}

class test{
    public static void main(String[] args) {
        Animal a = new Tiger();
        a.eat();
        a=new cow();
        a.eat();

    }
}
