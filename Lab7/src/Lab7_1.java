/*ʹ�ü�����ɼ�����ʱ�����׳���һЩ����¼���������͵��ǳɼ���Χ��ӦΪ0~100֮�䣬
 * ȴ�������˸��������100�����ݶ����ִ���

���㽨��һ���ɼ��쳣��ScoreException��ʾ�˴���

�������н����ɼ�¼�뷽��ScoreInput(int n)�����ݳ�����Χʱ�׳�ScoreException�쳣�������main�в��ԡ�*/

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
