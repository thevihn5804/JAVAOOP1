package arrayListChuong4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayList {
    public static void main(String[] args) {
        // slide 14 tao 1 arrayList
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("java");
        arrListString.add("javaOPP");
        arrListString.add("C++");
        arrListString.add("python");
        for( int i=0;i<arrListString.size();i++){ //dung vong for chay arrayList slide 17
            System.out.println(arrListString.get(i));
        }
        ArrayList<Integer> arrayListInt = new ArrayList<>(); // arrayList dung for cai tien slide 18
        arrayListInt.add(2);
        arrayListInt.add(5);
        arrayListInt.add(7);
        arrayListInt.add(9);
        for(int number : arrayListInt) {
            System.out.println(number  + "\t");
        }
        // su dung Iterator trong slide19
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.5f);
        arrListFloat.add(3f);
        arrListFloat.add(5.6f);
        arrListFloat.add(5.8f);
       Iterator<Float> iterator = arrListFloat.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
        //su dung ListIterator trong Slide20
        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('a');
        arrListChar.add('b');
        arrListChar.add('c');
        arrListChar.add('d');
        ListIterator<Character> listIterator = arrListChar.listIterator();
        System.out.println("Cac phan tu co trong arrListChar la");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
        }
        // Slide 20 viet chuong trinh su dung 1 so pt cua arrayList
        arrListString.add(0 , "v");
        arrListString.set(1, "da thay doi");
        arrListString.remove(3);
        System.out.println("day la slide 20 chuong4 \n"+"sau khi dung 1 so phuong thuc de thay doi thi cac phan tu trong mang arrString la");
        for(int i=0;i<arrListString.size();i++){
            System.out.println(arrListString.get(i));
        }
        // Slide 22
        ArrayList<String> arrString = new ArrayList<>(3);
        arrString.add("Red");
        arrString.add("Blue");
        arrString.add("Green");
        arrString.add("Orange");
        arrString.add("Pink");
        arrString.remove("Green");
        
}
       }
