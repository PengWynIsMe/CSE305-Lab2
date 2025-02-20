
import java.util.Scanner;

public abstract class RequestCreator {
    public abstract RequestProduct createRequest();

    public void processRequest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Priority: ");
        String priority = scanner.nextLine();

        System.out.print("Enter Expire Date (YYYY-MM-DD): ");
        String expireDay = scanner.nextLine();

        System.out.print("Enter Status: ");
        String status = scanner.nextLine();

        RequestProduct request = createRequest();
        request.setPriority(priority);
        request.setExpire(expireDay);
        request.setStatus(status);
        request.processRequest();

        scanner.close();
    }
}
