
/*建立一个简易的投票软件，基本外观如下:有4根红颜色的柱形图横向摆放，
 * 每个柱形图上方显示得票数，每个柱形图下方都有个“投票”按钮。
 * 一开始得票数为0，柱形图高度为1像素，点击投票时根据得票的增加柱形图的高度也增加。*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame {
	int[] count = new int[4];
	final int total = 4;
	JButton keys[] = new JButton[total];
	JTextField jl[] = new JTextField[total];

	public MyFrame() {
		Container container = getContentPane();
		setLayout(null);
		setSize(500, 300);
		setVisible(true);
		setLocation(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < jl.length; i++) {
			jl[i] = new JTextField("0");
			jl[i].setBounds(10, 10 + 60 * i, 18, 15);
			jl[i].setEditable(false);
			container.add(jl[i]);
		}
		for (int i = 0; i < keys.length; i++) {
			keys[i] = new JButton("刷票");
			keys[i].setBounds(10, 50 + 60 * i, 60, 20);
			container.add(keys[i]);
			final int j = i;
			keys[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					count[j]++;
					String str = " " + count[j];
					jl[j].setText(str);
					repaint();
				}
			});
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.RED);
		g.fillRect(20, 60, 1 + count[0], 10);
		g.fillRect(20, 120, 1 + count[1], 10);
		g.fillRect(20, 180, 1 + count[2], 10);
		g.fillRect(20, 240, 1 + count[3], 10);
	}
}

public class Lab9_2 {
	public static void main(String[] args) {
		new MyFrame();
	}

}
