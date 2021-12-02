package Quize;

public class Quize2 {
    public static  void main(String[] args){
        B1 a = new B1();
        a.m1();
        System.out.println("a.i = "+a.i);
    }
}
class A1{
    int i = 1;
    public void m1(){
        System.out.println("A_m1"+i);
    }
    public void m2(){
        System.out.println("A_m2"+i);
        m1();
    }
}
class B1 extends A1{
    double i = 1.1;
    public void m1(){
        System.out.println("B_m1"+i);
    }
}
