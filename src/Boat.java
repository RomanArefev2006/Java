public class Boat implements Vehicle{
    @Override
    public void start() {
        System.out.println("пополыл");
    }
    @Override
    public void stop() {
        System.out.println("утонул -_-");
    }
}
