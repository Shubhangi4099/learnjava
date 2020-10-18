import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double[] temperature;
        temperature = enterTemps();
        displayTemps(temperature);
    }

    static double[] enterTemps() {
        var keyboard = new Scanner(System.in);
        var temperatureOut = new double[3];
        for (int i = 0; i < temperatureOut.length; ++i) {
            System.out.println("Enter max temperature for day " + (i + 1));
            temperatureOut[i] = keyboard.nextDouble();
        }
        return temperatureOut;
    }

    static void displayTemps(double[] temperatureIn) {
        System.out.println();
        System.out.println("*** Temperatures Entered ***");
        System.out.println();
        for (int i = 0; i < temperatureIn.length; ++i) {
            System.out.println("Day " + (i + 1) + " " + temperatureIn[i]);
        }
    }
}

