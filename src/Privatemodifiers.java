
class Address{
    String area;
    String city;
    String street;
}
class Studentdetails{
    int rollno;
    String name;
    Address addr;
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}

public class Privatemodifiers {
    public static void main(String[] args) {
        Address a = new Address();

        a.city="Sathy";
        a.area="bhavani";
        a.street="firststreet";
        System.out.println(a.city);

        Studentdetails s = new Studentdetails();
        s.setAge(19);
        System.out.println(s.getAge());
    }
}

/*
Here we declated age with private modifier and accessed age via getter and setter method.
Private modifiers can be accessed directly within the same class if it is outside the class
then we have access with getter and setter method
 */
