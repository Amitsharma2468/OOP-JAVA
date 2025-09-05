package abstraction;

public class Test {

    public static void main(String[] args) {
        Mobileuser user;
        user = new Rahim();
        user.sendMessage();
        user.call();
        user = new Karim();
        user.sendMessage();
        user.call();
    }
}
