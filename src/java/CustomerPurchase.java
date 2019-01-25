import java.util.Scanner;

public class CustomerPurchase {

    public static void main(String[] args)
    {
        //initialize Scanners for input
        Scanner scanName = new Scanner(System.in);
        Scanner scanAmount = new Scanner(System.in);
        Scanner scanCode = new Scanner(System.in);

        //set variables
        String name;   //customer name
        double prchAmt; // purchase amount
        int taxCode;   //tax code
        double total = 0; //total amount with tax
        double taxAmt = 0; //tax percent expressed as decimal
        int taxPrc = 0;    //tax expressed as a percentage

        //ask for input
        System.out.print("Enter customer name: ");
        name = scanName.next();
        System.out.print("Enter amount purchased: ");
        prchAmt = scanAmount.nextDouble();
        System.out.print("Enter tax code: ");
        taxCode = scanCode.nextInt();

        //switch case for tax code
        switch (taxCode) {

            case 0:
                taxAmt = 0;     //tax is 0%
                break;
            case 1:
                taxAmt = 0.03;  //tax is 3%
                break;
            case 2:
                taxAmt = 0.05;  //tax is 5%
                break;
            case 3:
                taxAmt = 0.07;  //tax is 7%
                break;
        }

        //calculate total amount due
        total = prchAmt + (prchAmt * taxAmt);
        taxPrc = (int) (taxAmt * 100);


        //show output
        System.out.println("Customer Name: " + name);
        System.out.printf("Purchase Amount: $%.02f \n", prchAmt);
        System.out.println("Sales Tax Amount: " + taxPrc + "%");
        System.out.println("Total Amount Due: $" + total);
    }
}
