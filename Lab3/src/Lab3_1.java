/*����ʹ��String��ĳ��÷�����
 * �������졢��ȡ����length������indexof�������ַ�charAt��
 * ��ȡ�Ӵ�substring��ȥ���ո�trim���滻replace�����equal��
 * �Ƚ�compareTo���ָ�split�ȡ�*/
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

		System.out.println("ȥ���ո��ĳ��ȣ�" + s1.trim().length());

		System.out.println("�����ַ���:" + s1.replace("o", "O"));

		String s2 = "hello world";
		System.out.println("���^�Ƿ����:" + s2.equals(s1));

		System.out.println("���^�ֵ����:" + s2.compareTo(s1));

		String[] arr = s1.split("w");
		for (String i : arr) {
			System.out.println("[" + i + "]");
		}

	}

}
