package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class TeaMakerRunner {
	
	public static void main(String[] args) {
		
		TeaBag greenbag= new TeaBag("Green");
		greenbag.getFlavor();
		Kettle kettle= new Kettle();
		kettle.boil();
		Cup cup= new Cup();
		cup.makeTea(greenbag, kettle.getWater());
		
		
		
		
		
		
	}
	
}
