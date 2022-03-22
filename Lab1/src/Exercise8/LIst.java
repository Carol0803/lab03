package Exercise8;

import Exercise7.Weight;
import java.util.ArrayList;

public class LIst {
	public static void main(String args[]) {
	ArrayList<Double> Eweight = new ArrayList<Double>();
	ArrayList<Double> Mweight = new ArrayList<Double>();
	
	Weight weight = new Weight();
	Weight weight1 = new Weight();
	Weight weight2 = new Weight();
	weight.setEarthWeight(100);
	weight1.setEarthWeight(150);
	weight2.setEarthWeight(200);
	
	Eweight.add(weight.getEarthWeight());
	Mweight.add(weight.getMarsWeight());
	Eweight.add(weight1.getEarthWeight());
	Mweight.add(weight1.getMarsWeight());
	Eweight.add(weight2.getEarthWeight());
	Mweight.add(weight2.getMarsWeight());
	
	for (int i = 0; i < Eweight.size(); i++) {
	      System.out.println(Eweight.get(i) + " " + Mweight.get(i));
	    }
	}
}
