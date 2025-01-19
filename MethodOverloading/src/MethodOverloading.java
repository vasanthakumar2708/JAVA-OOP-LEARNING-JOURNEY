/*
Method overloading

In java, we can declare two or more method with same name but with different signatures, such type
of methods is called overloaded methods and this concept is called as method overloading

The main advantage of this concept is flexibility in coding and usage.
 */





class MethodOverloading {
    public static void m1(int a, double b){
        System.out.println("Int-double arguments");
    }
    public static void m1(double b, int a){
        System.out.println("double-int arguments");
    }
    public static void main(String[] args) {
        m1(4,10.6);
    }

}
