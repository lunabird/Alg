/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-2
 */
package play;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Jackson {
	final String chineseName = "易烊千玺";
	final Calendar birthday = Calendar.getInstance();
	final String birthPalce = "湖南怀化";
	final String nationality = "China";
	final String constellation = "sagittarius";//射手座
	
	
	int height = 168;
	String[] nickName = {"千千","千玺","千总"," 小千千","学霸千","玺宝","玺子哥"};
	String firm = "北京时代峰峻文化艺术发展有限公司";
	String position = "舞蹈担当";
	String fansName = "千纸鹤";
	String favoriteColor = "red";
	ArrayList<Work> works = new ArrayList<Work>();//作品列表
	
	private Jackson() {
		birthday.set(2000, 11, 28);
	}
	
	private static Jackson jackson = null;

	public synchronized static Jackson getJackson() {
		if (jackson == null) {
			jackson = new Jackson();
		}
		return jackson;
	}
	
	public void showYouLove(){
		draw3R(5);
	}
	
	
	public static void main(String[] args){
		Jackson jackson = Jackson.getJackson();
		System.out.println(jackson.chineseName);
		jackson.showYouLove();
	}
	
	
	
	
	private static void draw3R(int n) {
		boolean[][] arr = new boolean[3 * n - 1][4 * n - 1];
		draw3(arr, 0, 0, n, true);
		draw3(arr, 0, 2 * n - 1 + 1, n, true);
		draw3(arr, n, 0, 2 * n - 1, false);
//		print(arr);
	}

	private static void print(boolean[][] arr) {
		
	}

	private static void draw3(boolean[][] arr, int x, int y, int n,
			boolean order) {
		for (int i = 0; i < n; i++) {
			if (order) {
				for (int j = y + (n - i - 1); j <= y + (2 * n - 1) - (n - i); j++) {
					arr[i][j] = true;
				}
			} else {
				for (int j = y + i + 1; j <= y + 2 * n - 1 - i; j++) {
					arr[i + x][j] = true;
				}
			}
		}
	}

	
	
	
	
	
	
	
}
/**
 * 作品类
 */
class Work{
	String name;
	String attribute;
	Date date;
	
	public Work(String name,String attribute,Date date){
		this.name = name;
		this.attribute = attribute;
		this.date = date;
	}
}