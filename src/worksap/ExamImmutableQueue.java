/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-24
 */
package worksap;

/**
 * @author Administrator
 * 一，实现Immutable的FIFO队列。也就是说要求入队和出队不会改变原来的队列。
[java] view plaincopyprint?
1.	package jp.co.worksap.recruiting;  
2.	  
3.	public interface ExamImmutableQueue<E> {  
4.	    public ExamImmutableQueue<E> enqueue(E e);  
5.	    public ExamImmutableQueue<E> dequeue();  
6.	    public E peek();  
7.	    public int size();  
8.	}  

 *
 */
public interface ExamImmutableQueue<E> {
	public ExamImmutableQueue<E> enqueue(E e);
	public ExamImmutableQueue<E> dequeue();  
	public E peek();  
	public int size();  
}


