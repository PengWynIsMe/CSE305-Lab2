import java.time.LocalDate;

public class MidPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().plusMonths(1).toString(); // Một tháng từ hôm nay
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accepted, estimated completion date is " + expireDay);
    }
}