public class outer {
   public void display(){
       System.out.println("hello");
    }
    public class inner{
       public void display(){
           System.out.println("bye");
        }
    }
    inner obj1=new inner();
}
class Main
{
    public static void main(String[] args) {
        outer obj=new outer();
        outer.inner innerobj = obj.new inner();
        obj.display();
        obj.obj1.display();
        innerobj.display();
    }
}
