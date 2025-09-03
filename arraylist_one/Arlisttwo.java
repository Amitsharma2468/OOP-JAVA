package arraylist_one;

import java.util.ArrayList;

public class Arlisttwo {

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num2.add(40);
        num2.add(50);
        num2.add(60);
        num3.addAll(num1);
        System.out.println("ArrayList 1: " + num1);
        System.out.println("ArrayList 2: " + num2);
        System.out.println("ArrayList 3: " + num3);

        boolean result = num1.equals(num2);
        System.out.println("ArrayList 1 equals ArrayList 2? " + result);

        boolean result1 = num1.equals(num3);
        System.out.println("Arraylist 1 equals ArrayList 3? " + result1);
    }
}
