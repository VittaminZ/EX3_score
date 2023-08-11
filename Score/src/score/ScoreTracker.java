/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package score;

/**
 *
 * @author Asus
 */
public class ScoreTracker implements MyObserver {
    private String name;

    public ScoreTracker(String name) {
        this.name = name;
    }

    @Override
    public void update(String score) {
        System.out.println("live result: " + score);
    }
}
