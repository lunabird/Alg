/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-24
 */
package worksap;

/**
 * @author Administrator
 * 要求实现一个FIFO队列；能够查看最大值、最小值、中位数；队列中的每个对象能够比较大小。
 */
public interface ExamPeekableQueue<E extends Comparable<E>> {  
    public void enqueue(E e);  
    public E dequeue();  
    public E peekMedian();  
    public E peekMaximum();  
    public E peekMinimum();  
    public int size();  
}  