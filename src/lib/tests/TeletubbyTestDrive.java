package lib.tests;

import lib.teletubbies.*;

public class TeletubbyTestDrive {

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
        GenericTeletubby t = new GenericTeletubby(5, SpeciesEnum.DIPSY.spec, 20, "Rainbow");
        Dipsy d = new Dipsy(5, SpeciesEnum.DIPSY.spec, 20, "Rainbow");
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
        //l.farm();
        //l.farm(10001);
        String mystring = l.toString();
        int myhashcode = l.hashCode();
        int myothercode = l2.hashCode();
        System.out.println(myhashcode);
        System.out.println(myothercode);
        if(myhashcode == myothercode) {
            System.out.println("The hash codes are equal!");
        }
        String otherstring = l2.toString();
        System.out.println(mystring);
        System.out.println(otherstring);
        if(mystring == null ? otherstring == null : mystring.equals(otherstring)) {
            System.out.println("The 2 strings are equal!");
        }

    }
}
