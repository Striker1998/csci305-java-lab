package csci305.javalab;

import java.util.Random;

/**
 * Created by kylewebster1 on 3/26/18.
 */
//play uses the strategy of: if it won the last round, then play your opponent's last move, if it lost or tied, then choose between what would beat the move your opponent made.
public class MyBot extends Player {
    Element move, last;

    public MyBot(String name) {
        super(name);
    }

    //Override method play()
    @Override
    public Element play() {
        //if first play, use RandomBot to get random move
        if (last == null) {
            Player p1 = new RandomBot("RandomBot");
            move = p1.play();
            return move;
        } else {
            //determines if the last play was a win or loss
            String win = move.compareTo(last);
            Random rand = new Random();
            //if a win, play the last move
            if (win.endsWith("Win")) {
                return last;
            }
            //if a loss or tie, play the move that would beat the opponent's last move
            else {
                int chooser = rand.nextInt(2);
                //randomly chooses between 2 Elements that beat's what the opponent last played.
                switch (last.getName()) {
                    //randomly choose between paper or spock
                    case "Rock":
                        if (chooser == 1) {
                            move = Main.moves.get("Paper");
                        } else {
                            move = Main.moves.get("Spock");
                        }
                        break;
                    //randomly choose between rock or spock
                    case "scissors":
                        if (chooser == 1) {
                            move = Main.moves.get("Rock");
                        } else {
                            move = Main.moves.get("Spock");
                        }
                        break;
                    //randomly choose between scissors or lizard
                    case "paper":
                        if (chooser == 1) {
                            move = Main.moves.get("Scissors");
                        } else {
                            move = Main.moves.get("Lizard");
                        }
                        break;
                    //randomly choose between scissors or rock
                    case "lizard":
                        if (chooser == 1) {
                            move = Main.moves.get("Scissors");
                        } else {
                            move = Main.moves.get("Rock");
                        }
                        break;
                    //randomly choose between lizard or paper to beat spock
                    default:
                        if (chooser == 1) {
                            move = Main.moves.get("Lizard");
                        } else {
                            move = Main.moves.get("Paper");
                        }
                }
            }
            return move;
        }
    }
}


