/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.tests;

import lib.teletubbies.*;
import java.util.*;
import lib.util.TeletubbyUtil;

/**
 * 
 * @author samis
 * @since 1.1
 * @version 1.1
 */
public class UtilTestDrive {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Dipsy d = new Dipsy();
		Laa_Laa l = new Laa_Laa();
		Object myotherlist = new Object();
		GenericTeletubby e = new GenericTeletubby(5);
		TeletubbyUtil tu = new TeletubbyUtil();
		ArrayList mylist = new ArrayList<ArrayList>();
		mylist = tu.GetStatus(d);
		myotherlist = mylist.get(1);
		System.out.println(myotherlist);
		myotherlist = null;
		mylist = tu.GetStatus(e);
		myotherlist = mylist.get(1);
		System.out.print(myotherlist);
		myotherlist = null;
		mylist = tu.GetStatus(l);
		/*
		 * Uncommment if you want to test the TeletubbyException e.dig();
		 */
		d.dig();
		l.farm();
		l.farm(10001);
	}
}
