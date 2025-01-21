/*
what is method signature?
In java method signature is consist of method name followed by the argument type but not argument names is called
method signature.

modifiers and return type are not part of the method signature.

In any java class, two methods with the same method signature are not allowed.

Java compiler uses method signature to resolve method invocation
 */


class Methodsign {
    public void m1(int a, float b){   //valid

    }
    public int m1(int x, int c){
        return x;

    }
}
class demo{
    public static void main(String[] args) {
        Methodsign m = new Methodsign();


    }
}

/*
public void m1(int a, float b){    here it will throw compilation error since both method
                                   signatures are same

    }
    public int m1(int x, float y){

    }
 */
