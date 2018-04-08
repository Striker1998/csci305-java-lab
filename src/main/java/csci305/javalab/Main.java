package csci305.javalab;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by kylewebster1 on 3/28/18.
 */
public class Main {
    public static final Map<String, Element> moves = new HashMap();
    public static void main(String args[]) {
        // Elements
        Rock rock = new Rock("Rock");
        Paper paper = new Paper("Paper");
        Scissors scissors = new Scissors("Scissors");
        Lizard lizard = new Lizard("Lizard");
        Spock spock = new Spock("Spock");

        // Create mapping
        moves.put("Rock", rock);
        moves.put("Paper", paper);
        moves.put("Scissors", scissors);
        moves.put("Lizard", lizard);
        moves.put("Spock", spock);

        Scanner reader = new Scanner(System.in);
        Player player1, player2;
        int p1 = 0, p2 = 0;
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Kyle Webster.\n");
        System.out.println("Please choose two players:\n" +
                "     (1) Human\n" +
                "     (2) StupidBot\n" +
                "     (3) RandomBot\n" +
                "     (4) IterativeBot\n" +
                "     (5) LastPlayBot\n" +
                "     (6) MyBot\n");

        while (p1 == 0) {
            try {
                System.out.print("Select player 1: ");
                p1 = reader.nextInt();
            } catch (Exception e) {
                p1 = 0;
                System.out.println("Invalid input. Try again.");
            }
        }
        switch (p1) {
            case 1:
                player1 = new Human("Human");
                break;
            case 2:
                player1 = new StupidBot("StupidBot");
                break;
            case 3:
                player1 = new RandomBot("RandomBot");
                break;
            case 4:
                player1 = new IterativeBot("IterativeBot");
                break;
            case 5:
                player1 = new LastPlayBot("LastPlayBot");
                break;
            default:
                player1 = new MyBot("Mybot");
        }


        while (p2 == 0) {
            try {
                System.out.print("Select player 1: ");
                p2 = reader.nextInt();
            } catch (Exception e) {
                p2 = 0;
                System.out.println("Invalid input. Try again.");
            }
        }
        switch (p2) {
            case 1:
                player2 = new Human("Human");
                break;
            case 2:
                player2 = new StupidBot("StupidBot");
                break;
            case 3:
                player2 = new RandomBot("RandomBot");
                break;
            case 4:
                player2 = new IterativeBot("IterativeBot");
                break;
            case 5:
                player2 = new LastPlayBot("LastPlayBot");
                break;
            default:
                player2 = new MyBot("Mybot");
        }
        System.out.println(player1.getName() + " vs " + player2.getName() + ". Go!");

            int p1wins = 0, p2wins = 0;
            for (int i = 0; i < 5; i++) {
                Element p1move = player1.play();
                Element p2move = player2.play();
                System.out.println("Player 1 choose: " + p1move.getName());
                System.out.println("Player 2 choose: " + p2move.getName());
                String condition = p1move.compareTo(p2move);
                System.out.println(condition);
                if (condition.endsWith("Win")) {
                    System.out.println("Player 1 won the round\n");
                    p1wins++;
                } else if (condition.endsWith("Lose")) {
                    System.out.println("Player 2 won the round\n");
                    p2wins++;
                } else {
                    System.out.println("Round was a tie");
                }
                if (player1 instanceof LastPlayBot || player1 instanceof MyBot)
                {
                    player1.last = p2move;
                }
                if (player1 instanceof LastPlayBot || player1 instanceof MyBot)
                {
                    player2.last = p1move;
                }
            }
            System.out.println("The Score is " + p1wins + " to " + p2wins);
            if (p1wins > p2wins) {
                System.out.println("Player 1 won");
            } else if (p2wins > p1wins) {
                System.out.println("Player 2 won");
            } else {
                System.out.println("The game was a draw");
            }
        }
    }

