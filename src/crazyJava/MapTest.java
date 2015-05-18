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
	    	double s=Math.random()*100;//产生一个随机数，并将其放入Map中
	    	 map1.put(new Integer((int) s),"第 "+i+" 个放入的元素："+s+"\n");
	    	 map2.put(new Integer((int) s),"第 "+i+" 个放入的元素："+s+"\n");
	    }
	    
	    System.out.println("未排序前HashMap："+map1);
	    System.out.println("未排序前LinkedHashMap："+map2);
	    //使用TreeMap来对另外的Map进行重构和排序
	    Map sortedMap = new TreeMap(map1);
	    System.out.println("排序后："+sortedMap);
	    System.out.println("排序后："+new TreeMap(map2));

	}
	
	
	public void mapTest2() {
		Map map1 = new HashMap();
		Map map2 = new HashMap();
		map1.put("1", "aaa1");
		map1.put("2", "bbb2");
		map2.put("10", "aaaa10");
		map2.put("11", "bbbb11");
		// 根据键 "1" 取得值："aaa1"
		System.out.println("map1.get(\"1\")=" + map1.get("1"));
		// 根据键 "1" 移除键值对"1"-"aaa1"
		System.out.println("map1.remove(\"1\")=" + map1.remove("1"));
		System.out.println("map1.get(\"1\")=" + map1.get("1"));
		map1.putAll(map2);// 将map2全部元素放入map1中
		map2.clear();// 清空map2
		System.out.println("map1 IsEmpty?=" + map1.isEmpty());
		System.out.println("map2 IsEmpty?=" + map2.isEmpty());
		System.out.println("map1 中的键值对的个数size = " + map1.size());
		System.out.println("KeySet=" + map1.keySet());// set
		System.out.println("values=" + map1.values());// Collection
		System.out.println("entrySet=" + map1.entrySet());
		System.out.println("map1 是否包含键：11 = " + map1.containsKey("11"));
		System.out.println("map1 是否包含值：aaa1 = " + map1.containsValue("aaa1"));
	}
}
