import java.util.Scanner;
public class Adventure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();

        if (command.equals("n")) {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys.");

        }
        if (command.equals("s")) {
            System.out.println("You died from ingesting too much salt water");
            /* add nested if statements for possible next actions! */
        }
        if (command.equals("e")) {
            System.out.println("you went into the shack, contracted the black plague from eating a dead rat. a week later you died from a sharknado attack." );
            /* add nested if statements for possible next actions! */
        }
        if (command.equals("w")) {
            System.out.println("You found a city of Amazonian warrior women, three days later you died from exhaustion with a smile on your face.");
            /* add nested if statements for possible next actions! */
        }
        else
            System.out.println("You died because you were being a naughty player");



        System.out.println("End of adventure!");
    }
}


