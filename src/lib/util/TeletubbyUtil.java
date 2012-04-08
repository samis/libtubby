/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.util;

import lib.teletubbies.*;
import java.util.*;

public class TeletubbyUtil {
	/**
	 * Gets the status of any class that extends teletubby. Returns a
	 * complicated data structure.
	 * 
	 * Returned Data structure:
	 * 
	 * the returned ArrayList contains 2 sub-lists. at index 0 in the main list
	 * is the list of all numerical status data. at index 1 in the main list is
	 * the list of all text status data.
	 * 
	 * Sublist 0 (the number list) contains 2 items. at index 0 is the age of
	 * the teletubby passed to the method. at index 1 is the weight of the
	 * teletubby passed to the method.
	 * 
	 * Sublist 1 (the string list) contains 5 items. at index 0 is the class of
	 * the teletubby. at index 1 is the teletubby's most liked po food flavour.
	 * at index 2 is the species of the teletubby. at index 3 is if the
	 * teletubby is a female or not. at index 4 is if the teletubby is hybrid or
	 * not.
	 * 
	 * @author samis
	 * @since 1.1
	 * @version 1.1
	 */
	public ArrayList GetStatus(Teletubby t) {
		ArrayList mainlist = new ArrayList<ArrayList>();
		ArrayList numberlist = new ArrayList<Integer>();
		ArrayList stringlist = new ArrayList<String>();

		mainlist.add(0, numberlist);
		mainlist.add(1, stringlist);

		stringlist.add(0, t.getClass());
		stringlist.add(1, t.getPoFoodFavorite());
		stringlist.add(2, t.getTubbySpecies());
		stringlist.add(3, t.isFemale());
		stringlist.add(4, t.isHybrid());

		numberlist.add(0, t.getTubbyAge());
		numberlist.add(1, t.getTubbyWeight());

		return mainlist;
	}
}
