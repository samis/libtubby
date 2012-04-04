/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.teletubbies;
import java.util.Random;

/**
 * @since 1.1
 * @author samis
 * @version 1.2
 */
public class Dipsy extends Teletubby {

    private static transient Random generator = new Random();

    public Dipsy(int age, String species, int weight, String pofood, boolean hybrid, boolean female) {
        super(age, species, weight, pofood, hybrid, female);
        setTubbySpecies("Dipsy");
        setStrength(generator.nextInt(200));
    }

    public Dipsy(int age, String species, int weight, String pofood, boolean hybrid) {
        super(age, species, weight, pofood, hybrid);
        setTubbySpecies("Dipsy");
        setStrength(generator.nextInt(200));
    }

    public Dipsy(int age, String species, int weight, String pofood) {
        super(age, species, weight, pofood);
        setTubbySpecies("Dipsy");
        setStrength(generator.nextInt(200));
    }

    public Dipsy(int age, String species, int weight) {
        super(age, species, weight);
      setTubbySpecies("Dipsy");
      setStrength(generator.nextInt(150));
        
    }

    public Dipsy(int age) {
        super(age);
        setTubbySpecies("Dipsy");
        
    }

    public Dipsy() {
        super();
        setTubbySpecies("Dipsy");
        setStrength(100);
    }
    private double strength;

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
    
    
    @Override
    public void dig() {
        System.out.println("");
        System.out.print(getTubbySpecies());
        System.out.print(" is digging!");
        try {
            Thread.sleep(100000/(int) strength);
        }
        catch(InterruptedException ex) { }
        finally {
            System.out.println("");
            System.out.print(getTubbySpecies());
            System.out.print(" has finished digging!");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dipsy other = (Dipsy) obj;
        if (super.equals(other)) {
            if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
                return false;
            }
        }
        else {
            return false;
        }
        return true;         
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Dipsy{" + "strength=" + strength + '}';
    }
    
}
