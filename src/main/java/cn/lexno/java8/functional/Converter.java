package cn.lexno.java8.functional;

/**
 * java8函数式接口
 * 只要接口中只有一个抽象方法,则这个接口就可以被@FunctionalInterface标注,
 * 表明这是一个函数式接口
 * <p>@ClassName: Converter </p>
 * <p>@version 1.0 </p>
 */

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
