/*使用计算机成绩管理时，容易出现一些数据录入错误，最典型的是成绩范围本应为0~100之间，
 * 却因输入了负数或大于100的数据而出现错误。

请你建立一个成绩异常类ScoreException提示此错误。

在主类中建立成绩录入方法ScoreInput(int n)在数据超出范围时抛出ScoreException异常，最后在main中测试。*/

class ScoreException extends Exception {
	public ScoreException(String ErrorMessage) {
		super(ErrorMessage);
	}
}

public class Lab7_1 {
	private int score;

	public void ScoreInput(int n) throws ScoreException {
		if (n > 100) {
			throw new ScoreException("Error!");
		}
		score = n;
	}

	public static void main(String[] args) {
		try {
			Lab7_1 aLab7_1 = new Lab7_1();
			aLab7_1.ScoreInput(101);
		} catch (ScoreException e) {
			System.out.println(e);
		}

	}

}
