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
        System.out.println("ArrayList:" + num);
        for (int x : num) {
            System.out.println(x);
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
    }
}
