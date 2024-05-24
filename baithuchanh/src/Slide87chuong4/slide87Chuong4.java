package Slide87chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide87Chuong4 {
    public static void main(String[] args) {
        //khai bao mot Hasmap co ten la hasmap
        //kieu du lieu cua key va value la String
        HashMap<String, String> hashMap = new HashMap<>();
        //them value vao trong hasMap voi key tuong ung
        //su dung phuong thuc put()
        //doi so thu nhat trong put() la key co kieu la String
        //va doi so thu hai la value co kieu String
        hashMap.put("CSLT", "Co So Lap Trinh");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");
        //tao mot set co ten la setHashMap
        //chua toan bo cac entry(vua key vua value) cua hasMap
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong setHashMap: " + setHashMap);

    }
}
