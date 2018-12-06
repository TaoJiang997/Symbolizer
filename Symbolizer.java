
public class Symbolizer {
	public static void main(String[] args) {	
		int miles = 300;
		int km = 300;
		double milesToKmConstant = .6214;
		double kmToMilesConstant = 1.609344;
		
		System.out.println(miles + " miles is equal to " + (miles/milesToKmConstant) + " kilometers.");
		System.out.println(km + " kilometer is equal to "+ (km/kmToMilesConstant) + " miles.");
	}

}
