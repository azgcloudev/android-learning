package xyz.aldairzamora.bgn.four.base;

public abstract class Human { // setting the class as abstract

    // LOCAL VARIABLES
    //making LIFESPAN public to be abstract in this class
    public static final int LIFESPAN = 100; // final declares the variable as constant

    // FIELDS (properties)
    private String name;
    private int age;
    private float height;

    // CONSTRUCTORS

    /**
     * Default constructor with no parameters
     * @return
     */
        public Human() { }

    // use different parameters
    /**
     * Constructs a Human instance initialized with the given parameters
     * @param name - the name of the Human instance
     * @param age - the age of the Human instance
     */
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Constructs a Human instance  initialized  with the given parameters.
     * @param name - the name for the Human instance
     * @param age - the age for the Human instance
     * @param height - the height for the Human instance
     */
    public Human(String name, int age, float height) {
        this(name, age); // to avoid rewriting the statement, is already in the previous constructor
        this.height = height;
    }





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
