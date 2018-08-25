package com.imooc.proxyPattern;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;



public class Proxy {
	public static Object newProxyInstance(Class infce) throws Exception {
		String rt ="\r\n";
		String methodStr = "";
		for(Method m :infce.getMethods()) {
			methodStr += "@Override" + rt+
					"	public void "+m.getName()+"() {" + rt+
					"		long startTime = System.currentTimeMillis();" + rt+
					"		System.out.println(\"汽车开始行驶了\");" + rt+

					"		m."+m.getName()+"();" + rt+

					"		long endTimer = System.currentTimeMillis();" + rt+
					"	System.out.println(\"汽车行驶结束 。。。。。。汽车行驶时间\"+ (endTimer- startTime) +\"毫秒\");" + rt+

					"	}" ;
		}
		String  str = 
				"	package com.imooc.proxyPattern;" + rt+
				"public class  $Proxy0 implements "+infce.getName() +"{" + rt+
				"	public Proxy0("+infce.getName() +" m) {" + rt+
				"			super();" + rt+
				"		this.m = m;" + rt+
				"		}" + rt+
				"	private "+infce.getName() +" m;" + rt+

				methodStr+rt+
				"}";
		//产生代理类的Java文件
		String filename = System.getProperty("user.dir") +"/bin/com/imooc/proxyPattern/$Proxy.java";
		System.out.println("filaname = " +filename);
		File file = new File(filename);
		FileUtils.writeStringToFile(file, str);
		//编译器   拿到编译器
		JavaCompiler complier = ToolProvider.getSystemJavaCompiler();
		//文件管理器
		StandardJavaFileManager fileManager = complier.getStandardFileManager
				(null, null, null);
		//获取文件
		Iterable units=	 fileManager.getJavaFileObjects(filename);
		//编译任务
		CompilationTask t= complier.getTask(null, fileManager, null, null, null, units);
		t.call();
		fileManager.close();
		
		
		//load 到内存
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class c=cl.loadClass("com.imooc.proxyPattern.$Proxy0");
		System.out.println(c.getName());
		return null;
	}

}
