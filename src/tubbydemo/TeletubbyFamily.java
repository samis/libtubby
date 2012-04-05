/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubbydemo;
import lib.teletubbies.*;
/**
 *
 * @author samis
 */
public class TeletubbyFamily {

    Teletubby father;
    Teletubby mother;
    Noo_Noo family_noo_noo;

    public TeletubbyFamily(Teletubby dad, Teletubby mum) {
        this.father = dad;
        this.mother = mum;
        this.family_noo_noo = new Noo_Noo(100, 100);
    }

    public TeletubbyFamily(Teletubby mum, Teletubby dad, Noo_Noo noo_noo) {
        this.father = dad;
        this.mother = mum;
        this.family_noo_noo = noo_noo;
    }

    public Teletubby getFather() {
        return father;
    }

    public void setFamily_noo_noo(Noo_Noo family_noo_noo) {
        this.family_noo_noo = family_noo_noo;
    }

    public void setFather(Teletubby father) {
        this.father = father;
    }

    public Noo_Noo getFamily_noo_noo() {
        return family_noo_noo;
    }
    

    public Teletubby getMother() {
        return mother;
    }

    public void setMother(Teletubby mother) {
        this.mother = mother;
    }
}
