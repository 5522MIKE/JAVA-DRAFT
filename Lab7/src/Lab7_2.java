import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/*ģ��P232��13.2��д���ڳ������гɹ����������¹���:

a�����������м���һ��Label����ʾ���ҵĵ�һ�����ڳ��򡱡�

b���������������ӱ��⡰JFrame�����塱��*/
public class Lab7_2 extends JFrame {

	public void CJFrame(String title) {
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("�ҵĵ�һ�����ڳ���");
		jl.setHorizontalAlignment(SwingConstants.CENTER);

		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(200, 150);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Lab7_2().CJFrame("JFrame������");

	}

}
