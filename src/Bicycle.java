public class Bicycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("сел на велосипед");
    }
    @Override
    public void stop() {
        System.out.println("встал с велосипеда");
    }
}
