package csci305.javalab;
import java.util.Scanner;
/**
 * Created by kylewebster1 on 3/26/18.
 */
public class Human extends Player {
    public Human(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Element move = null;
        int name = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("(1) : Rock");
        System.out.println("(2) : Paper");
        System.out.println("(3) : Scissors");
        System.out.println("(4) : Lizard");
        System.out.println("(5) : Spock");
        while (name >= 0 && name <= 5 ){
            try{
                System.out.print("Enter your move: ");
                name = reader.nextInt();
            }
            catch (Exception e){
                name = 0;
            }
            if (name == 0 || name > 5){
                System.out.println("Invalid move. Please try again.");
            }
        }
        switch(name){
            case 1:
                move = rock;
                break;
            case 2:
                move = paper;
                break;
            case 3:
                move = scissors;
                break;
            case 4:
                move = lizard;
                break;
            default:
                move = spock;
        }

        return move;
    }
}
