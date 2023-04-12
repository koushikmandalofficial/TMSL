package mypackage;

public class BOne implements IOne {
    @Override
    public void f1() {
        System.out.println("BOne.f1() called.");
    }

    @Override
    public String f2() {
        return "BOne.f2() called.";
    }
}
