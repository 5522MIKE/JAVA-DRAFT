/*����������:People��ChinaPeople��

People���з���Ȩ����protected��double���ͳ�Ա����height��weight��
�Լ�public void speakHello()��public void averageHeight()��public void averageWeight()������

ChinaPeople����People������࣬������public void chinaGongfu()������
����д�����public void speakHello()������*/

class People {

	protected double height, weight;

	public void speakHello() {
		System.out.println("Hello!");
	}

	public void averageHeight() {
		System.out.println("165cm");
	}

	public void averageWeight() {
		System.out.println("120��");
	}
}

class ChinaPeople extends People {

	public void speakHello() {
		System.out.println("���!");
	}

	public void chinaGongfu() {
		System.out.println("��~��~~");
	}
}

public class Lab5_2 {

	public static void main(String[] args) {
		People Tim = new People();
		Tim.speakHello();

		ChinaPeople liu = new ChinaPeople();
		liu.chinaGongfu();
		liu.speakHello();

	}

}
