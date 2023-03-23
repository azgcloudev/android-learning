package xyz.azgcloudev.accessmodifiersgetandset;

public class Car {

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }


    // Getters and Setters to access the private properties
    public String getBrand() { return this.brand;}

    public String getModel() {return this.model;}

    public int getYear() { return this.year;}

    public void setBrand(String brand) { this.brand = brand;}
    public void setModel(String model) { this.model = model;}
    public void setYear(int year) { this.year = year;}
}
