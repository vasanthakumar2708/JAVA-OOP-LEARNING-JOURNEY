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
