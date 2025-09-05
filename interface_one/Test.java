package interface_one;

public class Test {

    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.eat();
        a = new Cat();
        a.eat();
    }
}
