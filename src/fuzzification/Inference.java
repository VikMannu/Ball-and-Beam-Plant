package fuzzification;

import java.util.ArrayList;

import variablesEntrada.*;

public class Inference {
	private static double[][] productoMamdani(double xPosition, double xVelocity) {
		double[][] tableInference = new double[Position.numberVar][Velocity.numberVar];
		double[] tablePosition = Position.tabultedPertenencia(xPosition);
		double[] tableVelocity = Velocity.tabultedPertenencia(xVelocity);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				tableInference[i][j] = tablePosition[i] * tableVelocity[j];
			}
		}
		return tableInference;
	}

	public static ArrayList<RulesOn> rulesOn(double xPosition, double xVelocity) {
		ArrayList<RulesOn> arrayRulesOn = new ArrayList<RulesOn>();
		double[][] tableInference = productoMamdani(xPosition, xVelocity);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (tableInference[i][j] != 0) {
					RulesOn aux = new RulesOn(TabulatedRuleBase.tabultedRule[i][j], tableInference[i][j]);
					arrayRulesOn.add(aux);
				}
			}
		}
		return arrayRulesOn;
	}
}
