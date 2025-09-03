package basic_array;

public class Array_one {

    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        System.out.println("Array size:" + numbers.length);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
