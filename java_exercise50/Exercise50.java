package java_exercise50;

public class Exercise50 {
	public static void main(String[] args) {
		//验证int转字节码
		System.out.println(NumTransform.toBytecode(10));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(NumTransform.toBytecode(-11));
		System.out.println(Integer.toBinaryString(-11));
		System.out.println("==========================================");
		
		/*测试转8进制(Integer.toOctalString()处理负值得到的是该数补码对应的八进制数，
		 * 这里自定义的转换是不含符号位的)*/
		System.out.println(NumTransform.toOctonary(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(NumTransform.toOctonary(-100));
		System.out.println("==========================================");
		
		//测试转16进制，同样不考虑符号位
		System.out.println(NumTransform.toHexadecimal(1000));
		System.out.println(Integer.toHexString(1000));
		System.out.println(NumTransform.toHexadecimal(-1000));
	}
}

class NumTransform{
	/**
	 * 转为字节码
	 * @param num
	 * @return
	 */
	public static String toBytecode(int num){
		if(num >= 0){
			return trueForm(num);
		}
		num = -1*num -1;
		String trueForm = trueForm(num);
		char[] byteArray = trueForm.toCharArray();
		for(int i=0;i<byteArray.length;i++){
			if(byteArray[i] == '1'){
				byteArray[i] = '0';
			}else{
				byteArray[i] = '1';
			}
		}
		return new String(byteArray);
	}

	/**
	 * 获取原码
	 * @param num
	 * @return
	 */
	private static String trueForm(int num) {
		String bytecode = "";
		while(num>0){
			bytecode = num%2 + bytecode;
			num /= 2;
		}
		while(bytecode.length()<32){
			bytecode = "0"+bytecode;
		}
		return bytecode;
	}
	
	/**
	 * 转为八进制
	 * @param num
	 * @return
	 */
	public static String toOctonary(int num){
		String octonary = "";
		if(num == 0){
			return "0";
		}
		if(num > 0){
			while(num>0){
				octonary = num%8 + octonary;
				num /= 8;
			}
		}
		if(num < 0){
			num *= -1;
			while(num>0){
				octonary = num%8 + octonary;
				num /= 8;
			}
			octonary = "-"+octonary;
		}
		return octonary;
	}
	
	/**
	 *转为16进制 
	 * @param num
	 * @return
	 */
	public static String toHexadecimal(int num){
		if(num == 0){
			return "0";
		}
		return num>0?positiveHex(num):"-"+positiveHex(-num);
	}
	
	/**
	 * 返回正整数的16进制
	 * @param num
	 * @return
	 */
	private static String positiveHex(int num){
		String hexadecimal = "";
		while(num>0){
			switch(num%16){
			case 10:
				hexadecimal = "A"+hexadecimal;
				break;
			case 11:
				hexadecimal = "B"+hexadecimal;
				break;
			case 12:
				hexadecimal = "C"+hexadecimal;
				break;
			case 13:
				hexadecimal = "D"+hexadecimal;
				break;
			case 14:
				hexadecimal = "E"+hexadecimal;
				break;
			case 15:
				hexadecimal = "F"+hexadecimal;
				break;
			default:
				hexadecimal = num%16+hexadecimal;
			}
			num /= 16;
		}
		return hexadecimal;
	}
}
