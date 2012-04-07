/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.teletubbies;
import java.util.*;

/**
 * Class for Laa Laa's Inherits from Teletubby
 * Laa Laa's have the ability to farm.`
 * @author samis
 */
public class Laa_Laa extends Teletubby {

    public Laa_Laa(int age, SpeciesEnum species, int weight, String pofood, boolean hybrid, boolean female) {
        super(age, species, weight, pofood, hybrid, female);
        setTubbySpecies(SpeciesEnum.Laa_Laa);
        setFemale(true);
    }

    public Laa_Laa(int age, SpeciesEnum species, int weight, String pofood, boolean hybrid) {
        super(age, species, weight, pofood, hybrid);
        setTubbySpecies(SpeciesEnum.Laa_Laa);
        setFemale(true);
    }

    public Laa_Laa(int age, SpeciesEnum species, int weight, String pofood) {
        super(age, species, weight, pofood);
        setTubbySpecies(SpeciesEnum.Laa_Laa);
        setFemale(true);
    }

    public Laa_Laa(int age, SpeciesEnum species, int weight) {
        super(age, species, weight);
        setTubbySpecies(SpeciesEnum.Laa_Laa);
        setFemale(true);
    }

    public Laa_Laa(int age, SpeciesEnum species) {
        super(age, species);
        setTubbySpecies(SpeciesEnum.Laa_Laa);
        setFemale(true);
    }

    public Laa_Laa(int age) {
        super(age);
        setTubbySpecies(SpeciesEnum.Laa_Laa);
        setFemale(true);
    }

    public Laa_Laa() {
        super();
        setTubbySpecies(SpeciesEnum.Laa_Laa);
        setFemale(true);
    }
    private double strength;
    private int farming_skill;
    private boolean farms_pofood;
    private static transient Random generator = new Random();

    public int getFarming_skill() {
        return farming_skill;
    }

    public void setFarming_skill(int farming_skill) {
        this.farming_skill = farming_skill;
    }

    public boolean isFarms_pofood() {
        return farms_pofood;
    }

    public void setFarms_pofood(boolean farms_pofood) {
        this.farms_pofood = farms_pofood;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public void farm() {
        farm(20000);
    }
    public void farm(int time) {
        System.out.println(" ");
        System.out.print(getSpecies());
        System.out.print(" is starting to farm");
        System.out.println(" ");
        try { Thread.sleep(time/(int) getStrength()); } catch(Exception ex) { }
        int strengthincrease = generator.nextInt(10);
        String my = "The Laa Laa's strength has increased by";
        System.out.print(my);
        System.out.print(" " + strengthincrease);
        setStrength(strength + strengthincrease);
        System.out.println(" ");
        System.out.print(getSpecies());
        System.out.print(" has finished farming for now.");
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laa_Laa other = (Laa_Laa) obj;
        if (super.equals(other)) {
            if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
                return false;
            }
            if (this.farming_skill != other.farming_skill) {
                return false;
            }
            if (this.farms_pofood != other.farms_pofood) {
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
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 17 * hash + this.farming_skill;
        hash = 17 * hash + (this.farms_pofood ? 1 : 0);
        return hash;
    }
    @Override
    public String toString() {
       String laa_laa_state = "farming skill=" + farming_skill +""+"farms_pofood="+farms_pofood+"strength="+strength;
       return super.toString()+laa_laa_state;
    }
}
