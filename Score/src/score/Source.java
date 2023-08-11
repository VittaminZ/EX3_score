/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package score;

/**
 *
 * @author Asus
 */
public interface Source {
    public void registerObserver(MyObserver ob);
    public void notifyObserver(String score);
}
