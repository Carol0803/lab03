package Exercise7;

public class Weight {
	private double earthWeight = 100;
	private double marsWeight;
	
	public double getEarthWeight() {
		return earthWeight;
	}
	public void setEarthWeight(double earthWeight) {
		this.earthWeight = earthWeight;
	}
	public double getMarsWeight() {
		setMarsWeight();
		return marsWeight;
	}
	public void setMarsWeight() {
		marsWeight = earthWeight * 0.38;
	}
}
