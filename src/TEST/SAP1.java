package TEST;

import java.util.ArrayList;
import java.util.Scanner;

public class SAP1 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(true){
			String line = sc.nextLine();
			if(line.equals("")){
				break;
			}
			al.add(Integer.parseInt(line.split(" ")[0]));
			al.add(Integer.parseInt(line.split(" ")[1]));
		}
		System.out.println("***************");
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
	}

}
