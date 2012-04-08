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
	Po("Po"), TinkyWinky("Tinky Winky"), Dipsy("Dipsy"), Laa_Laa("Laa Laa"), Evil_Dipsy(
			"Evil Dipsy");
	public String spec;

	SpeciesEnum(String species) {
		this.spec = species;
	}
}
