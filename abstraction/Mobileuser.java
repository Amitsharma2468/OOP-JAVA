package abstraction;

public abstract class Mobileuser {

    abstract void sendMessage();

    void call() {
        System.out.println("Calling..."); //not abstract method
    }
}
