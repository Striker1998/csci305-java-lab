package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
//Scissors Element: beats Paper and Lizard. Loses to Rock and Spock
public class Scissors extends Element {
    public Scissors(String name) {
        super(name);
    }

    @Override
    public String compareTo(Element e) {
        String situation;
        String output;
        Outcome o = new Outcome();
        //compares element to other player 'e'
        if (e.getName().equals("Paper")) {
            situation = "Scissors cuts Paper";
            output = "Win";
        } else if (e.getName().equals("Rock")) {
            situation = "Rock crushes Scissors";
            output = "Lose";
        } else if (e.getName().equals("Spock")) {
            situation = "Spock smashes Scissors";
            output = "Lose";
        } else if (e.getName().equals("Lizard")) {
            situation = "Scissors decapitates Lizard";
            output = "Win";
        } else {
            situation = "Scissors equals Scissors";
            output = "Tie";
        }
        //merges the situation and output
        return o.compare(situation, output);
    }
}
