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
	Po(java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("PO")), TinkyWinky(java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("TINKY WINKY")), Dipsy(java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("DIPSY")), Laa_Laa(java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("LAA LAA")), Evil_Dipsy(
			java.util.ResourceBundle.getBundle("lib/teletubbies/Bundle").getString("EVIL DIPSY"));
	public String spec;

	SpeciesEnum(String species) {
		this.spec = species;
	}
}
