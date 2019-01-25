import java.util.Scanner;

public class RainfallRunOff {

    public static void main(String[] args)
    {
        //set Scanners for input
        Scanner scanDim = new Scanner(System.in);
        Scanner scanRain = new Scanner(System.in);

        //set variables
        int roofLen, roofWid;
        double rainfall, gallons, runOff;

        //ask for input
        System.out.println("Enter roof length dimension: ");
        roofLen = scanDim.nextInt();
        System.out.println("Enter roof width dimension: ");
        roofWid = scanDim.nextInt();
        System.out.println("Enter amount of rainfall: ");
        rainfall = scanRain.nextDouble();

        //calculate roof dimensions in inches
        roofLen = roofLen * 12;
        roofWid = roofWid * 12;

        //calculate rain run-off
        runOff = roofLen * roofWid * rainfall;

        //calculate total gallons of rain run-off
        gallons = runOff / 231;

        System.out.printf("There was %.02f gallons of rain run-off.", gallons);
    }
}
