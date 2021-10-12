public interface Test {
    public static void square(){

    }

}
class arithmetic implements Test{
    void hello(){
        System.out.println("waah");
    }
}
class ToTestInt{
    public static void main(String[] args) {
       arithmetic obj=new arithmetic();
       obj.hello();
    }
}
