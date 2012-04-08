/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubbydemo.tests;

import lib.teletubbies.Dipsy;
import lib.teletubbies.Laa_Laa;
import tubbydemo.TeletubbyFamily;

/**
 * 
 * @author samis
 */
public class FamilyTestDrive {

	public static void main(String[] args) {
		Laa_Laa laa_laa = new Laa_Laa();
		Dipsy dipsy = new Dipsy();
		TeletubbyFamily myfamily = new TeletubbyFamily(laa_laa, dipsy);
		myfamily.get_noo_noo();
	}
}
