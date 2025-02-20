
public class FactoryMethodTest {
    public static void main(String[] args) {
        // Tạo ra các factory cho các loại yêu cầu khác nhau
        RequestCreator lowPriorityCreator = new LowPriorityConcreteCreator();
        RequestCreator midPriorityCreator = new MidPriorityConcreteCreator();
        RequestCreator highPriorityCreator = new HighPriorityConcreteCreator();

        // Gọi phương thức processRequest() từ các factory
        System.out.println("Creating and processing Low Priority Request:");
        lowPriorityCreator.processRequest();

        System.out.println("\nCreating and processing Mid Priority Request:");
        midPriorityCreator.processRequest();

        System.out.println("\nCreating and processing High Priority Request:");
        highPriorityCreator.processRequest();
    }
}
