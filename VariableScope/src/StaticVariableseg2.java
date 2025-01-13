class staticvar {

    static int x=221;
    public static void main(String[] args){
        System.out.println(x);
    }
}

/*
static variable is created at the time of class loading
it has same scope as class
jvm always provide default value for static and non static variable
static variable is created at method area.
static variable is accessed using class name or object reference if it is not in the same class,
but accessing via class name is recommended.

 */
