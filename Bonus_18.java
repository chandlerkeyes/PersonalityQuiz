import java.util.Scanner;

public class Bonus_18 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = " ";
        char userInput1 = ' ';
        char userInput2 = ' ';
        char userInput3 = ' ';
        char yOrN = ' ';

        System.out.println("Hi there! What's your name?");
        name = keyboard.nextLine();
        System.out.println("Hi " + name + "! Want to find out if you're Introvert or Extrovert? (y/n)");
        yOrN = keyboard.next().charAt(0);

        if (yOrN == 'y' || yOrN == 'Y') {
            System.out.println();
            System.out.println("You're going to be asked a series of questions.");
            System.out.println("You'll have two answers to choose from. Enter A or B.");
            System.out.println();
            System.out.println("1) You're in a room filled with people.");
            System.out.println("A) Mind your own business and stay to yourself  B) Approach people, network, and make friends.");
            userInput1 = keyboard.next().charAt(0);
            System.out.println("2) You're given a group assignment at school. Your group is having a tough time cooperating.");
            System.out.println("A) Do all the work yourself without confiding the team. B) Communicate, ask the team mates if they'd");
            System.out.println(" like to meet up and discuss project ideas.");
            userInput2 = keyboard.next().charAt(0);
            System.out.println("3) You see someone getting bullied. They give you a ''help me'' look");
            System.out.println("A) Pretend you didn't see anything. B) Stand up to the bully and save the victim.");
            userInput3 = keyboard.next().charAt(0);

            if ((userInput1 == 'A') && (userInput2 == 'A') && (userInput3 == 'A')) {
                System.out.println(name + ", you're Introvert. You seem to avoid communicating with others");
            }
            if ((userInput1 == 'A') && (userInput2 == 'B') && (userInput3 == 'A')) {
                System.out.println(name + ", you're Introvert. You stay to yourself, but will communicate when you absolutely have to.");
            }
            if ((userInput1 == 'B') && (userInput2 == 'A') && (userInput3 == 'A')) {
                System.out.println(name + ", you're Extrovert, but you lack empathy and consideration.");
            }
            if ((userInput1 == 'A') && (userInput2 == 'A') && (userInput3 == 'B')) {
                System.out.println(name + ", you're Introvert. However, you're not afraid to speak your mind.");
            }
            if ((userInput1 == 'A') && (userInput2 == 'B') && (userInput3 == 'B')) {
                System.out.println(name + ", you're Introvert, but you don't let your Introvertness get in the way of being honest with people and getting things done.");
            }
            if ((userInput1 == 'B') && (userInput2 == 'B') && (userInput3 == 'A')) {
                System.out.println(name + ", you're Extrovert, but you're afraid to express your opinion.");
            }
            if ((userInput1 == 'B') && (userInput2 == 'A') && (userInput3 == 'B')) {
                System.out.println(name + ", you're Extrovert, but you seem to only care about your social life.");
            }
            if ((userInput1 == 'B') && (userInput2 == 'B') && (userInput3 == 'B')) {
                System.out.println(name + ", you're Extrovert and you're not afraid to stand up for what you believe.");
                System.out.println("You don't mind approachING people and going out of your way for those people.");
            }
        } else {
            System.out.println("Okay! Goodbye!");
        }


    }
}
