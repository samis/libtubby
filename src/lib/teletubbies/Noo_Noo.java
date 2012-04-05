/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.teletubbies;
import java.util.Random;
/**
 *
 * @author samis
 */
public class Noo_Noo implements Ipet {
    private int price;
    private int niceness;
    Random generator = new Random();
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
    @Override
    public void sleep() {
        System.out.println("The Noo Noo is sleeping");
        try {
            Thread.sleep(10000 * generator.nextInt(10));
        } catch (InterruptedException ex) {
        }
    }
    @Override
    public void play(Teletubby t) {
        System.out.println("The noo noo is playing with the ");
        System.out.print(t.getTubbySpecies());
    }
    @Override
    public void play() {
        System.out.println("The Noo Noo is playing with sometubby.");
    }
    @Override
    public void setNiceness(int niceness) {
        if(niceness != 0) {
            this.niceness = niceness;
        }
        else {
            System.out.println("Niceness cannot be 0, ignoring");
            return;
        }
    }
    @Override
    public int getNiceness() {
        return niceness;
    }
    @Override
    public void setPrice(int price) {
        if(price != 0){
            this.price = price;
        }
        else {
            System.out.println("Price cannot be 0, ignoring");
            return;
        }
    }
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void hug(Teletubby t) {
        System.out.print("Noo Noo is hugging the");
        System.out.print(" "+ t.getTubbySpecies());
    }
        
    }
