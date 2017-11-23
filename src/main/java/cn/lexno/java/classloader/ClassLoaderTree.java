package cn.lexno.java.classloader;

/**
 * 演示类加载器的树状组织结构
 * @ClassName: ClassLoaderTree <br/>
 */
public class ClassLoaderTree {
	public static void main(String[] args) {
		ClassLoader loader = ClassLoaderTree.class.getClassLoader();
		while (loader != null) {
			System.out.println(loader.toString());
			loader = loader.getParent();
		}
	}
}
