package xyz.azgcloudev.learnjava;

public class OopConstructors {

    public static void main(String[] args) {

        Bike myBike = new Bike();
        myBike.model = "cbr600";
        Bike yourBike =  new Bike("Honda", "CBR", "black");

        System.out.println(yourBike.model);
        System.out.println(myBike.model);
    }
}
