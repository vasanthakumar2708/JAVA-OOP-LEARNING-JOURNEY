class nonstatic2 {
    int x = 10;

    public static void main(String[] args) {
        nonstatic2 s = new nonstatic2();
        System.out.println(s.x);
        s.m1();
    }
    public void m1(){
        System.out.println(x);

    }
}

/*
here the m1() method is in the non-static area, so,
the instance variable(non static variable) is directly accessed.
 */



