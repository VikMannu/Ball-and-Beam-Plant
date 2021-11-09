package fuzzification;

public class FuncionPertenencia {
	public static final int NEGATIVO = -1;
	public static final int POSITIVO = 1;

	public static double fTriangular(double x, double a, double b, double c) {
		if (a <= x && x <= b) {
			return (x - a) / (b - a);
		} else if (b < x && x <= c) {
			return (c - x) / (c - b);
		}

		return 0;
	}

	public static double fRecta(double x, double a, double b, int m) {
		if (m == NEGATIVO) {
			if (x <= a) {
				return 1;
			} else if (x > a && x <= b) {
				return (-1 / (b - a)) * (x - a) + 1;
			}
			return 0;
		} else {
			if (x >= a && x < b) {
				return (1 / (b - a)) * (x - a);
			} else if (x >= b) {
				return 1;
			}
			return 0;
		}
	}
}
