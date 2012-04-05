/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubbydemo.tests;
import tubbydemo.*;
import lib.teletubbies.*;
/**
 *
 * @author samis
 */
public class FamilyTestDrive {

    public static void main(String[] args) {
        Teletubby father;
        Laa_Laa laa_laa = new Laa_Laa();
        Dipsy dipsy = new Dipsy();
        TeletubbyFamily myfamily = new TeletubbyFamily(laa_laa, dipsy);
    }
}
