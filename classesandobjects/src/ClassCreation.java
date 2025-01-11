/*
here i created class test with 2 objects and i'm passing two arguments from the object.
By using constructors i stored the id and name and printed the output using reference variable
 */




class ClassCreation {

    int id;
    String name;
    ClassCreation(int sid, String sname){
        id=sid;
        name=sname;
    }

}
class test{

    public static void main(String[] args) {
        {
            ClassCreation c1 = new ClassCreation(101,"vasanth");
            ClassCreation c2 = new ClassCreation(102,"mano");
            System.out.println(c1.id+"...."+c1.name);
            System.out.println();
        }
    }
}
