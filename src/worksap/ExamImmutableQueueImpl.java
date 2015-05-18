/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-24
 */
package worksap;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Administrator
 * Immutable的语义是不能够改变原来的队列，所以在做操作时需要克隆出
 * 另外一个队列进行
 */
public class ExamImmutableQueueImpl<E> implements ExamImmutableQueue<E>{
	
	private List<E> q; //使用List集合类的实现
	int size;
	
	
	/**
	 * 构造函数
	 */
	public ExamImmutableQueueImpl(){
		q = new ArrayList<E>();
	}
	public ExamImmutableQueueImpl(List<E> q){
		this.q = q;
		this.size = q.size();
	}
	
	
	/* (non-Javadoc)
	 * @see worksap.ExamImmutableQueue#enqueue(java.lang.Object)
	 */
	@Override
	public ExamImmutableQueue<E> enqueue(E e) {
		// TODO Auto-generated method stub
		if(e==null){  
            throw new IllegalArgumentException();   
        } 
		List<E> clone = new ArrayList<E>(q); //用q克隆一个新的队列对象
		clone.add(e); 
		return new ExamImmutableQueueImpl<E>(clone) ; 
	}

	/* (non-Javadoc)
	 * @see worksap.ExamImmutableQueue#dequeue()
	 */
	@Override
	public ExamImmutableQueue<E> dequeue() {
		// TODO Auto-generated method stub
		if(q.isEmpty()){
			throw new NoSuchElementException();
		}
		List<E> clone = new ArrayList<E>(q);
		clone.remove(0);
		return new ExamImmutableQueueImpl<E>(clone);
	}

	/* (non-Javadoc)
	 * @see worksap.ExamImmutableQueue#peek()
	 */
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if(q.isEmpty()){
			throw new NoSuchElementException();
		}
		return q.get(0);
	}

	/* (non-Javadoc)
	 * @see worksap.ExamImmutableQueue#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return q.size();
	}
	
}

