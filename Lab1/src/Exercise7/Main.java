package Exercise7;

public class Main {
	public static void main(String args[]) {
		Weight weight = new Weight();
		weight.setEarthWeight(100);
		
		System.out.println("Human weight on Earth: "+weight.getEarthWeight());
		System.out.println("Human weight on Mars: "+weight.getMarsWeight());
	}
}
