import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/*����ѧϰP234��13.3����13.4������һ�����ڽ������������ʾһ��Բ��ͼ�����Լ�һ��ͼƬ*/
class icon implements Icon {
	private int width, height;

	public int getIconHeight() {
		return this.height;
	}

	public int getIconWidth() {
		return this.width;
	}

	public icon(int w, int h) {
		width = w;
		height = h;
	}

	// ʵ��painIcon��������
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		arg1.fillOval(x, y, width, height);
	}
}

public class Lab7_3 extends JFrame {

	public static void main(String[] args) {
		icon icon = new icon(15, 15);

		JLabel jl = new JLabel(icon, SwingConstants.CENTER);
		URL url = Lab7_3.class.getResource("b.jpg");
		Icon icon2 = new ImageIcon(url);
		jl.setIcon(icon2);

		jl.setOpaque(true);

		JFrame jf = new JFrame();
		Container container = jf.getContentPane();

		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(200, 150);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
