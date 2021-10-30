import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static Map<String, String> removeByName(Map<String, String> map, String name) {
        Map<String, String> copy = new HashMap<>(map);
        for(String m: map.keySet())
            if(map.get(m).equals(name))
                copy.remove(m, map.get(m));
        return copy;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Khoma", "Marta");
        map.put("Oleksiuk", "Volodya");
        map.put("Shchurko", "Tanya");
        map.put("Maksymets", "Nazar");
        map.put("Marych", "Oleg");
        map.put("Hoyna", "Liana");
        map.put("Svystun", "Oksana");
        map.put("Stanko", "Tanya");
        map.put("Pastushenko", "Oleg");
        map.put("Maksymiv", "Yura");

        for(String m: map.keySet())
            System.out.println(m+"  " + map.get(m));

        System.out.println("Remove People with name Oleg");
        System.out.println(removeByName(map,"Oleg"));

    }
}
