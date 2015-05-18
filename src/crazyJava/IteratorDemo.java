/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-20
 */
package crazyJava;

/**
 * @author Administrator
 *
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
 
public class IteratorDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("s1");
		collection.add("s2");
		collection.add("s3");
		Iterator iterator = collection.iterator();//得到一个迭代器
		while (iterator.hasNext()) {//遍历
			Object element = iterator.next();
			System.out.println("iterator = " + element);
		}
		if(collection.isEmpty())
			System.out.println("collection is Empty!");
		else
			System.out.println("collection is not Empty! size="+collection.size());
		Iterator iterator2 = collection.iterator();
		while (iterator2.hasNext()) {//移除元素
			Object element = iterator2.next();
			System.out.println("remove: "+element);
			iterator2.remove();
		}		
		Iterator iterator3 = collection.iterator();
		if (!iterator3.hasNext()) {//察看是否还有元素
			System.out.println(iterator3.hasNext()+"没有元素");
		}	
		if(collection.isEmpty())
			System.out.println("collection is Empty!");
		//使用collection.isEmpty()方法来判断
	}
}

