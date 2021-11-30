package sprint5;

public class Sprint5_9 {

    public class TestClass{
        public static void main(String[] args){
            Base b = new Derived();
            System.out.println(b.getValue());
        }
    }
}
class Base{
    public short getValue(){
        return 100;
    }
}
class Derived extends Base{
    public short getValue(){
        return 5;
    }
}
