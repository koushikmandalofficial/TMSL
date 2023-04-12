package mypackage;

public class AOne implements IOne {
    @Override
    public void f1() {
        System.out.println("AOne.f1() called.");
    }

    @Override
    public String f2() {
        return "AOne.f2() called.";
    }
}

