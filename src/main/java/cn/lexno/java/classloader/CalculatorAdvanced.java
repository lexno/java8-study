package cn.lexno.java.classloader;

public class CalculatorAdvanced implements ICalculator {

	@Override
	public String calculate(String expression) {
		return "Result is " + expression;
	}

	@Override
	public String getVersion() {
		return "2.0";
	}

}
