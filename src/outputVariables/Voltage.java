package outputVariables;

public class Voltage {
	public static final String[] nameUniverse = { "NL", "NS", "Z", "PS", "PL" };
	public static final int numberVar = 5;
	private static final double NL = -10;
	private static final double NS = -5;
	private static final double Z = 0;
	private static final double PS = 5;
	private static final double PL = 10;

	public static double getValue(String name) {
		switch (name) {
		case "NL":
			return NL;
		case "NS":
			return NS;
		case "PS":
			return PS;
		case "PL":
			return PL;
		default:
			return Z;
		}
	}
}
