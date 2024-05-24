package Slide96chuong4;

import java.util.LinkedHashMap;
import java.util.Set;

public class slide96Chuong4 {
    public static void main(String[] args) {
        //init linkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        // them cac phan tu vao LinkedHashMap
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "C++");
        linkedHashMap.put(3, "PHP");
        linkedHashMap.put(4, "Python");
        //hien thi LinkedHashMap truoc khi xoa
        System.out.println("Truoc khi xoa: ");
        show(linkedHashMap);
        // xoa phan tu
        linkedHashMap.remove(2);
        // hien thi LinkedHashMap sau khi xoa
        System.out.println("sau khi xoa: ");
        show(linkedHashMap);
        
    }

    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for(Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
