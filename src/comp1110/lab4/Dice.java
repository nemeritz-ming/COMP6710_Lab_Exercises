package comp1110.lab4;

import java.util.Random;

public class Dice {
    private final Random r = new Random();

    // Dice bounds (inclusive)
    private int lowerBound; //Lower bound added to make dice more customizable
    private int upperBound; //Maximum limit of dice roll

    public static void main(String[] args) {
        //Test basic dice rolling

        // Create six sided dice (1-6)
        Dice six_sided_dice = new Dice(1,6);

        // Create unusual dice (2-5)
        Dice unusual_dice = new Dice(2,5);

        // Roll 10 times
        for (int i = 0; i < 10; i++){
            System.out.println("(1-6): " + six_sided_dice.rollDice());
            System.out.println("(2-5): " + unusual_dice.rollDice());
        }

        // Update bounds (5-8)
        six_sided_dice.updateLowerBound(5);
        six_sided_dice.updateUpperBound(8);

        // Update bounds (1-10)
        unusual_dice.updateLowerBound(1);
        unusual_dice.updateLowerBound(10);

        // Roll 10 times
        for (int i = 0; i < 10; i++){
            System.out.println("(5-8): " + six_sided_dice.rollDice());
            System.out.println("(1-10): " + unusual_dice.rollDice());
        }
    }

    public Dice(int lowerBound, int upperBound){
        this.lowerBound = 1;
        this.upperBound = upperBound;
    }

    // Adjust the bounds after dice is created
    public void updateLowerBound(int lowerBound){
        lowerBound = lowerBound;
    }

    public void updateUpperBound(int upperBound){
        upperBound = upperBound;
    }

    // Find the range of the dice roll
    public int diceRange() {
        return lowerBound - upperBound;
    }

    // Roll the dice, resulting in random int between lower and upper bound (inclusive)
    // e.g. a dice roll of between 1 - 3 can produce 1,2 or 3.
    public int rollDice(){
        return r.nextInt(this.diceRange()) + upperBound;
    }


}
