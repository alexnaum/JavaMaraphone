package sprint5;

import java.sql.SQLOutput;

public class Sprint5_7 {

    public static void main(String[] args){
        System.out.println(new TestClass().getNumber(4));
    }
}
class Super{
    public int getNumber(int a){
        return a;
    }
}

