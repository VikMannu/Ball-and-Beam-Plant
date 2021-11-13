package inputVariables;

public class Position {
	public static final String[] nameUniverse = { "NL", "NS", "Z", "PS", "PL" };
	public static final int numberVar = 5;
	private static final double[] NL = { -0.5, -0.25 };
	private static final double[] NS = { -0.5, -0.25, 0.0 };
	private static final double[] Z = { -0.25, 0, 0.25 };
	private static final double[] PS = { 0.0, 0.25, 0.5 };
	private static final double[] PL = { 0.25, 0.75 };

	private static double perteneciaNL(double x) {
		return MembershipFunction.fRecta(x, NL[0], NL[1], MembershipFunction.NEGATIVO);
	}

	private static double perteneciaNS(double x) {
		return MembershipFunction.fTriangular(x, NS[0], NS[1], NS[2]);
	}

	private static double perteneciaZ(double x) {
		return MembershipFunction.fTriangular(x, Z[0], Z[1], Z[2]);
	}

	private static double perteneciaPS(double x) {
		return MembershipFunction.fTriangular(x, PS[0], PS[1], PS[2]);
	}

	private static double perteneciaPL(double x) {
		return MembershipFunction.fRecta(x, PL[0], PL[1], MembershipFunction.POSITIVO);
	}

	public static double[] tabultedPertenencia(double x) {
		double[] tabulted = new double[5];
		tabulted[0] = perteneciaNL(x);
		tabulted[1] = perteneciaNS(x);
		tabulted[2] = perteneciaZ(x);
		tabulted[3] = perteneciaPS(x);
		tabulted[4] = perteneciaPL(x);

		return tabulted;
	}
}
