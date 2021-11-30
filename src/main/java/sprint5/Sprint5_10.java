package sprint5;

public class Sprint5_10 {
    public class MainClass{
        public static void main(String[] args){
            A a = new A();
            B b = new B();
            //C c = new C();
            I i = (C)a;
            a = (A)b;
            a = b;
            b = (B)a;
            //a = I(b);
        }
    }
}
interface I{}
class A implements I{}
class B extends A{}
class C extends B{}
