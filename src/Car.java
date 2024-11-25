public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("авто заводится");
    }
    @Override
    public void stop() {
        System.out.println("авто остановилось");
    }
}
