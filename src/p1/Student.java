package p1;


public class Student {
    protected  String name;
    protected int age;
     public Student(){
        name="shahid khan";
        age=19;

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println(age+" "+name);
    }

}
