public class Box {
    int length,height,breadth;
    Box(){
        length=5;
        height=7;
        breadth=6;
    }
    void area(){
        int a=2*((length*breadth)+(breadth*height)+(height*length));
        System.out.println(a);
    }
    void volume(){
        int v=length*breadth*height;
        System.out.println(v);
    }

}
class Box3d extends Box{
    public static void main(String[] args) {
        Box obj= new Box();
        obj.area();
        obj.volume();

    }

}
