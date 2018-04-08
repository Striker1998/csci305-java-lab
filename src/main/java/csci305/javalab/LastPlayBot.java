package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class LastPlayBot extends Player {
    public LastPlayBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Element move;
        if(last == null) {
            Player ran = new RandomBot("RandomBot");
            move = ran.play();
        }
        else{
            switch (last.getName()){
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
        return move;
    }
}
