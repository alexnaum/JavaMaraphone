package sprint3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sprint3_3 {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("aa");
        list.add("cc");
        list.add("oo");
        Map map = new HashMap();
        map.put(1,"cc");
        map.put(2,"bb");
        map.put(3,"cc");
        map.put(4,"aa");
        map.put(5,"cc");
        map.put(6,"zz");
        MyUtils3 m = new MyUtils3();
        System.out.println(m.listMapCompare(list, map));
    }
}

class MyUtils3 {
    // Code
    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        // Code
        boolean isList = false;
        for(int i=0; i<list.size();i++){
            if(!map.containsValue(list.get(i))) {
                isList =  false;
                break;
            }
            else
                isList =  true;
        }
        return isList;
    }
}
