import p1.Student;

public class TestStudent extends Student {
    public static void main(String[] args) {
        Student obj1=new Student("vedant",19);
        obj1.display();
        TestStudent obj2=new TestStudent();
        System.out.println(obj2.age+" "+obj2.name+" "+obj2.name);
    }
}
