package TEST;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountString {
	/**
	 * �����ı��ļ����ַ������ֵĴ���
	 * @param filename
	 * @param target
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static int count(String filename, String target)
			throws FileNotFoundException, IOException {
		//���ļ����ݶ����ڴ���
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		StringBuilder strb = new StringBuilder();
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			strb.append(line);
		}
		String result = strb.toString();
		
		
		//����
		int count = 0;
		int index = -1;
		while (true) {
			index = result.indexOf(target, index+1);
			if (index >= 0) {
				count++;
			} else {
				break;
			}
		}
		br.close();//
		
		return count;
	}

	public static void main(String[] args) {
		try {
			System.out.println(count("D:\\zuidaima.txt", "q"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/*public static void main(String[] args) {
		String s;
		System.out.println();//���벻��ͨ��
	}*/

}

