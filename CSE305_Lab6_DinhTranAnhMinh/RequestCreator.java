
public abstract class RequestCreator {
    public abstract RequestProduct createRequest();

    public void processRequest() {
        RequestProduct request = createRequest();
        request.setPriority();
        request.setExpire();
        request.setStatus();
        request.processRequest();
    }
}
