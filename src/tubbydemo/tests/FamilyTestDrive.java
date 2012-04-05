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
        Noo_Noo my_noo_noo;
        Laa_Laa laa_laa = new Laa_Laa();
        Dipsy dipsy = new Dipsy();
        TeletubbyFamily myfamily = new TeletubbyFamily(laa_laa, dipsy);
        my_noo_noo = myfamily.get_noo_noo();
    }
}
