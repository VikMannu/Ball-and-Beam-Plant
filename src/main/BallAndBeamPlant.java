package main;

import defuzzification.Dezzufication;

public class BallAndBeamPlant {
	public static double initFuzzyLogic (double valuePosition, double valueVelocity) {
		return Dezzufication.voltageInput(valuePosition, valueVelocity);
	}
}
