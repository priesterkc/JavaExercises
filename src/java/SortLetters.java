import com.sun.deploy.util.SyncAccess;

import java.util.Arrays;
import java.util.Scanner;

public class SortLetters {

    public static void main(String[] args)
    {
        //initialize Scanners for input
        Scanner scanLet = new Scanner(System.in);

        //set variables
        String let1, let2, let3;
        String[] letters;

        //set 3 position holders in array
        letters = new String[3];

        //ask for input
        System.out.println("Enter first letter: ");
        let1 = scanLet.next();
        System.out.println("Enter second letter: ");
        let2 = scanLet.next();
        System.out.println("Enter third letter: ");
        let3 = scanLet.next();

        //store values in array
        letters[0] = let1;
        letters[1] = let2;
        letters[2] = let3;

        //sort letters and print out sorted letters
        Arrays.sort(letters);

        for (int letter = 0; letter < letters.length; letter++)
        {
            System.out.print(letters[letter]);
        }
    }
}
