package Quize;

public class Quize6 {
    public static  void main(String[] args){
      A a = new B();
        a.m2();
        //a.m1();
    }
}
class A{
    private void m1(){
        System.out.println("A_m1");
    }
    public void m2(){
        System.out.println("A_m2");
        m1();
    }
}
class B extends A{
    public void m1(){
        System.out.println("B_m1");
    }
    /*public void m2(){
        System.out.println("B_m2");
        m1();
    }*/
    public void m3(){
        System.out.println("B_m3");
    }
}
