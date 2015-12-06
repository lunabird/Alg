/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-9-29
 */
package play;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Main {
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] s = new int[N+1][N+1];
		for(int i=0;i<=N;i++){
			for(int j=0;j<=N;j++){
				s[i][j] = 0;
			}
		}
		for(int i=1;i<N;i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			int k = sc.nextInt();
			s[u][v] = k; 
			s[v][u] = k;
		}
		String[] commands = new String[M+1];
		sc.nextLine();
		for(int i=1;i<=M;i++){
			String str = sc.nextLine();
			commands[i] = str;
		}
		
		sc.close();
		
		
	
		
		//edit
		
		for(int i=1;i<=M;i++){
			
			if(commands[i].contains("EDIT")){
				String[] arr = commands[i].split(" ");
				int u = Integer.parseInt(arr[1]);
				int v = Integer.parseInt(arr[2]);
				int k = Integer.parseInt(arr[3]);
				s[u][v] = k;
				s[v][u] = k;
			}else{
				//copy
				int[][] ts = new int[N+1][N+1];
				for(int a=0;a<=N;a++){
					for(int b=0;b<=N;b++){
						ts[a][b] = s[a][b];
					}
				}
				//print s
				for(int a=0;a<=N;a++){
					for(int b=0;b<=N;b++){
						System.out.print(s[a][b]+" ");
					}
					System.out.println();
				}
				//¼ÆËã
				for(int iz=1;iz<=N;iz++){
					for(int jz=1;jz<=N;jz++){
						if(iz!=jz && s[iz][jz]==0){
							ts[iz][jz] = cb(iz,jz,N,ts);
						}
					}
				}
				//Ïà¼Ó
				int sum = 0;
				for(int i1=0;i1<=N;i1++){
					for(int j1=0;j1<=N;j1++){
						System.out.println(ts[i1][j1]);
						sum+=ts[i1][j1];
					}
					System.out.println("$$");
				}
				System.out.println(sum/2);
			}
			
		}
	}
	
	public static int cb(int i,int j,int N,int[][] s){
		if(s[i][j]!=0){
			return s[i][j];
		}else{
			for(int k =1;k<=N;k++){
				if(k==i || k==j) continue;
				if(s[i][k]!=0 && s[k][j]!=0){
					s[i][j] = s[i][k] + s[k][j];
				}else if(s[i][k]==0){
					s[i][k] = cb(i,k,N,s);
				}else{
					s[k][j] = cb(k,j,N,s);
				}
				
			}
			return s[i][j];
		}
	}
	

}
/*
3 5
1 2 2
2 3 3
QUERY
EDIT 1 2 4
QUERY
EDIT 2 3 2
QUERY




10
14
12
*/