/*测试使用String类的常用方法，
 * 包括构造、获取长度length、查找indexof、返回字符charAt、
 * 获取子串substring、去除空格trim、替换replace、相等equal、
 * 比较compareTo、分割split等。*/
public class Lab3_1 {

	public static void main(String[] args) {
		String s1 = new String("hello world");
		System.out.println("s1:" + s1);

		int size = s1.length();
		System.out.println("size:" + size);

		int size1 = s1.indexOf("e");
		System.out.println("e:" + size1);

		char mychar = s1.charAt(2);
		System.out.println("mychar2:" + mychar);

		String substr = s1.substring(2);
		System.out.println("substr:" + substr);

		System.out.println("去除空格后的长度：" + s1.trim().length());

		System.out.println("更改字符串:" + s1.replace("o", "O"));

		String s2 = "hello world";
		System.out.println("比較是否相等:" + s2.equals(s1));

		System.out.println("比較字典順序:" + s2.compareTo(s1));

		String[] arr = s1.split("w");
		for (String i : arr) {
			System.out.println("[" + i + "]");
		}

	}

}
