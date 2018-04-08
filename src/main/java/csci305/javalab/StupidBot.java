package csci305.javalab;
import java.util.Random;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class StupidBot extends Player {
    private Element move;
    private int chooser;

    public StupidBot(String name) {
        super(name);
        Random chooser = new Random();
        this.chooser = chooser.nextInt(5);
    }

    @Override
    public Element play() {
        switch (chooser){
            case 1:
                move = Main.moves.get("Rock");
                break;
            case 2:
                move = Main.moves.get("Paper");
                break;
            case 3:
                move = Main.moves.get("Scissors");
                break;
            case 4:
                move = Main.moves.get("Lizard");
                break;
            default:
                move = Main.moves.get("Spock");
        }
        return move;
    }
}
