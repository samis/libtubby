/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.teletubbies;

import java.util.Random;
import java.util.ResourceBundle;

/**
 * @since 1.1
 * @author samis
 * @version 1.2
 */
public class Dipsy extends Teletubby {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8474449314295089685L;
	private static transient Random generator = new Random();
    private static final ResourceBundle bundle = ResourceBundle.getBundle("lib/teletubbies/Bundle");

	@Override
	public String gender() {
		return super.gender();
	}

	public Dipsy(int age, SpeciesEnum species, int weight, String pofood,
			boolean hybrid, boolean female) {
		super(age, species, weight, pofood, hybrid, female);
		this.setTubbySpecies(SpeciesEnum.Dipsy);
		this.setStrength(Dipsy.generator.nextInt(200));
	}

	public Dipsy(int age, SpeciesEnum species, int weight, String pofood,
			boolean hybrid) {
		super(age, species, weight, pofood, hybrid);
		this.setTubbySpecies(SpeciesEnum.Dipsy);
		this.setStrength(Dipsy.generator.nextInt(200));
	}

	public Dipsy(int age, SpeciesEnum species, int weight, String pofood) {
		super(age, species, weight, pofood);
		this.setTubbySpecies(SpeciesEnum.Dipsy);
		this.setStrength(Dipsy.generator.nextInt(200));
	}

	public Dipsy(int age, SpeciesEnum species, int weight) {
		super(age, species, weight);
		this.setTubbySpecies(SpeciesEnum.Dipsy);
		this.setStrength(Dipsy.generator.nextInt(150));

	}

	public Dipsy(int age) {
		super(age);
		this.setTubbySpecies(SpeciesEnum.Dipsy);

	}

	public Dipsy() {
		super();
		this.setTubbySpecies(SpeciesEnum.Dipsy);
		this.setStrength(100);
	}

	private double strength;

	public double getStrength() {
		return this.strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	@Override
	public void dig() {
		System.out.println("");
		System.out.print(this.getTubbySpecies());
		System.out.print(bundle.getString("DIGGINGSTART"));
		try {
			Thread.sleep(100000 / (int) this.strength);
		} catch (InterruptedException ex) {
		} finally {
			System.out.println("");
			System.out.print(this.getTubbySpecies());
			System.out.print(bundle.getString("DIGGINGEND"));
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final Dipsy other = (Dipsy) obj;
		if (super.equals(other)) {
			if (Double.doubleToLongBits(this.strength) != Double
					.doubleToLongBits(other.strength)) {
				return false;
			}
		} else {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 97
				* hash
				+ (int) (Double.doubleToLongBits(this.strength) ^ Double
						.doubleToLongBits(this.strength) >>> 32);
		return hash;
	}

	@Override
	public String toString() {
		return bundle.getString("DIPSY") + bundle.getString("STRENGTH") + this.strength + '}';
	}

}
