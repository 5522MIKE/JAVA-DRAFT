import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/*����һ�����ڽ��棬���ڱ���Ϊ"�žű�"

�ڴ����ڷ���һ��JLabel��Ȼ���跨��JLabel����ʾһ���žű�Ҫ��������forѭ���õ�99��

��ʾ:swing����ͨ���з���Ч������ʹ��html��ʽ

JLabel jl=new JLabel();

String s1="<html>1x1=1<br>1x2=2 2x.2=4<br>1x3=3 2x3=6 3x3=9<br></html>";

//Ҫ��������forѭ���õ�99���ַ���������ֱ��ʹ������Ĳο�����

jl.setText(s1);*/

class jojo extends JFrame {
	public jojo(String title) {
		JFrame jFrame = new JFrame(title);
		Container container = jFrame.getContentPane();
		String s = new String("<html>");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				String pString = new String(i + "*" + j + "=" + i * j);
				s = s + pString;
			}
			s = s + "<br>";
		}
		s = s + "</html>";
		// System.out.println(s);
		JLabel jLabel = new JLabel(s);
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);

		container.add(jLabel);
		jFrame.setVisible(true);
		jFrame.setSize(600, 600);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jFrame.setLocationRelativeTo(null);

	}
}

public class Lab8_1 {

	public static void main(String[] args) {
		new jojo("JoJo��");

	}

}
