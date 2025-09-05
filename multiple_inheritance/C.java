package multiple_inheritance;

public class C implements A, B {

    @Override
    public void play() {
        System.out.println("Playing in C");
    }
}
