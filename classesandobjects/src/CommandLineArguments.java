/*
The arguments that we are passing from the command prompt to the program are called command line argements,
These are the arguments to the main() method and only available in the form of string by default

 */

public class CommandLineArguments {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

    }
}

class democommand{
    public static void main(String[] args) {
        System.out.println(args[0]+args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
}
/*
Here, the commandline arguments is passed as string to the main() method,
By using Integer.parseInt we convert string to the integer so the output will be the
sum of args[0] and args[1].
 */

class democommand2{
    public static void main(String[] args) {
        try{
            int x = Integer.parseInt(args[0]);
            System.out.println(x);
        }
        catch (NumberFormatException e){
            int x = 20;
            System.out.println("Inside catch block: "+x);
        }
    }
}
