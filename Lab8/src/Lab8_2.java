import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*开发一个窗体，用于测试Java的边界布局和网格布局管理器。
 * 窗口有4个按钮分别位于四边，分别显示“上、下、左、右”。中间区域是一个JPanel，
 * 其中有3行3列共9个按钮，分别显示按钮1、按钮2、按钮3……*/
public class Lab8_2 extends JFrame {
	public Lab8_2(String title) {
		super(title);
		setLayout(new BorderLayout());
		Container con = getContentPane();
		setLayout(new BorderLayout());
		JButton jb1 = new JButton("上");
		JButton jb2 = new JButton("下");
		JButton jb3 = new JButton("左");
		JButton jb4 = new JButton("右");
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3, 3, 0, 0));
		for (int i = 1; i <= 9; i++) {
			JButton jb = new JButton("按钮" + i);
			jp.add(jb);
		}
		setLayout(new BorderLayout());
		con.add(jb1, BorderLayout.NORTH);
		con.add(jb2, BorderLayout.SOUTH);
		con.add(jb3, BorderLayout.WEST);
		con.add(jb4, BorderLayout.EAST);
		con.add(jp, BorderLayout.CENTER);
		setVisible(true);
		setSize(500, 400);
		setLocationRelativeTo(null); 
	}

	public static void main(String[] args) {

		new Lab8_2("布局测试");
	}

}
