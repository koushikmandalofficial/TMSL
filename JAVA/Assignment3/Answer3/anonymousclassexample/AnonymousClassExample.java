package anonymousclassexample;
import mypackage.IOne;

public class AnonymousClassExample {
    public static void main(String[] args) {
       IOne obj = new IOne() {
            public void display() {
                System.out.println("This is an anonymous class implementation of the IOne interface");
            }
        };
            obj.display();
    }
    
}
