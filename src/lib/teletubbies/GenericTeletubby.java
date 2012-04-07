/**
 * 
 */
package lib.teletubbies;

/**
 * @author samis
 * @since 1.1
 * @version 1.1
 */
public class GenericTeletubby extends Teletubby {

	/**
	 * @param age
	 */
        public GenericTeletubby() { };
	public GenericTeletubby(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param age
	 * @param species
	 */
	public GenericTeletubby(int age, SpeciesEnum species) {
		super(age, species);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param age
	 * @param species
	 * @param weight
	 */
	public GenericTeletubby(int age, String species, int weight) {
		super(age, species, weight);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param age
	 * @param species
	 * @param weight
	 * @param pofood
	 */
	public GenericTeletubby(int age, String species, int weight, String pofood) {
		super(age, species, weight, pofood);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param age
	 * @param species
	 * @param weight
	 * @param pofood
	 * @param hybrid
	 */
	public GenericTeletubby(int age, String species, int weight, String pofood,
			boolean hybrid) {
		super(age, species, weight, pofood, hybrid);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param age
	 * @param species
	 * @param weight
	 * @param pofood
	 * @param hybrid
	 * @param female
	 */
	public GenericTeletubby(int age, String species, int weight, String pofood,
			boolean hybrid, boolean female) {
		super(age, species, weight, pofood, hybrid, female);
		// TODO Auto-generated constructor stub
	}

}
