package track.M02.T01.ST01.classobjects;
class empapplication{
    int id;
    String name;
    void work(){
        System.out.println("Working");
    }

}
public class employee {
    public static void main(String[] args) {
        empapplication e1=new empapplication();
        e1.id=11;
        e1.name="anu";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
        empapplication e2;
        e2=e1;
        e2.id=13;
        e2.name="Shanti";
        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();

    }
    
}
