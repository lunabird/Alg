package crazyJava;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-25 上午10:39:58 
 * 
 */
public class URLDecoderTest {
	public static void main(String[] args) throws Exception{
		//将application/x-ww-form-urlencoded字符串转换成普通字符串
		
		String aa="81AUCMPT6BAYQYCRJRDLQU5LUS1H1H6IBR8UTX4TVA48A22VBK-10063";
		String keyWord = URLDecoder.decode("%E6%9D%8E%E5%88%9A+j2ee","UTF-8");
		
//		System.out.println(keyWord);
		System.out.println(URLDecoder.decode(aa,"UTF-8"));
		
		//将普通字符串转换成application/x-ww-form-urlencoded字符串
		String urlStr = URLEncoder.encode("ROR 敏捷开发最佳指南","GBK");
//		System.out.println(urlStr);
	}
}
