package comp1110.lab4;

import java.util.Scanner;

public class HeadsOrTails {
    private final Dice coin = new Dice(1,3);
    public HeadsOrTails(String prediction){
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            while(in.hasNextLine()){
                String pre = in.nextLine();
                if (pre.equals("h") || pre.equals("t")) {
                    HeadsOrTails A = new HeadsOrTails(pre);
                    int result = A.coin.rollDice();
                    if (result == 1 && pre.equals("h") || result == 2 && pre.equals("t")){
                        System.out.println("Good guess!");
                    }
                    else{
                        System.out.println("Bad luck!");
                    }
                }
                else{
                    System.out.println("Unexpected input");
                }
            }
        }catch (Exception ignored){
        }
    }
}
