/*尝试使用各种包装类，包括Integer、Boolean、
 * Byte、Character、Double、Number。要求创建这些包装类的实例，
 * 并分别测试至少3种方法的使用。*/

public class Lab4_2 {

	public static void main(String[] args) {
		Integer number1 = new Integer(43);
		Integer number2 = new Integer("43");
		System.out.println(number1.equals(number2));
		String s1 = number1.toString();
		System.out.println(s1);
		String s2[] = { "35", "67" };
		int a = Integer.parseInt(s2[0]);
		int b = Integer.parseInt(s2[1]);
		int sum = a + b;
		System.out.println(sum);

		Boolean number3 = new Boolean(true);
		System.out.println(number3.booleanValue());
		System.out.println(number3.equals(false));
		System.out.println(number3.toString());

		byte mybyte = 43;
		Byte n1 = new Byte(mybyte);
		Byte n2 = new Byte("23");
		System.out.println(n1.compareTo(n2));
		System.out.println(n1.doubleValue());
		System.out.println(n1.toString());

		char c1 = 'A';
		Character c2 = new Character(c1);
		System.out.println(c2.compareTo('a'));
		System.out.println(Character.toLowerCase(c2));
		System.out.println(Character.isUpperCase(c2));

		Double n3 = new Double(23.34);
		System.out.println(n3.byteValue());
		System.out.println(n3.compareTo(23.34001));
		System.out.println(n3.toString());

	}

}