package arrayListChuong4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("java");
        arrListString.add("javaOPP");
        arrListString.add("C++");
        arrListString.add("python");
        for( int i=0;i<arrListString.size();i++){
            System.out.println(arrListString.get(i));
        }
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        arrayListInt.add(2);
        arrayListInt.add(5);
        arrayListInt.add(7);
        arrayListInt.add(9);
        for(int number : arrayListInt) {
            System.out.println(number  + "\t");
        }
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.5f);
        arrListFloat.add(3f);
        arrListFloat.add(5.6f);
        arrListFloat.add(5.8f);
       Iterator<Float> iterator = arrListFloat.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
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
}
       }
