/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

/**
 *
 * @author Joshua Pregbaha
 */
public class RockPaperScissors {
    
    static String choice;
    static String choice1;
    static String alphabet = "RSP";
    static Random rnd = new Random();
    static Scanner scan = new Scanner(System.in);
    
    public static void fordelay(int delay) {
        int x, y;
        for (x = 0; x < delay; x++) {
            y = x;
        }
    }
    
    public static void start(){
        System.out.println("ROCK \tPAPER \tSCISSORS");
        System.out.println("Choose your weapon \nR-rock, P-paper or S-scissors");
        choice = scan.next();
        switch (choice) {
            case "R":
                play();
                break;
            case "P":
                play();
                break;
            case "S":
                play();
                break;
            default:
                System.out.println("Invalid option");
                start();
        }
    }
    
    public static void play(){
        char randomchar =alphabet.charAt(rnd.nextInt(alphabet.length()));
        String s=Character.toString(randomchar);
        for (int x = 0; x < 6; x++) {
            fordelay(700000000);
            System.out.print(".");
        }
        switch (choice) {
            case "R":
                System.out.println("\nYou chose Rock");
                break;
            case "P":
                System.out.println("\nYou chose Paper");
                break;
            case "S":
                System.out.println("\nYou chose Scissors");
                break;
            default:
                break;
        }
        
        switch (s) {
            case "R":
                System.out.println("Computer chose Rock");
                break;
            case "P":
                System.out.println("Computer chose Paper");
                break;
            case "S":
                System.out.println("Computer chose Scissors");
                break;
            default:
                break;
        }
        
        if (choice.equals(s)) {
            System.out.println("Draw. Nobody wins");
        } else if (choice.equals("R") && s.equals("P")) {
            System.out.println("Computer wins");
        } else if (choice.equals("R") && s.equals("S")) {
            System.out.println("You win!");
        } else if (choice.equals("P") && s.equals("R")) {
            System.out.println("You win!");
        } else if (choice.equals("P") && s.equals("S")) {
            System.out.println("Computer wins");
        } else if (choice.equals("S") && s.equals("R")) {
            System.out.println("Computer wins");
        } else if (choice.equals("S") && s.equals("P")) {
            System.out.println("You win!");
        }

        System.out.println("Would you like to play again?\nY-Yes\tor\tN-No");
        choice1 = scan.next();
        if (choice1.equals("Y") || choice1.equals("y")) {
            start();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String now_now = formatter.format(date);
        System.out.println(now_now);
        
        if (now_now.equals("23:27")) {
            System.out.println("Call me");
        }
        
        LocalDate myObj = LocalDate.now(); // Create a date object
        //System.out.println(myObj);
        /*RockPaperScissors cow = new RockPaperScissors();
        cow.start();*/
        
        /*int i = 5;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        
        Supplier<String>test = "Aptech"::toUpperCase;
        System.out.println(test.get());*/
    }
    
}
