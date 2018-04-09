package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
//Rock Element: beats scissors and Lizard, loses to Paper and Spock
public class Rock extends Element {
    public Rock(String name) {
        super(name);
    }

    @Override
    public String compareTo(Element e) {
        String situation;
        String output;
        Outcome o = new Outcome();
        //compares element to other player 'e'
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
        } else {
            situation = "Rock equals Rock";
            output = "Tie";
        }
        //merges the situation and output
        return o.compare(situation, output);
    }
}