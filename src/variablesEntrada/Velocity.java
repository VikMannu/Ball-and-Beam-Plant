package variablesEntrada;

import fuzzification.FuncionPertenencia;

public class Velocity {
	public static final String[] nameUniverse = { "NL", "NS", "Z", "PS", "PL" };
	public static final int numberVar = 5;
	private static final double[] NL = { -4, -2 };
	private static final double[] NS = { -4, -2, 0 };
	private static final double[] Z = { -2, 0, 2 };
	private static final double[] PS = { 0, 2, 4 };
	private static final double[] PL = { 2, 4 };

	private static double perteneciaNL(double x) {
		return FuncionPertenencia.fRecta(x, NL[0], NL[1], FuncionPertenencia.NEGATIVO);
	}

	private static double perteneciaNS(double x) {
		return FuncionPertenencia.fTriangular(x, NS[0], NS[1], NS[2]);
	}

	private static double perteneciaZ(double x) {
		return FuncionPertenencia.fTriangular(x, Z[0], Z[1], Z[2]);
	}

	private static double perteneciaPS(double x) {
		return FuncionPertenencia.fTriangular(x, PS[0], PS[1], PS[2]);
	}

	private static double perteneciaPL(double x) {
		return FuncionPertenencia.fRecta(x, PL[0], PL[1], FuncionPertenencia.POSITIVO);
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
