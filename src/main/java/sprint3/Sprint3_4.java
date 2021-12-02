package sprint3;
import java.util.*;

public class Sprint3_4 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, List<String>> map1 = new HashMap<>();
        map.put("0967654321", "Petro");
        map.put("0501234567", "Ivan");
        map.put("0677654321", "Petro");
        map.put("0970011223", "Stepan");
        map.put("0631234567", "Ivan");
        map.put("0667653421", "Petro");

        map1.put("Ivan", Arrays.asList("12312","234234"));
        map1.put("Andrey", Arrays.asList("12312","234234"));

        MyUtils4 m = new MyUtils4();
        System.out.println(m.createNotebook(map));
        //System.out.println(m.createNotebook1(map));
        //System.out.println(m.createNotebook2(map));

    }
}

class MyUtils4 {
    // Code
    public Map<String, List<String>> createNotebook(Map<String, String> phones) {
        // Code
        Map<String, List<String>> newList = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(Map.Entry<String, String> entry : phones.entrySet()){
            if(!newList.containsKey(entry.getValue())){
                 list = new ArrayList<>();
                 newList.put(entry.getValue(), list);
                 newList.get(entry.getValue()).add(entry.getKey());
            }
            else{
                newList.put(entry.getValue(), newList.get(entry.getValue()));
                newList.get(entry.getValue()).add(entry.getKey());
            }
        }
        return newList;
    }

    public Map<String, String> createNotebook1(Map<String, String> phones) {
        // Code
        Map<String, String> newList = new HashMap<>();
        Set<Map.Entry<String, String>> entrySet = phones.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            if(newList.containsKey(value)){
                newList.put(value, newList.get(value) + ", " + key);
            } else {
                newList.put(value, key);
            }
        }
        return newList;
    }
}
