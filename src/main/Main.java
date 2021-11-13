package main;

public class Main {
	public static void main(String[] args) {
		double valuePosition = -0.0625;
		double valueVelocity = 3;
		
		System.out.println("Fuzzy Logic");
		System.out.println("Ball and Beam Plant");
		System.out.println("Position: " + valuePosition);
		System.out.println("Velocity: " + valueVelocity);
		System.out.println();
		System.out.println("The input Voltage is: " + BallAndBeamPlant.initFuzzyLogic(valuePosition, valueVelocity) + " V");
	}
}
