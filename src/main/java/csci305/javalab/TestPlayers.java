package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
//tests that the StupidBot and LastPlayBot works
public class TestPlayers {

    public static void main(String args[]) {
        Player p1 = new StupidBot("StupidBot");
        Player p2 = new LastPlayBot("LastPlayBot");
        Element p1move = p1.play();
        Element p2move = p2.play();
        System.out.println(p1move.compareTo(p2move));
    }
}