package cn.lexno.java8.defaultmethod;

import org.junit.Test;

/**
 * 测试默认方法类
 * <p>@ClassName: FormulaTest </p>
 * <p>@version 1.0 </p>
 */
public class FormulaTest {

	@Test
	public void test() {
	    Formula formula = new Formula() {
            
            @Override
            public double claculate(int a) {
                return sqrt(a * 100);
            }
        };
        
        System.out.println(formula.claculate(100));
        System.out.println(formula.sqrt(16));
	}
}
