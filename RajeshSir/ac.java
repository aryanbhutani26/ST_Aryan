// public class Oops {

//     public static void main(String[] args) {

//     }
// }

    // Construct an OOPS program to show the functions of an AC

public class ac {
    // State
    boolean Start;
    int temperature;
    String swing;
    int fanspeed;

    // Behaviour
    public void Switch(boolean val) {
        Start = val;
        if (Start == true) {
            System.out.println("AC is ON");
            Start = false;
        } else {
            System.out.println("AC is OFF");
            Start = true;
        }
    }

    public void increasetemp() {
        if (temperature == 31) {
            System.out.println("Temperature is already at maximum");
            return;
        }
        System.out.println("Temperature is at " + temperature);
        temperature++;
    }

    public void decreasetemp() {
        if (temperature == 16) {
            return;
        }
        temperature--;
    }

   
}