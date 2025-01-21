//Example for ambuiguity error in method overloading


class MethodOverloadingeg2 {
    public static void m1(int a, float b){
        System.out.println("int-float arg");
    }
    public static void m1(float a, int b){
        System.out.println("float-int arg");
    }

    public static void main(String[] args) {
        m1(5,6f);
    }

}

/*
Important point:
here I can't access non-static methods from static area, but we can access only if object of the class is created!.
 */
/*

class MethodOverloadingeg2 {
    public static void m1(int a, float b){
        System.out.println("int-float arg");
    }
    public static void m1(float a, int b){
        System.out.println("float-int arg");
    }

    public static void main(String[] args) {
        m1(5,6); Here it will cause ambuiguity error because the compiler doesn't know what to execute
                  because the compiler will be confused which one to type cast(5,6);
    }

}

 */
