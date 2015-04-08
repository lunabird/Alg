package crazyJava;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-26 ����11:40:01 
 * 
 */
public class ClassLoaderPropTest {
	
	public static void main(String[] args) throws IOException{
		//��ȡϵͳ�������
		ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
		System.out.println("ϵͳ���������"+systemLoader);
		/**
		 * ��ȡϵͳ��������ļ���·����ͨ����CLASSPATH��������ָ��
		 * �������ϵͳû��ָ��CLASSPATH����������Ĭ���Ե�ǰ·����Ϊ
		 * ϵͳ��������ļ���·��
		 */
		Enumeration<URL> eml = systemLoader.getResources("");
		while(eml.hasMoreElements()){
			System.out.println(eml.nextElement());
		}
		//��ȡϵͳ��������ĸ����������Ӧ�õõ���չ�������
		ClassLoader extensionLoader = systemLoader.getParent();
		System.out.println("��չ���������"+extensionLoader);
		System.out.println("��չ��������ļ���·����"+System.getProperty("java.exe.dirs"));
		System.out.println("��չ���������parent:"+extensionLoader.getParent());
	}
	
}
