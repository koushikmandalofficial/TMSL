package people;
import java.util.Scanner;
import mypackage.TV;
import mypackage.TVRemoteControl;

public class People {
    public static void main(String[] args) {
        TV tv = new TV();
        TVRemoteControl remote = new TVRemoteControl(tv);

        int input;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Volume Up");
            System.out.println("2. Volume Down");
            System.out.println("3. Channel Up");
            System.out.println("4. Channel Down");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            input = scanner.nextInt();

            switch (input) {
                case 1:
                    remote.pressVolumeUpButton();
                    System.out.println("Current TV volume: " + tv.getVolume());
                    break;
                case 2:
                    remote.pressVolumeDownButton();
                    System.out.println("Current TV volume: " + tv.getVolume());
                    break;
                case 3:
                    remote.pressChannelPlusButton();
                    System.out.println("Current TV channel: " + tv.getChannel());
                    break;
                case 4:
                    remote.pressChannelMinusButton();
                    System.out.println("Current TV channel: " + tv.getChannel());
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            System.out.println(); 
        } while (input != 0);
    }
    
}
