/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.teletubbies;

/**
 *
 * @author samis
 */
public class Noo_Noo implements Ipet {
    private int price;
    private int niceness;
    public Noo_Noo()  {
        price = 100;
        niceness = 100;
    }
    public Noo_Noo(int price) {
        setPrice(price);
        niceness = 100;
    }
    public Noo_Noo(int price, int niceness) {
        setPrice(price);
        setNiceness(niceness);
    }
    public void sleep() {
        
    }
    public void play(Teletubby t) {
        
    }
    public void play() {
        
    }
    public void setNiceness(int niceness) {
        if(niceness != 0) {
            this.niceness = niceness;
        }
        else {
            System.out.println("Niceness cannot be 0, ignoring");
            return;
        }
    }
    public int getNiceness() {
        return niceness;
    }
    public void setPrice(int price) {
        if(price != 0){
            this.price = price;
        }
        else {
            System.out.println("Price cannot be 0, ignoring");
            return;
        }
    }
    public int getPrice() {
        return price;
    }
    public void hug(Teletubby t) {
        
    }
        
    }
