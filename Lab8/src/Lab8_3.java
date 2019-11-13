import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/*ʵ��һ���򵥵�ͼƬ�鿴������׼����һЩͼƬ��������ļ��У�����Ϊ1.jpg��2.jpg����

�ڴ�������������ť������һ�š�����һ�š������ʱ������ʾһ����ͼƬ��*/

public class Lab8_3 extends JFrame {
	private JLabel jl = new JLabel();
	private int i = 1;
	int imgW = 760;
	int imgH = 480;

	public Lab8_3(String title) {
		super(title);
		Container container = getContentPane();
		ImageIcon img = new ImageIcon(Lab8_3.class.getResource(i + ".jpg"));
		img.setImage(img.getImage().getScaledInstance(imgW, imgH, Image.SCALE_DEFAULT));
		jl.setIcon(img);
		JButton jb1 = new JButton("��һ��");
		JButton jb2 = new JButton("��һ��");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				i--;
				if (i < 1)
					i = 4;

				ImageIcon img = new ImageIcon(Lab8_3.class.getResource(i + ".jpg"));
				img.setImage(img.getImage().getScaledInstance(imgW, imgH, Image.SCALE_DEFAULT));
				jl.setIcon(img);
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				i++;
				if (i > 4)
					i = 1;
				ImageIcon img = new ImageIcon(Lab8_3.class.getResource(i + ".jpg"));
				img.setImage(img.getImage().getScaledInstance(imgW, imgH, Image.SCALE_DEFAULT));
				jl.setIcon(img);
			}
		});

		jl.setOpaque(true);
		setLayout(null);
		jl.setBounds(10, 10, 760, 480);
		jb1.setBounds(200, 500, 100, 30);
		jb2.setBounds(500, 500, 100, 30);
		setVisible(true);
		setSize(800, 600);
		container.add(jl);
		container.add(jb1);
		container.add(jb2);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Lab8_3("ͼƬ�л�");
	}

}
