package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
//Plays the last move the player used.
public class LastPlayBot extends Player {
    public LastPlayBot(String name) {
        super(name);
    }

    //overridden play method
    @Override
    public Element play() {
        //sets move to the last move
        Element move = last;
        //if first move, use RandomBot to perform the next move.
        if (move == null) {
            Player ran = new RandomBot("RandomBot");
            move = ran.play();
        }
        return move;
    }
}
