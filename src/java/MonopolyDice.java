import java.util.Random;

public class MonopolyDice {

    public static void main(String[] args)
    {
        //initialize randomizer
        Random r = new Random();

        //set variables
        int dice1, dice2, total, turns;

        turns = 0;

        //while loop of dice rolls
        while (turns <= 3) {
            //roll dice
            dice1 = 1 + r.nextInt(6);
            dice2 = 1 + r.nextInt(6);
            total = dice1 + dice2;

            System.out.printf("User rolled %d & %d \n", dice1, dice2);

            if (dice1 != dice2) {
                System.out.printf("Move %d spaces and stop", total);
                break;
            }
            if (dice1 == dice2) {
                System.out.println("DOUBLES!");
                if (turns == 3) {
                    System.out.println("GO TO JAIL --->");
                    break;
                }
                else {
                    System.out.printf("Move %d spaces and roll again \n", total);
                }
            }
        }
    }
}
