package java_exercise50;
/**
 * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
 * 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，
 * 再将第一位和第四位交换，第二位和第三位交换。写出加密和解密的方法。
 * @author Administrator
 *
 */
public class Exercise48 {
	public static void main(String[] args) {
		String upload = (int)(Math.random()*9000+1000)+"";
		System.out.println("加密前："+upload);
		String enciphered = encipher(upload);
		System.out.println("加密后："+enciphered);
		System.out.println("解密后："+ encipher(enciphered));
		
	}
	
	/**
	 * 加密算法，不考虑问题的扩展性
	 * 加密和解密算法一致，第一次调用为加密，第二次调用为解密
	 * @param upload
	 * @return
	 */
	public static String encipher(String upload){
		if(upload.length()>4){
			return null;
		}
		int num = Integer.parseInt(upload);
		
		int num1 = num/1000;
		int num2 = num/100%10;
		int num3 = num/10%10;
		int num4 = num%10;
		
		return ""+(num4+5)%10+(num3+5)%10+(num2+5)%10+(num1+5)%10;
	}
}
