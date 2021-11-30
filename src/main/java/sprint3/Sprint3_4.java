package sprint3;
import java.util.*;

public class Sprint3_4 {

    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        MyUtils4 m = new MyUtils4();
        //HashMap<String, List<String>> map1 = new HashMap<>();

        map.put("0967654321", "Petro");
        map.put("0677654321", "Petro");
        map.put("0501234567", "Ivan");
        map.put("0970011223", "Stepan");
        map.put("0631234567", "Ivan");
        System.out.println(m.createNotebook(map));
    }
}
class MyUtils4 {
    // Code
    public Map<String, List<String>> createNotebook(Map<String, String> phones) {
        // Code
        Map<String, List<String>> newList = new HashMap<>();
        List<String> listPhones = new ArrayList<>();
        //listPhones.add("123123123");
        //phones = new HashMap<>();
        //HashMap<String, String> map = new HashMap<>();
        //while()
        for(Map.Entry<String, String> entry : phones.entrySet()){
            listPhones.add(entry.getValue());
            //listPhones.

           /* if(phones.containsValue(entry.getValue()))
                listPhones.add(entry.getKey());
            newList.put(entry.getValue(), listPhones);
            System.out.println(entry.getValue());*/
        }
        System.out.println(listPhones);
        return newList;
    }
}
