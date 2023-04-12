package implementationexample;
import mypackage.IThree;
import mypackage.ITwo;
import mypackage.Test1;
import mypackage.Test2;

public class ImplementationExample {

    public static void main(String[] args) {
        ITwo obj = new Test1();
        // runtime exception detected, need to call func2
        if (obj instanceof IThree) {
            IThree obj3 = (IThree) obj;
            obj3.func2();
        }
    }
    
}
