class MethodOverloadingeg3{
    public  void m1(String s1){
        System.out.println("String-arg");
    }
    public  void m1(Object o){
        System.out.println("Object-arg");
    }

    public static void main(String[] args) {
        MethodOverloadingeg3 me = new MethodOverloadingeg3();
        me.m1(new String());
        me.m1(new Object());
        me.m1(null);
    }

}

