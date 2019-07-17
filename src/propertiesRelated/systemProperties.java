package propertiesRelated;

import java.util.Properties;

public class systemProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Properties is a class in util package.
		//here getPropertes() method returns the Properties object.
		Properties p=System.getProperties();
		
		p.list(System.out);//**********
		
		/*
		-- listing properties --
		java.runtime.name=Java(TM) SE Runtime Environment
		sun.boot.library.path=C:\Program Files\Java\jre7\bin
		
		user.dir=D:\Selenium Softwares\ProjectsImp\Jav...  ***vimp
		
		os.name=Windows 7   ******** vimp		
		user.name=sys*************vimp
		
		sun.desktop=windows  ******** vimp
		
		java.vm.version=24.71-b01
		java.vm.vendor=Oracle Corporation
		java.vendor.url=http://java.oracle.com/
		path.separator=;
		java.vm.name=Java HotSpot(TM) 64-Bit Server VM
		file.encoding.pkg=sun.io
		user.script=
		user.country=US
		sun.java.launcher=SUN_STANDARD
		sun.os.patch.level=Service Pack 1
		java.vm.specification.name=Java Virtual Machine Specification
		
		
		java.runtime.version=1.7.0_71-b14
		
		java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
		java.endorsed.dirs=C:\Program Files\Java\jre7\lib\endorsed
		os.arch=amd64
		java.io.tmpdir=C:\Users\sys\AppData\Local\Temp\
		line.separator=

		java.vm.specification.vendor=Oracle Corporation
		user.variant=
				
		sun.jnu.encoding=Cp1252
		java.library.path=C:\Program Files\Java\jre7\bin;C:\Win...
		java.specification.name=Java Platform API Specification
		java.class.version=51.0
		sun.management.compiler=HotSpot 64-Bit Tiered Compilers
		os.version=6.1
		
		user.home=C:\Users\sys
		user.timezone=
		java.awt.printerjob=sun.awt.windows.WPrinterJob
		file.encoding=Cp1252
		java.specification.version=1.7
		
		
		
		java.class.path=D:\Selenium Softwares\ProjectsImp\Jav...
		java.vm.specification.version=1.7
		sun.arch.data.model=64
		java.home=C:\Program Files\Java\jre7
		sun.java.command=propertiesRelated.rough
		java.specification.vendor=Oracle Corporation
		user.language=en
		awt.toolkit=sun.awt.windows.WToolkit
		java.vm.info=mixed mode
		java.version=1.7.0_71
		java.ext.dirs=C:\Program Files\Java\jre7\lib\ext;C:...
		sun.boot.class.path=C:\Program Files\Java\jre7\lib\resour...
		java.vendor=Oracle Corporation
		file.separator=\
		java.vendor.url.bug=http://bugreport.sun.com/bugreport/
		sun.cpu.endian=little
		sun.io.unicode.encoding=UnicodeLittle
		
		sun.cpu.isalist=amd64
*/
	}

}
