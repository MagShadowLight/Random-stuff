import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to Maid Application. We will ask you a series of questions for you to answer.");
        System.out.println("1. What's your IGN:");
        String name = reader.nextLine();
        System.out.println("2. What's your age (note: you can type 0 if you don't want to disclose it!)");
        int age = Integer.valueOf(reader.nextLine());
        System.out.println("3. At what point in the game are you at?");
        String gamesave = reader.nextLine();
        System.out.println("4. What would you say your reputation is like?");
        String reputation = reader.nextLine();
        System.out.println("5. Do you see yourself being a part of maids for a while?");
        String maids = reader.nextLine();
        System.out.println("6. Do you enjoy playing with others?");
        String social = reader.nextLine();
        System.out.println("7. What are you looking for in a guild?");
        String guild = reader.nextLine();
        System.out.println("8. Would you be interest in forming a blood contract eternally binding to grind portal to donate mats to maids forever and ever?");
        String portal = reader.nextLine();
        System.out.println("You wrote:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gamesave);
        System.out.println(reputation);
        System.out.println(maids);
        System.out.println(social);
        System.out.println(guild);
        System.out.println(portal);

    }
}