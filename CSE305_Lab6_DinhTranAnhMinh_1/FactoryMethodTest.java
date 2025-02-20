
import java.util.Scanner;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose request type (low/mid/high): ");
        String requestType = scanner.nextLine().toLowerCase();

        RequestCreator requestCreator = null;

        switch (requestType) {
            case "low":
                requestCreator = new LowPriorityConcreteCreator();
                break;
            case "mid":
                requestCreator = new MidPriorityConcreteCreator();
                break;
            case "high":
                requestCreator = new HighPriorityConcreteCreator();
                break;
            default:
                System.out.println("Invalid request type!");
                scanner.close();
                return;
        }

        requestCreator.processRequest();
        scanner.close();
    }
}
