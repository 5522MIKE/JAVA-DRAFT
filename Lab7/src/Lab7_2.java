import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/*模仿P232例13.2编写窗口程序，运行成功后增加以下功能:

a、在主窗体中加入一个Label，显示“我的第一个窗口程序”。

b、在主窗体上增加标题“JFrame主窗体”。*/
public class Lab7_2 extends JFrame {

	public void CJFrame(String title) {
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("我的第一个窗口程序");
		jl.setHorizontalAlignment(SwingConstants.CENTER);

		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(200, 150);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Lab7_2().CJFrame("JFrame主窗体");

	}

}
