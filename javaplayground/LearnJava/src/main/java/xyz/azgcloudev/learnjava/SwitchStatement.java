package xyz.azgcloudev.learnjava;

public class SwitchStatement {

    public static void main(String[] args) {
        int command = 0;

        switch (command) {
            case 0:
                System.out.println("Run north");
                break;  // to exit the switch
            case 1:
                System.out.println("Run east");
                break;
            case 2:
                System.out.println("Run west");
                break;
            case 4:
                System.out.println("Run south");
                break;
            default:
                System.out.println("Wrong command");
                break;
        }
    }

}
