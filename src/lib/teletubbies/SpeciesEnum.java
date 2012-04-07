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
        PO("Po"),
        TINKY_WINKY("Tinky Winky"),
        DIPSY("Dipsy"), 
        LAA_LAA("Laa Laa"),
        EVIL_DIPSY("Evil Dipsy");
        public String spec;
        SpeciesEnum(String species) {
            this.spec = species;
        }
}
