class localvar {
    public static void main(String[] args) {
        int x;
        //System.out.println(x);//for local variable jvm does not provide default value,
        // we have to intialize it.
    }
}

class localdemo{
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                i=i+j;
            }
        }
        // System.out.println(i+"....."+j);
    }
}

/*
here the scope of the local variable is within the methods or within the blocks or within the loops,
so the scope of the local variable is the same as the blocks.
Local variables will be created in the execution of the blocks.
Local variables are stored in the stack area.
 */
