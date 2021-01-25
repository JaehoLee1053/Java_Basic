package generic;

public class Plastic extends Material{

	public String toStrirng() {
		return "Plastic";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic Printing");
	}
	
}
