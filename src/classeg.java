/*
here i created class test with 2 objects and i'm passing two arguments from the object.
By using constructors i stored the id and name and printed the output using reference variable
 */




class classeg {

        int id;
        String name;
        classeg(int sid, String sname){
            id=sid;
            name=sname;
        }

}
class test{

    public static void main(String[] args) {
        {
            classeg c1 = new classeg(101,"vasanth");
            classeg c2 = new classeg(102,"mano");
            System.out.println(c1.id+"...."+c1.name);
            System.out.println();
        }
    }
}
