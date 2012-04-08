package lib.tests;

import java.util.ResourceBundle;
import lib.teletubbies.*;

public class TeletubbyTestDrive {
    private static final ResourceBundle bundle = ResourceBundle.getBundle("lib/teletubbies/Bundle");

	/**
	 * @param args
	 * @since 1.1
	 * @version 1.1
	 */
	public static void main(String[] args) {
		/**
		 * This tests the Teletubby classes
		 * 
		 */
		GenericTeletubby t = new GenericTeletubby(5, SpeciesEnum.Po, 20,
				bundle.getString("RAINBOW"));
		Dipsy d = new Dipsy(5, SpeciesEnum.Dipsy, 20, bundle.getString("RAINBOW"));
		Laa_Laa l = new Laa_Laa();
		Laa_Laa l2 = new Laa_Laa();
		System.out.println(t.getTubbyAge());
		System.out.println(t.getTubbyWeight());
		System.out.println(t.getTubbySpecies());
		System.out.println(t.getPoFoodFavorite());
		System.out.println(d.getTubbyAge());
		System.out.println(d.getTubbyWeight());
		System.out.println(d.getTubbySpecies());
		System.out.println(d.getPoFoodFavorite());
		d.dig();
		System.out.println(d.getStrength());
		// l.farm();
		// l.farm(10001);
		String mystring = l.toString();
		int myhashcode = l.hashCode();
		int myothercode = l2.hashCode();
		System.out.println(myhashcode);
		System.out.println(myothercode);
		if (myhashcode == myothercode) {
			System.out.println(bundle.getString("EQUALCODES"));
		}
		String otherstring = l2.toString();
		System.out.println(mystring);
		System.out.println(otherstring);
		if (mystring == null ? otherstring == null : mystring
				.equals(otherstring)) {
			System.out.println(bundle.getString("EQUALSTRINGS"));
		}

	}
}
