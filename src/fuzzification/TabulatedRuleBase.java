package fuzzification;

public class TabulatedRuleBase {
	public static final String[][] tabultedRule = { { "NL", "NL", "NL", "NS", "Z" }, 
													{ "NL", "NL", "NS", "Z", "PS" },
													{ "NL", "NS", "Z", "PS", "PL" }, 
													{ "NS", "Z", "PS", "PL", "PL" }, 
													{ "Z", "PS", "PL", "PL", "PL" } };
}
