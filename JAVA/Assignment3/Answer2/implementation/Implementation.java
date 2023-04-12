package implementation;
import mypackage.AOne;
import mypackage.BOne;
import mypackage.COne;
import mypackage.IOne;

public class Implementation {

    public static void main(String[] args) {
        IOne[] objects = new IOne[3];
        objects[0] = new AOne();
        objects[1] = new BOne();
        objects[2] = new COne();

        for(IOne obj : objects) {
            obj.f1();
            System.out.println(obj.f2());
        }
    }
    
}
