package crazyJava;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-25 ����10:27:35 
 * 
 */
public class InetAddressTest {
	public static void main(String[] args) throws IOException{
		
		
		//��������������ȡ��Ӧ��InetAddressʵ��
		InetAddress ip = InetAddress.getByName("www.baidu.com");
		//�ж��Ƿ�ɴ�
		System.out.println("baidu�Ƿ�ɴ"+ip.isReachable(2000));
		//��ȡ��InetAddressʵ����IP�ַ���
		System.out.println(ip.getHostAddress());
		//����ԭʼIP��ַ����ȡ��Ӧ��InetAddressʵ��
		InetAddress local  = InetAddress.getByAddress(new byte[]{127,0,0,1});
		System.out.println("�����Ƿ�ɴ"+local.isReachable(5000));
		//��ȡ��InetAddressʵ����Ӧ��ȫ�޶�����
		System.out.println(local.getCanonicalHostName());
		
		
	}
}
