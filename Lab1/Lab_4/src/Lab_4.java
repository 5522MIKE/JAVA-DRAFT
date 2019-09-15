
import java.util.Scanner;

public class Lab_4 {

	public static void hanoi(int n, String a, String b,String c) {
        if (n == 1) {
            move(n, a, c);
        } else {
            hanoi(n - 1, a, c, b);
            move(n, a, c);
            hanoi(n - 1, b, a, c);
        }
    }

    public static void move(int n, String i, String j) {
        System.out.println("��" + n + "��λ�õ�Բ�̣�" + "��" + i + "�ƶ���" + j);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var input = new Scanner(System.in);
		int n = input.nextInt();
		hanoi(n,"A","B","C");
	}

}
