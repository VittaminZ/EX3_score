/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package score;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Asus
 */
public class FootballMatch implements Source {
    private List<MyObserver> observers = new ArrayList<>();
    private String score;

    public void setScore(String score) {
        this.score = score;
        notifyObserver(score);
    }
    
    @Override
    public void registerObserver(MyObserver observer) {
        observers.add(observer);
    }
    
    @Override
    public void notifyObserver(String score) {
        for(int i = 0; i < observers.size(); ++i){
            observers.get(i).update(score);
        }
    }
}
