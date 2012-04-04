/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.teletubbies;

/**
 *
 * @author samis
 */
public interface IPet {
    public void hug(Teletubby t);
    public int getPrice();
    public void setPrice(int price);
    public int getNiceness();
    public void setNiceness(int niceness);
    public void play();
    public void play(Teletubby t);
    public void sleep();
}
