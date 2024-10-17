public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
