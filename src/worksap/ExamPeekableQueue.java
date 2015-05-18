/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-24
 */
package worksap;

/**
 * @author Administrator
 * Ҫ��ʵ��һ��FIFO���У��ܹ��鿴���ֵ����Сֵ����λ���������е�ÿ�������ܹ��Ƚϴ�С��
 */
public interface ExamPeekableQueue<E extends Comparable<E>> {  
    public void enqueue(E e);  
    public E dequeue();  
    public E peekMedian();  
    public E peekMaximum();  
    public E peekMinimum();  
    public int size();  
}  