package defuzzification;

import java.util.ArrayList;

import fuzzification.Inference;
import fuzzification.RulesOn;
import variablesSalida.Voltage;

public class Dezzufication {
	public static double voltageInput (double xPosition, double xVelocity) {
		double numerador=0;
		double denominador=0;
		ArrayList<RulesOn> rulesOn= Inference.rulesOn(xPosition, xVelocity);
		
		for (int i=0; i<rulesOn.size(); i++) {
			RulesOn aux = rulesOn.get(i);
			numerador += aux.getProductoMamdani()*Voltage.getValue(aux.getNameRule());
			denominador += aux.getProductoMamdani();
		}
		
		return numerador/denominador;
	}
}
