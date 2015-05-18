/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-21
 */
package crazyJava;

import java.util.*;

public class MapTest {
	
	public static void main(String[] args){
		MapTest mt = new MapTest();
		mt.mapTest1();
	}
	
	public void mapTest1(){
		Map map1 = new HashMap(); 
	    Map map2 = new LinkedHashMap();
	    for(int i=0;i<10;i++){
	    	double s=Math.random()*100;//����һ������������������Map��
	    	 map1.put(new Integer((int) s),"�� "+i+" �������Ԫ�أ�"+s+"\n");
	    	 map2.put(new Integer((int) s),"�� "+i+" �������Ԫ�أ�"+s+"\n");
	    }
	    
	    System.out.println("δ����ǰHashMap��"+map1);
	    System.out.println("δ����ǰLinkedHashMap��"+map2);
	    //ʹ��TreeMap���������Map�����ع�������
	    Map sortedMap = new TreeMap(map1);
	    System.out.println("�����"+sortedMap);
	    System.out.println("�����"+new TreeMap(map2));

	}
	
	
	public void mapTest2() {
		Map map1 = new HashMap();
		Map map2 = new HashMap();
		map1.put("1", "aaa1");
		map1.put("2", "bbb2");
		map2.put("10", "aaaa10");
		map2.put("11", "bbbb11");
		// ���ݼ� "1" ȡ��ֵ��"aaa1"
		System.out.println("map1.get(\"1\")=" + map1.get("1"));
		// ���ݼ� "1" �Ƴ���ֵ��"1"-"aaa1"
		System.out.println("map1.remove(\"1\")=" + map1.remove("1"));
		System.out.println("map1.get(\"1\")=" + map1.get("1"));
		map1.putAll(map2);// ��map2ȫ��Ԫ�ط���map1��
		map2.clear();// ���map2
		System.out.println("map1 IsEmpty?=" + map1.isEmpty());
		System.out.println("map2 IsEmpty?=" + map2.isEmpty());
		System.out.println("map1 �еļ�ֵ�Եĸ���size = " + map1.size());
		System.out.println("KeySet=" + map1.keySet());// set
		System.out.println("values=" + map1.values());// Collection
		System.out.println("entrySet=" + map1.entrySet());
		System.out.println("map1 �Ƿ��������11 = " + map1.containsKey("11"));
		System.out.println("map1 �Ƿ����ֵ��aaa1 = " + map1.containsValue("aaa1"));
	}
}
