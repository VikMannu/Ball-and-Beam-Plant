package fuzzification;

public class RulesOn {
	private String nameRule;
	private double productoMamdani;

	public RulesOn(String nameRule, double productoMamdani) {
		super();
		this.nameRule = nameRule;
		this.productoMamdani = productoMamdani;
	}

	public String getNameRule() {
		return nameRule;
	}

	public void setNameRule(String nameRule) {
		this.nameRule = nameRule;
	}

	public double getProductoMamdani() {
		return productoMamdani;
	}

	public void setProductoMamdani(double productoMamdani) {
		this.productoMamdani = productoMamdani;
	}
}
