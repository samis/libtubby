/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.teletubbies;

import java.util.Random;
import java.util.ResourceBundle;

/**
 * Class for Laa Laa's Inherits from Teletubby Laa Laa's have the ability to
 * farm.`
 * 
 * @author samis
 */
public class Laa_Laa extends Teletubby {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5053334120679416550L;

	public Laa_Laa(int age, SpeciesEnum species, int weight, String pofood,
			boolean hybrid, boolean female) {
		super(age, species, weight, pofood, hybrid, female);
		this.setTubbySpecies(SpeciesEnum.Laa_Laa);
		this.setFemale(true);
	}

	public Laa_Laa(int age, SpeciesEnum species, int weight, String pofood,
			boolean hybrid) {
		super(age, species, weight, pofood, hybrid);
		this.setTubbySpecies(SpeciesEnum.Laa_Laa);
		this.setFemale(true);
	}

	public Laa_Laa(int age, SpeciesEnum species, int weight, String pofood) {
		super(age, species, weight, pofood);
		this.setTubbySpecies(SpeciesEnum.Laa_Laa);
		this.setFemale(true);
	}

	public Laa_Laa(int age, SpeciesEnum species, int weight) {
		super(age, species, weight);
		this.setTubbySpecies(SpeciesEnum.Laa_Laa);
		this.setFemale(true);
	}

	public Laa_Laa(int age, SpeciesEnum species) {
		super(age, species);
		this.setTubbySpecies(SpeciesEnum.Laa_Laa);
		this.setFemale(true);
	}

	public Laa_Laa(int age) {
		super(age);
		this.setTubbySpecies(SpeciesEnum.Laa_Laa);
		this.setFemale(true);
	}

	public Laa_Laa() {
		super();
		this.setTubbySpecies(SpeciesEnum.Laa_Laa);
		this.setFemale(true);
	}

	private double strength;
	private int farming_skill;
	private boolean farms_pofood;
	private static transient Random generator = new Random();
    private static final ResourceBundle bundle = ResourceBundle.getBundle("lib/teletubbies/Bundle");

	public int getFarming_skill() {
		return this.farming_skill;
	}

	public void setFarming_skill(int farming_skill) {
		this.farming_skill = farming_skill;
	}

	public boolean isFarms_pofood() {
		return this.farms_pofood;
	}

	public void setFarms_pofood(boolean farms_pofood) {
		this.farms_pofood = farms_pofood;
	}

	public double getStrength() {
		return this.strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	@Override
	public void farm() {
		this.farm(20000);
	}

	public void farm(int time) {
		System.out.println(bundle.getString(" "));
		System.out.print(this.getSpecies());
		System.out.print(bundle.getString("FARMSTART"));
		System.out.println(bundle.getString(" "));
		try {
			Thread.sleep(time / (int) this.getStrength());
		} catch (Exception ex) {
		}
		int strengthincrease = generator.nextInt(10);
		String my = bundle.getString("STRENGTHINCREASE");
		System.out.print(my);
		System.out.print(bundle.getString(" ") + strengthincrease);
		this.setStrength(this.strength + strengthincrease);
		System.out.println(bundle.getString(" "));
		System.out.print(this.getSpecies());
		System.out.print(bundle.getString("FARMINGEND"));
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final Laa_Laa other = (Laa_Laa) obj;
		if (super.equals(other)) {
			if (Double.doubleToLongBits(this.strength) != Double
					.doubleToLongBits(other.strength)) {
				return false;
			}
			if (this.farming_skill != other.farming_skill) {
				return false;
			}
			if (this.farms_pofood != other.farms_pofood) {
				return false;
			}
		} else {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 17
				* hash
				+ (int) (Double.doubleToLongBits(this.strength) ^ Double
						.doubleToLongBits(this.strength) >>> 32);
		hash = 17 * hash + this.farming_skill;
		hash = 17 * hash + (this.farms_pofood ? 1 : 0);
		return hash;
	}

	@Override
	public String toString() {
		String laa_laa_state = bundle.getString("FARMING SKILL") + this.farming_skill + ""
				+ bundle.getString("FARMS_POFOOD") + this.farms_pofood + bundle.getString("STRENGTH")
				+ this.strength;
		return super.toString() + laa_laa_state;
	}
}
