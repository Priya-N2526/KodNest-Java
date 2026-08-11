package track.M02.T01.ST01.classobjects;

class Student {
    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 6;
        s.name = "john";
        s.height = 5.9;
        s.run();
        s.sleep();

    }
}
