public class staticvariableseg {
        static int x = 333;

        public static void main(String[] args) {
            System.out.println(x);
            System.out.println(staticvar2.x);//accessing static variable via class name(recommended if it is in the same class)
            staticvar2 t = new staticvar2();
            System.out.println(t.x);// accessing static variable via reference variable
        }
    }


//---------------------------------------------------------------------------------------------------------------------------------------

    class example2{
        static int x = 343;

        public static void main(String[] args) {
            System.out.println(x);
            int m = 55;
            //example2 k = new example2();
            //k.m1();
            new example2().m1();// this kind of object creation can be accessed once
        }
        public void m1(){
            System.out.println(x);//we can directly access static variable in non static area(instance area)
        }

    }


