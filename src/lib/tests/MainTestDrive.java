/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.tests;

import java.util.ResourceBundle;

/**
 * 
 * @author samis
 */
public class MainTestDrive {
    private static final ResourceBundle bundle = ResourceBundle.getBundle("lib/teletubbies/Bundle");

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println(bundle.getString("TESTBEGIN"));
		System.out.println(bundle.getString("TUBBYTESTBEGIN"));
		TeletubbyTestDrive.main(null);
		System.out.println(bundle.getString("TUBBYTESTEND"));
		System.out.println(bundle.getString("UTILTESTBEGIN"));
		UtilTestDrive.main(null);
	}
}
