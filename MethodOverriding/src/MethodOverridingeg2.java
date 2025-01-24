/*
Rules in method overriding:
Method signatures must be same to achieve method overriding

Rules related to return types of methods:

For primitives, the return type must be the same, but for object return types covariant return types are
allowed. As per this concept child method return types should same as parent method return types and eventhough

Co-variant return types are applicable only for object class but not for primitive types.

it is not the same if the parent has parent return type and child has child return type it is valid,
Eg, below program
 */



class MethodOverriding {
    public Object m1( ){
        System.out.println("In parent method");
        return null;

    }

}
class child extends MethodOverriding{
    public String m1(){
        System.out.println("In child method");
        return null;
    }
}

class demo{
    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.m1();
        obj=new child();
        obj.m1();
    }

}
