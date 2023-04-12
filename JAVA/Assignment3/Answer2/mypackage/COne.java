package mypackage;

public class COne implements IOne {
    @Override
    public void f1() {
        System.out.println("COne.f1() called.");
    }

    @Override
    public String f2() {
        return "COne.f2() called.";
    }
}

