package TEST;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SAP2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        while (sc.hasNextDouble()) {
            a = sc.nextDouble();
//            DecimalFormat df = new DecimalFormat("#.00");
//            System.out.println(df.format(Math.abs(a)));
            System.out.format("%.2f",(double)Math.abs(a));
            System.out.println();
        }
    }
}

/*
public static void main1(String[] args){
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> al = new ArrayList<Integer>();
	while(true){
		String line = sc.nextLine();
		if(line.equals(""))break;
		int a = Integer.parseInt(line);
		al.add(a);
	}
	for(int i=0;i<al.size();i++){
		System.out.format("%.2f",(float)Math.abs(al.get(i)));
		System.out.println();
	}
}*/