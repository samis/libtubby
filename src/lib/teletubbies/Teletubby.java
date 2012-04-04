/**
 * @author samis
 * @since 1.0
 * @version 1.1
 */
package lib.teletubbies;

import java.io.*;
import lib.util.TeletubbyException;

/**
 * Generic class for all teletubbies
 *
 * @author samis
 * @since 1.0
 * @version 1.1
 */
public abstract class Teletubby implements Serializable {

    /** The age of the Teletubby **/
    private int tubbyAge;
    /** The species of the teletubby, Only used internally **/
    private String tubbySpecies;
    /** The weight of the teletubby **/
    private int tubbyWeight;
    /** The teletubby's favorite flavour of Yummy Po Food **/
    private String PoFoodFavorite;
    /** Is the teletubby a hybrid or not? **/
    private boolean isHybrid;
    /** Is the teletubby female or not? **/
    private boolean isFemale;

    /**
     * The No-Arg constructor for Teletubbies It is solely provided as a
     * Convenience function. To save on time and on typing, use the other
     * constructors.
     *
     * @since 1.0
     * @deprecated Default values are low, It is simply easier to use the other
     *             constructors.
     **/
    @Deprecated
    public Teletubby() {
        super();
        this.setTubbyAge(1);
        this.setTubbySpecies("Po");
        this.setTubbyWeight(1);
        this.setPoFoodFavorite("Vanilla");
        this.setHybrid(false);
        this.setFemale(false);
        System.out.println("The default values are low, to make an accurate teletubby, use the setters or the other constructors");
    }

    /**
     * Constructs a teletubby with an age.
     *
     * @param age
     *            the age to give the teletubbby
     * @since 1.0
     */
    public Teletubby(int age) {
        super();
        this.setTubbyAge(age);
        this.setTubbySpecies("Po");
        this.setTubbyWeight(1);
        this.setPoFoodFavorite("Vanilla");
        this.setHybrid(false);
        this.setFemale(false);
        System.out.println("Might want to consider setting the weight and such");
    }

    /**
     * Constructs a teletubby with an age and species
     *
     * @param age
     *            - the age to give the teletubby
     * @param species
     *            - the species to give the teletubby
     * @since 1.0
     */
    public Teletubby(int age, String species) {
        this(age);
        this.setTubbySpecies(species);
        this.setTubbyWeight(1);
        this.setPoFoodFavorite("Vanilla");
        this.setHybrid(false);
        this.setFemale(false);
        System.out.println("Might want to consider setting the weight and such");
    }

    /**
     * Contructs a teletubby with an age, species and weight
     *
     * @param age
     *            - the age to give the teletubby
     * @param species
     *            - the species to give the teletubby
     * @param weight
     *            - the weight to give the teletubby
     * @since 1.0
     */
    public Teletubby(int age, String species, int weight) {
        this(age, species);
        this.setTubbyWeight(weight);
        this.setPoFoodFavorite("Vanilla");
        this.setHybrid(false);
        this.setFemale(false);
        System.out.println("Consider setting the other fields.");
    }

    /**
     * Constructs a teletubby with an age, species, weight and favorite po food
     * flavor.
     *
     * @param age
     *            - the age to give the teletubby
     * @param species
     *            - the species to give the teletubby
     * @param weight
     *            - the weight to give the teletubby
     * @param pofood
     *            - the favorite flavor of pofood to give the teletubby.
     * @since 1.0
     */
    public Teletubby(int age, String species, int weight, String pofood) {
        this(age, species, weight);
        this.setPoFoodFavorite(pofood);
        this.setHybrid(false);
        this.setFemale(false);
    }

    /**
     * Constructs a teletubby with an age,species,weight,pofood and whether its
     * a hybrid or not.
     *
     * @param age
     *            - the age to give the teletubby
     * @param species
     *            - the species to give the teletubby
     * @param weight
     *            - the weight to give the teletubby
     * @param pofood
     *            - the teletubby's favorite pofood flavor
     * @param hybrid
     *            - whether the teletubby is a hybrid or not
     * @since 1.0
     */
    public Teletubby(int age, String species, int weight, String pofood,
            boolean hybrid) {
        this(age, species, weight, pofood);
        this.setHybrid(hybrid);
        this.setFemale(false);
    }

    /**
     * Construct a teletubby with an age, species, weight, pofood, hybrid,
     * female
     *
     * @param age
     *            - the age to give the teletubby
     * @param species
     *            - the species to give the teletubby
     * @param weight
     *            - the weight to give the teletubby
     * @param pofood
     *            - the teletubby's favorite pofood
     * @param hybrid
     *            - whether the teletubby is a hybrid or not
     * @param female
     *            - whether the teletubby is female or not
     */
    public Teletubby(int age, String species, int weight, String pofood,
            boolean hybrid, boolean female) {
        this(age, species, weight, pofood, hybrid);
        this.setFemale(female);
    }

    /**
     * Get the age of the teletubby
     *
     * @return age - The age of the teletubby
     */
    public int getTubbyAge() {
        return this.tubbyAge;
    }

    /**
     * Check if the specified age is valid, and if it is, sets the teletubby's
     * age to it. Otherwise sets it to 1.
     *
     * @param tubbyAge
     *            - the age to hopefully give the teletubby
     */
    public void setTubbyAge(int tubbyAge) {
        if (tubbyAge != 0) {
            this.tubbyAge = tubbyAge;
        } else {
            System.out.println("Teletubbies cannot be 0 years old, using 1");
            tubbyAge = 1;
        }
    }

    /**
     * Get the species of the teletubby
     *
     * @return tubbySpecies - the species of the teletubby
     */
    public String getTubbySpecies() {
        return this.tubbySpecies;
    }

    /**
     ** Check if the specified species is valid, and if so, set the teletubby's
     * age to it otherwise it sets it to Po.
     **
     * @param tubbySpecies
     *            - the species to hopefully give the teletubby
     */
    public void setTubbySpecies(String tubbySpecies) {
        if (tubbySpecies != null) {
            this.tubbySpecies = tubbySpecies;
        } else {
            System.out.println("Species cannot be null, setting to Po");
            this.tubbySpecies = "Po";
        }
    }

    /**
     * Get the weight of the teletubby
     *
     * @return tubbyWeight - The weight of the teletubby
     */
    public int getTubbyWeight() {
        return this.tubbyWeight;
    }

    /**
     * Check the specified weight, if its valid, set the teletubby's weight to
     * it.Otherwise sets it to 1.
     *
     * @param tubbyWeight
     */
    public void setTubbyWeight(int tubbyWeight) {
        if (tubbyWeight != 0) {
            this.tubbyWeight = tubbyWeight;
        } else {
            System.out.println("Teletubbies cannot have 0 weight, setting to 1");
            this.tubbyWeight = 1;
        }
    }

    /**
     *
     * Get the teletubby's favorite flavour of Po Food.
     *
     * @return PoFoodFavorite
     */
    public String getPoFoodFavorite() {
        return this.PoFoodFavorite;
    }

    public void setPoFoodFavorite(String poFoodFav) {
        if (poFoodFav != null) {
            this.PoFoodFavorite = poFoodFav;
        } else {
            System.out.println("All teletubbies have a favorite po food flavor, Setting to vanilla");
            this.PoFoodFavorite = "Vanilla";
        }
    }

    /**
     * Gets whether the teletubby is a hybrid or not.
     *
     * @return isHybrid
     */
    public boolean isHybrid() {
        return this.isHybrid;
    }

    /**
     * Sets whether the teletubby is a hybrid or not.
     *
     * @param isHybrid
     */
    public void setHybrid(boolean isHybrid) {
        this.isHybrid = isHybrid;
    }

    /**
     * Gets if the teletubby is female or not.
     *
     * @return isFemale
     */
    public boolean isFemale() {
        return this.isFemale;
    }

    /**
     * Sets if the teletubby is a female or not.
     *
     * @param isFemale
     */
    public void setFemale(boolean isFemale) {
        this.isFemale = isFemale;
    }

        /**
     * Prohibits subclass teletubbies from digging by throwing a TeletubbyException
     * To enable digging, override this method in a subclass.
     * for an example, see the Dipsy class.
     * @see Dipsy
     * @since 1.1
     * @version 1.1
     * @exception TeletubbyException
     */
    public void dig() {
        throw (new TeletubbyException("Teletubby with digging disabled attempted to dig."));
    }
    public void farm() {
        throw (new TeletubbyException("Teletubby with farming disabled attempted to farm"));
    }
    public void farm_pofood() {
        farm();
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teletubby other = (Teletubby) obj;
        if (this.tubbyAge != other.tubbyAge) {
            return false;
        }
        if ((this.tubbySpecies == null) ? (other.tubbySpecies != null) : !this.tubbySpecies.equals(other.tubbySpecies)) {
            return false;
        }
        if (this.tubbyWeight != other.tubbyWeight) {
            return false;
        }
        if ((this.PoFoodFavorite == null) ? (other.PoFoodFavorite != null) : !this.PoFoodFavorite.equals(other.PoFoodFavorite)) {
            return false;
        }
        if (this.isHybrid != other.isHybrid) {
            return false;
        }
        if (this.isFemale != other.isFemale) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.tubbyAge;
        hash = 43 * hash + (this.tubbySpecies != null ? this.tubbySpecies.hashCode() : 0);
        hash = 43 * hash + this.tubbyWeight;
        hash = 43 * hash + (this.PoFoodFavorite != null ? this.PoFoodFavorite.hashCode() : 0);
        hash = 43 * hash + (this.isHybrid ? 1 : 0);
        hash = 43 * hash + (this.isFemale ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Teletubby{" + "tubbyAge=" + tubbyAge + ", tubbySpecies=" + tubbySpecies + ", tubbyWeight=" + tubbyWeight + ", PoFoodFavorite=" + PoFoodFavorite + ", isHybrid=" + isHybrid + ", isFemale=" + isFemale + '}';
    }
}
