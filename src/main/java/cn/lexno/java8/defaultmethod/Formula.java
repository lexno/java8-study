package cn.lexno.java8.defaultmethod;

/**
 * 计算接口
 * <p>@ClassName: Formula </p>
 * <p>@version 1.0 </p>
 */
public interface Formula {
	double claculate(int a);
	
	/**
	 * 默认方法: 开a的平方根
	 * @param a
	 * @return a开平方根
	 */
	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
