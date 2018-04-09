package csci305.javalab;

import java.util.Random;

/**
 * Created by kylewebster1 on 3/26/18.
 */
//sticks to first choice
public class StupidBot extends Player {
    private Element move;
    private int chooser;

    public StupidBot(String name) {
        super(name);
        //chooses number from 0 to 5
        Random chooser = new Random();
        this.chooser = chooser.nextInt(5);
    }

    @Override
    public Element play() {
        //chooses which move to use depending on predetermined chooser.
        switch (chooser) {
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
