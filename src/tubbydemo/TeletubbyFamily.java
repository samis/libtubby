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

    private Teletubby father;
    private Teletubby mother;
    private Ipet family_noo_noo;

    public TeletubbyFamily(Teletubby dad, Teletubby mum) {
        this.father = dad;
        this.mother = mum;
        this.family_noo_noo = new Noo_Noo(100, 100);
    }

    public TeletubbyFamily(Teletubby mum, Teletubby dad, Ipet noo_noo) {
        this.father = dad;
        this.mother = mum;
    }

    public Teletubby getFather() {
        return father;
    }

    public void set_noo_noo(Noo_Noo family_noo_noo) {
        this.family_noo_noo = family_noo_noo;
    }

    public void setFather(Teletubby father) {
        this.father = father;
    }

    public Noo_Noo get_noo_noo() {
        return (Noo_Noo) family_noo_noo;
    }

    public Teletubby getMother() {
        return mother;
    }

    public void setMother(Teletubby mother) {
        this.mother = mother;
    }
}
