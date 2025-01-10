/*
Inheritance:
* By using extends keywords we can achieve inheritance
* The main usage of inheritance is to avoid code reusability and reduce redundancy.



This below program represents Is-A-Relationship in inheritance, which means that when we create a parent reference
with child object, we can only be able to access parent class methods and fields.

But if we create a child reference with child object then we can access both parent and child related
methods.

The main use of using inheritance is we can declare all common fields and methods in parent class and
most specific fields class so that we can use code redundancy.
 */

class IsARelationship {
    public void a(){
        System.out.println("A");
    }
}
class b extends IsARelationship{
    public void b1(){
        System.out.println("B");
    }
}

class demo{
    public static void main(String[] args) {
        IsARelationship rel = new b();//parent reference pointing child object
        rel.a();
        b rel2 = new b();//child reference pointing child object
        rel2.a();
        rel2.b1();

    }
}

