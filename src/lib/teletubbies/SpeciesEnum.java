/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.teletubbies;

/**
 * 
 * @author samis
 */
public enum SpeciesEnum {
	Po(java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("PO_ENUM")), TinkyWinky(java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("TINKY WINKY_ENUM")), Dipsy(java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("DIPSY_ENUM")), Laa_Laa(java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("LAA LAA_ENUM")), Evil_Dipsy(
			java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("EVIL DIPSY_ENUM"));
	public String spec;

	SpeciesEnum(String species) {
		this.spec = species;
	}
}
