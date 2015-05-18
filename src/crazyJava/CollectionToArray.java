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
		Collection collection1=new ArrayList();//����һ�����϶���
		collection1.add("000");//��Ӷ���Collection������
		collection1.add("111");
		collection1.add("222");
		System.out.println("����collection1�Ĵ�С��"+collection1.size());
		System.out.println("����collection1�����ݣ�"+collection1);
		collection1.remove("000");//�Ӽ���collection1���Ƴ��� "000" �������
		System.out.println("����collection1�Ƴ� 000 ������ݣ�"+collection1);
		System.out.println("����collection1���Ƿ����000 ��"+collection1.contains("000"));
		System.out.println("����collection1���Ƿ����111 ��"+collection1.contains("111"));
		Collection collection2=new ArrayList();
		collection2.addAll(collection1);//��collection1 �����е�Ԫ��ȫ�����ӵ�collection2��
		System.out.println("����collection2�����ݣ�"+collection2);
		collection2.clear();//��ռ��� collection1 �е�Ԫ��
		System.out.println("����collection2�Ƿ�Ϊ�� ��"+collection2.isEmpty());
		//������collection1ת��Ϊ����
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
		System.out.println("�±�0��ʼ��" + list.listIterator(0).next());// next()
		System.out.println("�±�1��ʼ:" + list.listIterator(1).next());
		System.out.println("��List 1-3:" + list.subList(1, 3));// ���б�
		ListIterator it = list.listIterator();// Ĭ�ϴ��±�0��ʼ
		// ��ʽ�������add���� ,���뵽��ǰ���±��ǰ��
		it.add("sss");
		it = list.listIterator();
		while (it.hasNext()) {
			System.out.println("next Index=" + it.nextIndex() + ",Object="
					+ it.next());
		}
		// set����
		ListIterator it1 = list.listIterator();
		it1.next();
		it1.set("ooo");
		ListIterator it2 = list.listIterator(list.size());// �±�
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

