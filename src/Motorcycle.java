public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        if (hasSidecar) {
            System.out.println("Number of doors: yas");
        } else {
            System.out.println("Number of doors: no");
        }
    }
}
