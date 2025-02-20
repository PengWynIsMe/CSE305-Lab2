import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().toString(); // Ngày hiện tại
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately!");
    }
}