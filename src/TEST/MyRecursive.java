package TEST;
//a recursive sum
public class MyRecursive {
	
	int sum(int n){
		if(n==1)
			return 1;
		return n+sum(n-1);
	}
	
	int sum1(int n){
		return (1+n)*n/2;
	}
	
	public static void main(String[] args){
		MyRecursive mr = new MyRecursive();
		System.out.println(mr.sum(20));
		System.out.println(mr.sum1(20));
	}
}
