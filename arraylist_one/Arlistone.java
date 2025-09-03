package arraylist_one;

import java.util.ArrayList;
import java.util.Iterator;

public class Arlistone {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("size:" + num.size());

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(3, 40);
        num.set(0, 50);
        boolean contains = num.contains(30);
        System.out.println("ArrayList contains 30? " + contains);
        int pos = num.indexOf(20);
        System.out.println("Position of 20 in ArrayList: " + pos);
        int x = num.get(0);
        System.out.println("Value at index 0: " + x);
        System.out.println("ArrayList:" + num);
        for (int y : num) {
            System.out.println(y);
        }
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("size:" + num.size());
        num.remove(2);
        System.out.println("ArrayList:" + num);
        System.out.println("size:" + num.size());
        num.removeAll(num);
        System.out.println("ArrayList:" + num);
        System.out.println("size:" + num.size());
        num.add(50);
        System.out.println("ArrayList:" + num);
        boolean check = num.isEmpty();
        System.out.println("Is ArrayList empty? " + check);
        num.clear();
        System.out.println("ArrayList after clear:" + num);
        boolean check1 = num.isEmpty();
        System.out.println("Is ArrayList empty? " + check1);
    }
}
