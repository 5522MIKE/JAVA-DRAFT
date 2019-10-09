/*建立两个类:People和ChinaPeople。

People类有访问权限是protected的double类型成员变量height和weight，
以及public void speakHello()、public void averageHeight()和public void averageWeight()方法。

ChinaPeople类是People类的子类，新增了public void chinaGongfu()方法，
并重写父类的public void speakHello()方法。*/

class People {

	protected double height, weight;

	public void speakHello() {
		System.out.println("Hello!");
	}

	public void averageHeight() {
		System.out.println("165cm");
	}

	public void averageWeight() {
		System.out.println("120斤");
	}
}

class ChinaPeople extends People {

	public void speakHello() {
		System.out.println("你好!");
	}

	public void chinaGongfu() {
		System.out.println("我~打~~");
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
