/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.tests;

/**
 * 
 * @author samis
 */
public class MainTestDrive {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Beginning Tests");
		System.out.println("Starting Teletubby Test");
		TeletubbyTestDrive.main(null);
		System.out.println("Teletubby Test Finished");
		System.out.println("Starting Util Test");
		UtilTestDrive.main(null);
	}
}
