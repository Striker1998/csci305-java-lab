package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class Rock extends Element {
    public Rock(String name){
        super(name);
    }
    @Override
    public String compareTo(Element e) {
        String situation;
        String output;
        Outcome o = new Outcome();
        if (e.getName().equals("Paper")) {
            situation = "Paper covers Rock";
            output = "Lose";
        } else if (e.getName().equals("Scissors")) {
            situation = "Rock crushes Scissors";
            output = "Win";
        } else if (e.getName().equals("Spock")) {
            situation = "Spock vaporizes Rock";
            output = "Lose";
        } else if (e.getName().equals("Lizard")) {
            situation = "Rock crushes Lizard";
            output = "Win";
        } else{
            situation = "Rock equals Rock";
            output = "Tie";
        }
        return o.compare(situation, output);
    }
}