package csci305.javalab;

import java.util.Random;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class IterativeBot extends Player{
    Element move = null;
    public IterativeBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        if (move != null){
            switch (move.getName()){
                case "Rock":
                    move = Main.moves.get("Paper");
                    break;
                case "Paper":
                    move = Main.moves.get("Scissors");
                    break;
                case "Scissors":
                    move = Main.moves.get("Scissors");
                    break;
                case "Lizard":
                    move = Main.moves.get("Spock");
                    break;
                default:
                    move = Main.moves.get("Rock");
            }
        }
        else{
            Random rand = new Random();
            int chooser = rand.nextInt(5);
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
        }
        return move;
    }
}
