import java.util.Random;
import java.util.Scanner;
class DieRoller{
    Random dice = new Random();
    public int generateRandomNumber(){
         return dice.nextInt(1,6);
    }
}


public class Task8 {
    public static void main(String[] args){
        boolean secondaryDone = false;
        DieRoller die_1 = new DieRoller();
        DieRoller die_2 = new DieRoller();
        DieRoller die_3 = new DieRoller();
        Scanner input = new Scanner(System.in);
        boolean done = false;
        int i;
        do{
            i = 1;

            do{
                System.out.println();
                System.out.println("Rolls      Die1      Die2      Die3       Sum");
                System.out.println("__________________________________________________");
                int num_die1 = die_1.generateRandomNumber();
                int num_die2 = die_2.generateRandomNumber();
                int num_die3 = die_3.generateRandomNumber();

                if(num_die1 == num_die2 && num_die1 == num_die3){
                    done = true;
                }

                System.out.printf("%-8d   %-8d   %-8d   %-8d   %-8d",i,num_die1,num_die2,num_die3,(num_die1+num_die2+num_die3));
                i += 1;

            }while (!done);

            System.out.println("\n Do you want to roll again");
            if(input.hasNextLine()){
                if(input.nextLine().equalsIgnoreCase("Y")){
                    done = false;
                }
                else{
                    secondaryDone = true;
                }

            }
            else{
                System.out.println("wrong input type, please enter again");
            }

        }while(!secondaryDone);
    }
}
