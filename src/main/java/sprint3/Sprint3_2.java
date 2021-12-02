package sprint3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sprint3_2 {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("zz");
        list.add("abc");
        list.add("aa");
        list.add("aaa");
        MyUtils1 m = new MyUtils1();
        System.out.println(m.strSort(list));
        System.out.println(list.get(0).length());
    }
}

class MyUtils1 {
    // Code
    public List<String> strSort(List<String> originList) {
        // Code
        //Collections.sort(originList);
        Collections.sort(originList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });
        return originList;
    }
}
