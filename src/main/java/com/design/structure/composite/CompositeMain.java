package com.design.structure.composite;

import com.design.structure.composite.impl.File;
import com.design.structure.composite.impl.Folder;

/**
 * 组合模式启动类
 * 文件夹类add，print
 * 文件类 vim，cat
 */
public class CompositeMain {

	public static void main(String[] args) {
		// 父级目录
		Folder rootDir = new Folder("root目录");
		Folder nginx = new Folder("Nginx安装目录");
		Folder tomcat = new Folder("tomcat安装目录");
		File startup = new File("start.bat");
		rootDir.add(nginx);
		rootDir.add(tomcat);
		rootDir.add(startup);
		rootDir.print();
		startup.vim("java -jar");
		startup.cat();
		// 文件夹不支持查看
		nginx.cat();
	}
}
