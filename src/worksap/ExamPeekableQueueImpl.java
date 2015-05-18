/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-24
 */
package worksap;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @author Administrator
 *
 */
public class ExamPeekableQueueImpl<E extends Comparable<E>> implements ExamPeekableQueue<E>{


	private LinkedList<E> q;

	public ExamPeekableQueueImpl() {
		q = new LinkedList<E>();
	}
	
	/* (non-Javadoc)
	 * @see worksap.ExamPeekableQueue#enqueue(java.lang.Comparable)
	 */
	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		if(e==null)  
        {  
            throw new IllegalArgumentException();  
        }  
        q.offer(e);  
	}

	/* (non-Javadoc)
	 * @see worksap.ExamPeekableQueue#dequeue()
	 */
	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(q.isEmpty())  
        {  
            throw new NoSuchElementException();  
        }  
        return q.remove();    
	}

	/* (non-Javadoc)
	 * @see worksap.ExamPeekableQueue#peekMedian()
	 */
	@Override
	public E peekMedian() {
		// TODO Auto-generated method stub
		Collections.sort(q);  
        E e = null;  
        int i = 0;  
		for (Iterator it = q.iterator(); it.hasNext();) {
			if (i < q.size() / 2 + 1) {
				e = (E) it.next();
				i++;
			} else {
				break;
			}
		}
        return e;  
	}

	/* (non-Javadoc)
	 * @see worksap.ExamPeekableQueue#peekMaximum()
	 */
	@Override
	public E peekMaximum() {
		// TODO Auto-generated method stub
		E e = q.peek();  
        for(Iterator it = q.iterator();it.hasNext();)  
        {  
            E tmp = (E)it.next();  
            if(e.compareTo(tmp)<=0)  
                e = tmp;  
        }  
        return e;  
	}

	/* (non-Javadoc)
	 * @see worksap.ExamPeekableQueue#peekMinimum()
	 */
	@Override
	public E peekMinimum() {
		// TODO Auto-generated method stub
		E e = q.peek();  
        for(Iterator it = q.iterator();it.hasNext();)  
        {  
            E tmp = (E)it.next();  
            if(e.compareTo(tmp)>=0)  
                e = tmp;  
        }  
        return e;  
	}

	/* (non-Javadoc)
	 * @see worksap.ExamPeekableQueue#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return q.size();  
	}

	public static void main(String[] args){  
        ExamPeekableQueueImpl eq = new ExamPeekableQueueImpl();  
        eq.enqueue(new Integer(7));  
        eq.enqueue(new Integer(1));  
        eq.enqueue(new Integer(3));  
        eq.enqueue(new Integer(3));  
        eq.enqueue(new Integer(5));  
        eq.enqueue(new Integer(1));  
        eq.enqueue(new Integer(2));  
        eq.enqueue(new Integer(4));  
        eq.enqueue(new Integer(3));  
          
        System.out.println(eq.peekMinimum());  
        System.out.println(eq.peekMedian());  
        System.out.println(eq.peekMaximum());  
        System.out.println(eq.size());  
    }  
	
	
	
}
