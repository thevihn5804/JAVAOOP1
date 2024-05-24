package Slide89chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide89Chuong4 {
     public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");
        //trong truong hop nay ta thay
        //key cua Quang Nam va Quang Ninh
        //deu la QN ne chuong trinh se them
        //vao trong hashMapCity value dung sau(tuc la Quang Ninh)
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM","Thanh Pho Ho Chi Minh");
        System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        //lay thanh pho co ma la QNg va hien thi ten thanh pho
        System.out.println("QNg " + hashMapCity.get(" QNg"));
        //lay thanh pho co ma la NT
        //vi khong cos trong hashMapCity nen tra ve gia tri Null
        System.out.println("NT " + hashMapCity.get(" NT"));
        //de kiem tra xem 1 value co trong HashMap hay khong
        //chung ta se dung phuong thuc contrainsValue()
        if(hashMapCity.containsKey("Thanh Pho Ho Chi Minh"));
        System.out.println("Co Thanh Pho Ho Chi Minh trong hashMapCity");
    }
}
