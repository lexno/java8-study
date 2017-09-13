package cn.lexno.java8.functional;

import org.junit.Test;

/**
 * 函数式接口测试
 * <p>@ClassName: FunctionalTest </p>
 * <p>@version 1.0 </p>
 */
public class FunctionalTest {

    @Test
    public void testConvert() {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}
