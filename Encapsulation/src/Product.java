/*
Encapsulation :
Binding the data together with related methods is concept of encapsulation.
class is the base to define encapsulation and we can achieve it by creating an object of the class
 */


class Product {
    private int id;
    private String name;


    public int setid(int id){  //here i declared the related method according to the class
        this.id=id;
        return id;
    }
    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }
    public String setname(String name){
        this.name=name;
        return name;
    }
}
class shop{
    public static void main(String[] args) {
        Product p = new Product();
        p.setid(13);
        p.setname("Toothpaste");
        System.out.println(p.getid());
        System.out.println(p.getname());
    }
}
