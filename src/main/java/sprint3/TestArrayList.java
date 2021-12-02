package sprint3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, List<String>> map1 = new HashMap<>();
        map.put("0967654321", "Petro");
        map.put("0677654321", "Petro");
        map.put("0501234567", "Ivan");
        map.put("0970011223", "Stepan");
        map.put("0631234567", "Ivan");
        map.put("0667653421", "Petro");

        map1.put("Ivan", new ArrayList<>());
        //map1.get("Ivan").add();
        //map1.put("Andrey", Arrays.asList("12312","234234"));
        System.out.println(map1);
        //MyUtils4 m = new MyUtils4();
        //System.out.println(m.createNotebook(map));
    }
}
