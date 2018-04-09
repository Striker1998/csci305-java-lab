package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
//iterates through each of the different moves.
public class IterativeBot extends Player {
    Element move = null;

    public IterativeBot(String name) {
        super(name);
    }

    //override method play()
    @Override
    public Element play() {
        //if not first round, iterate to the next move
        if (move != null) {
            switch (move.getName()) {
                case "Rock":
                    move = Main.moves.get("Paper");
                    break;
                case "Paper":
                    move = Main.moves.get("Scissors");
                    break;
                case "Scissors":
                    move = Main.moves.get("Lizard");
                    break;
                case "Lizard":
                    move = Main.moves.get("Spock");
                    break;
                default:
                    move = Main.moves.get("Rock");
            }
        }
        //if first round, then use RandomBot to randomly choose a move.
        else {
            Player p1 = new RandomBot(this.getName());
            move = p1.play();
        }
        return move;
    }
}
