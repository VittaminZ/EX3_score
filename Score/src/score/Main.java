/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package score;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        FootballMatch footballMatch = new FootballMatch();

        ScoreTracker st1 = new ScoreTracker("st1");
        ScoreTracker st2 = new ScoreTracker("st2");

        footballMatch.registerObserver(st1);
        footballMatch.registerObserver(st2);

        Scanner in = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter Score: ");
            input = in.nextLine();

            if (input.isEmpty()) {
                break;
            }

            footballMatch.setScore(input);
        }
        in.close();
    }
}
