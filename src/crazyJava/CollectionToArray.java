/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-20
 */
package crazyJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Administrator
 *
 */
public class CollectionToArray {
	
	public void collectionTest(){
		Collection collection1=new ArrayList();//创建一个集合对象
		collection1.add("000");//添加对象到Collection集合中
		collection1.add("111");
		collection1.add("222");
		System.out.println("集合collection1的大小："+collection1.size());
		System.out.println("集合collection1的内容："+collection1);
		collection1.remove("000");//从集合collection1中移除掉 "000" 这个对象
		System.out.println("集合collection1移除 000 后的内容："+collection1);
		System.out.println("集合collection1中是否包含000 ："+collection1.contains("000"));
		System.out.println("集合collection1中是否包含111 ："+collection1.contains("111"));
		Collection collection2=new ArrayList();
		collection2.addAll(collection1);//将collection1 集合中的元素全部都加到collection2中
		System.out.println("集合collection2的内容："+collection2);
		collection2.clear();//清空集合 collection1 中的元素
		System.out.println("集合collection2是否为空 ："+collection2.isEmpty());
		//将集合collection1转化为数组
		Object s[]= collection1.toArray();
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}
	
	
	public void LinkedListTest() {
		LinkedList queue = new LinkedList();
		queue.addFirst("Bernadine");
		queue.addFirst("Elizabeth");
		queue.addFirst("Gene");
		queue.addFirst("Elizabeth");
		queue.addFirst("Clara");
		System.out.println(queue);
		queue.removeLast();
		queue.removeLast();
		System.out.println(queue);

	}
	
	
	public void ListIteratorTest() {
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println("下标0开始：" + list.listIterator(0).next());// next()
		System.out.println("下标1开始:" + list.listIterator(1).next());
		System.out.println("子List 1-3:" + list.subList(1, 3));// 子列表
		ListIterator it = list.listIterator();// 默认从下标0开始
		// 隐式光标属性add操作 ,插入到当前的下标的前面
		it.add("sss");
		it = list.listIterator();
		while (it.hasNext()) {
			System.out.println("next Index=" + it.nextIndex() + ",Object="
					+ it.next());
		}
		// set属性
		ListIterator it1 = list.listIterator();
		it1.next();
		it1.set("ooo");
		ListIterator it2 = list.listIterator(list.size());// 下标
		while (it2.hasPrevious()) {
			System.out.println("previous Index=" + it2.previousIndex()
					+ ",Object=" + it2.previous());
		}
	}
	
	
	public static void main(String[] args) {		
		CollectionToArray c = new CollectionToArray();
		c.ListIteratorTest();
	}
}

