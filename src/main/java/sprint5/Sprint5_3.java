package sprint5;
//TODO Спросить почему так
public class Sprint5_3 {
    class A{}
    class B extends A{}
    class C extends B{}
    class Client{
        B SomeMethod(){
            return new B();
        }
    }
    class CpecificClient extends Client{
        public B SomeMethod(){
            return new C();
        }
    }
}
