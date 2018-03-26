package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class TestElements {

        public static void main(String args[]) {
            Element rock = new Rock("Rock");
            Element paper = new Paper("Paper");
            System.out.println(rock.compareTo(paper));
            System.out.println(paper.compareTo(rock));
            System.out.println(rock.compareTo(rock));
        }
    }

