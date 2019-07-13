package ly.base.tools;

/**
 *MD5密码加密
 *
 */

import java.security.*; 
import java.security.spec.*; 
public final class MD5 {
	
	public final static String MD5(String s){ 
		char hexDigits[] = { 
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 
		'e', 'f'}; 
		try { 
			byte[] strTemp = s.getBytes(); 
			MessageDigest mdTemp = MessageDigest.getInstance("MD5"); //生成散列码,为应用程序提供信息摘要算法的功能，如 MD5 或 SHA 算法
			mdTemp.update(strTemp); //使用指定的字节更新摘要。
			byte[] md = mdTemp.digest(); //通过运行诸如填充之类的终于操作完毕哈希计算。
			int j = md.length; 
			char str[] = new char[j * 2]; 
			int k = 0; 
			for (int i = 0; i < j; i++) { 
				byte byte0 = md[i]; 
				str[k++] = hexDigits[byte0 >>> 4 & 0xf]; 
				str[k++] = hexDigits[byte0 & 0xf]; 
			} 
			return new String(str); 
		} 
		catch (Exception e){ 
			return null; 
		} 
	}
}
