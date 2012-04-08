/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.teletubbies;

import java.util.Random;
import java.util.ResourceBundle;

/**
 * 
 * @author samis
 */
public class Noo_Noo implements Ipet {
    private static final ResourceBundle bundle = ResourceBundle.getBundle("lib/teletubbies/Bundle");
	private int price;
	private int niceness;
	public boolean isNooNoo = true;
	Random generator = new Random();

	public Noo_Noo() {
		price = 100;
		niceness = 100;
	}

	public Noo_Noo(int price) {
		setPrice(price);
		niceness = 100;
	}

	public Noo_Noo(int price, int niceness) {
		setPrice(price);
		setNiceness(niceness);
	}

	@Override
	public void sleep() {
		System.out.println(bundle.getString("SLEEPSTART"));
		try {
			Thread.sleep(10000 * generator.nextInt(10));
		} catch (InterruptedException ex) {
		}
	}

	@Override
	public void play(Teletubby t) {
		System.out.println(bundle.getString("PLAY1"));
		System.out.print(t.getTubbySpecies());
	}

	@Override
	public void play() {
		System.out.println(bundle.getString("PLAY2"));
	}

	@Override
	public void setNiceness(int niceness) {
		if (niceness != 0) {
			this.niceness = niceness;
		} else {
			System.out.println(bundle.getString("INVALIDNICENESS"));
			return;
		}
	}

	@Override
	public int getNiceness() {
		return niceness;
	}

	@Override
	public void setPrice(int price) {
		if (price != 0) {
			this.price = price;
		} else {
			System.out.println(bundle.getString("INVALIDPRICE"));
			return;
		}
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void hug(Teletubby t) {
		System.out.print(bundle.getString("HUG"));
		System.out.print(bundle.getString(" ") + t.getTubbySpecies());
	}
}
