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
		Iterator iterator = collection.iterator();//�õ�һ��������
		while (iterator.hasNext()) {//����
			Object element = iterator.next();
			System.out.println("iterator = " + element);
		}
		if(collection.isEmpty())
			System.out.println("collection is Empty!");
		else
			System.out.println("collection is not Empty! size="+collection.size());
		Iterator iterator2 = collection.iterator();
		while (iterator2.hasNext()) {//�Ƴ�Ԫ��
			Object element = iterator2.next();
			System.out.println("remove: "+element);
			iterator2.remove();
		}		
		Iterator iterator3 = collection.iterator();
		if (!iterator3.hasNext()) {//�쿴�Ƿ���Ԫ��
			System.out.println(iterator3.hasNext()+"û��Ԫ��");
		}	
		if(collection.isEmpty())
			System.out.println("collection is Empty!");
		//ʹ��collection.isEmpty()�������ж�
	}
}

