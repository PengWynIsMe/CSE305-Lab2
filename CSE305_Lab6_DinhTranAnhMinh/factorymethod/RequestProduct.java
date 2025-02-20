import java.time.LocalDate;

public interface RequestProduct {
    void setPriority();

    void setExpire();

    void setStatus();

    void processRequest();
}