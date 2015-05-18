/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-31
 */
package design.pattern.Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 *�Ǽ�ʽ����
 *����Spring����ķ�����������ע�ᣬ�´δ�����ֱ�ӻ�ȡ
 */
public class Singleton3 {
	private static Map<String,Singleton3> map = new HashMap<String,Singleton3>();
	static {
		Singleton3 single = new Singleton3();
		map.put(single.getClass().getName(),single);
	}
	//������Ĭ�Ϲ��캯��
	protected Singleton3(){
		
	}
	
	//��̬������������������Ψһ��ʵ��
	public static Singleton3 getInstance(String name){
		if(name==null){
			name = Singleton3.class.getName();
			System.out.println("name==null"+"---->name="+name);
		}
		if(map.get(name)==null){
			try{
				map.put(name, (Singleton3)Class.forName(name).newInstance());
			}catch(InstantiationException e){
				e.printStackTrace();
			}catch(IllegalAccessException e){
				e.printStackTrace();
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		return map.get(name);
	}
	
	public String about() {      
        return "Hello, I am RegSingleton.";      
    }      
    public static void main(String[] args) {  
        Singleton3 single3 = Singleton3.getInstance(null);  
        System.out.println(single3.about());  
    }  
	
	
	
	
}
