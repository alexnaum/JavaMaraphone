package Sprint6;
import java.util.ArrayList;
import java.util.List;
/**
 * Create classes Square and Rectang with method (double getPerimeter()) for calculating of perimeter.
 * Find solution for avoiding of duplicate code.
 * Create a double sumPerimeter(List<?> firures) method of the MyUtils class to return a sum perimeters of all figures.
 * For example, for a given list
 * [[Square [width=4.00], Square [width=5.00], Rectang [height=2.00, width=3.00]]
 * you should get 46
 */
public class Sprint6_3 {
    public static void main(String[] args) {
        List<Shape> figures = new ArrayList<>();
        MyUtils63 m = new MyUtils63();
        /*figures.add(new Square(4));
        figures.add(new Square(5));
        figures.add(new Rectang(2,3));*/
        System.out.println(m.sumPerimeter(figures));
    }
}
abstract class Shape{
   /*double width;
   public Shape(double width){
       this.width = width;
   }*/
    public abstract double getPerimeter();
}
class Rectang extends Shape{
    double height;
    double width;
    public Rectang(double height, double width){
        //super(width);
        this.width = width;
        this.height = height;
    }
    public double getPerimeter(){
       return height*2+width*2;
    }
    // Code
}
class Square extends Shape{
    double width;
    public Square(double width){
        //super(width);
        this.width = width;
    }
    public double getPerimeter(){
        return width*4;
    }
    // Code
}

class MyUtils63 {
    public double sumPerimeter(List<Shape> figures) {
        // Code
        if(figures!=null){
        double sum = 0;
        for(Shape list:figures){
            sum = sum + list.getPerimeter();
        }
        return sum;
        } else return 0;
    }
}
