package cn.lexno.java.classloader;

public class Sample {
	private Sample instance;
	
	public void setSample(Object instance) {
		this.instance = (Sample) instance;
	}
	
	public Sample getSample() {
		return this.instance;
	}
}
