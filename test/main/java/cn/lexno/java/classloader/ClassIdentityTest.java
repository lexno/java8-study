package cn.lexno.java.classloader;

import java.lang.reflect.Method;

import org.junit.Test;

public class ClassIdentityTest {
	
	@Test
	public void testClassIdentity() {
		String classDataRootPath = "";
		FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath);
		FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);
		String className = "cn.lexno.java.classloader.Sample";
		
		try {
			Class<?> class1 = fscl1.loadClass(className);
			Object obj1 = class1.newInstance();
			Class<?> class2 = fscl2.loadClass(className);
			Object obj2 = class2.newInstance();
			Method method = class1.getMethod("setSample", Object.class);
			method.invoke(obj1, obj2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
