package sprint5;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Sprint5 {
    class A{
        public A(int x){
            System.out.println(x);
        }
    }
    class B extends A{
        public B(int x, int y){
            super(x);
            System.out.println(y);
        }
        B(int x){
            super(x+1);
            System.out.println(x);
        }
        B(int x, int y, int z){
            this(x,y);
            System.out.println(x);
        }
    }
}
