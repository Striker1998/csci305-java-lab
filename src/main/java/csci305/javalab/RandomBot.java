package csci305.javalab;

import java.util.Random;

/**
 * Created by kylewebster1 on 3/26/18.
 */
//Randomly chooses what to play
public class RandomBot extends Player {
    private Element move;

    public RandomBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Random rand = new Random();
        //random value from 0 to 4
        int chooser = rand.nextInt(5);
        switch (chooser) {
            //each case assigns a number to the main moves map elements
            case 0:
                move = Main.moves.get("Rock");
                break;
            case 1:
                move = Main.moves.get("Paper");
                break;
            case 2:
                move = Main.moves.get("Scissors");
                break;
            case 3:
                move = Main.moves.get("Lizard");
                break;
            default:
                move = Main.moves.get("Spock");
        }
        return move;
    }
}
