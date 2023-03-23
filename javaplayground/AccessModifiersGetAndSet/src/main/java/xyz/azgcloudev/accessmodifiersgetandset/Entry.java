package xyz.azgcloudev.accessmodifiersgetandset;

public class Entry {

    public static void main(String[] args) {
        Car car = new Car("Honda", "civic", 2008);

        System.out.println(car.getBrand());
        car.setModel("civic ls");
        System.out.println(car.getModel());
    }
}