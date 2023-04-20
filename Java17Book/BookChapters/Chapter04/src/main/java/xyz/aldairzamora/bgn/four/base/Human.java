package xyz.aldairzamora.bgn.four.base;

public class Human {

    // LOCAL VARIABLES
    static final int LIFESPAN = 100; // final declares the variable as constant

    // FIELDS (properties)
    private String name;
    private int age;
    private float height;


    // ENCAPSULATION using getters and setters
    // local variables must be the private
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    // METHODS
    public int computeAndPrintttl() {
        int ttl = LIFESPAN - this.age;
        return ttl;
    }
}
