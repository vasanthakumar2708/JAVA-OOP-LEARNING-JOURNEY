

class nonstatic {
    int x = 10;

    public static void main(String[] args) {
        nonstatic t = new nonstatic();
        System.out.println(t.x);
    }
}

/*
non-static variables can only be accessed by reference variable,
we can't directly access non static(instance variabe) from
static area
non-static variable is created in heap area
 */
