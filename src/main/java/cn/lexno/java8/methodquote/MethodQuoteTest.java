package cn.lexno.java8.methodquote;

import org.junit.Test;

import cn.lexno.java8.functional.Converter;

/**
 * 测试方法引用
 * <p>@ClassName: MethodQuoteTest </p>
 * <p>@version 1.0 </p>
 */
public class MethodQuoteTest {

    @Test
    public void testConvert() {
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
    
    @Test
    public void testObjectMethodQuote() {
        Something something = new Something();
        Converter<String, String> converter = something::startWith;
        String converted = converter.convert("Java");
        System.out.println(converted);
    }
}