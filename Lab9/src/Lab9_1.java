import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TexturePaint;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


/*建立一个用户注册界面，要求至少具有以下数据项:

a、姓名:文本框JTextField、密码:密码框JPassWord

b、性别:单选JRadioButton

c、爱好:复选框JCheckBox

d、学制:下拉列表JComBox （本科、专科、研究生）

e、校区:列表框JList     （五山、南海、大学城）

f、自我介绍:文本域JTextArea，要求具有垂直滚动条（利用JScrollPane）。
*/
public class Lab9_1 extends JFrame {
	public Lab9_1() {
		Container container = getContentPane();
		setLayout(null);

		// 用户注册
		final JLabel jlT = new JLabel("<html><body><h1 color='blue'>用户注册</h1></body></html>");
		jlT.setBounds(150, 10, 100, 30);
		container.add(jlT);

		// 姓名
		JLabel nameJLabel = new JLabel("用户名：");
		nameJLabel.setBounds(100, 50, 50, 30);
		JTextField jTname = new JTextField();
		jTname.setBounds(150, 50, 100, 30);

		JLabel passwJLabel = new JLabel("密码：");
		passwJLabel.setBounds(100, 100, 50, 30);
		JPasswordField jPasswordField = new JPasswordField();
		jPasswordField.setBounds(150, 100, 100, 30);

		container.add(nameJLabel);
		container.add(passwJLabel);
		container.add(jTname);
		container.add(jPasswordField);

		// 性别 单选框
		JRadioButton jrman = new JRadioButton();
		JRadioButton jrwoman = new JRadioButton();
		jrman.setBounds(150, 150, 50, 30);
		jrwoman.setBounds(200, 150, 50, 30);
		jrman.setText("男");
		jrwoman.setText("女");
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(jrman);
		bGroup.add(jrwoman);
		container.add(jrman);
		container.add(jrwoman);

		// 爱好 复选框
		JLabel jLlike = new JLabel("爱好:");
		jLlike.setBounds(100, 200, 30, 30);
		container.add(jLlike);

		final JPanel jp1 = new JPanel();
		jp1.setBounds(150, 200, 200, 100);
		jp1.setLayout(new GridLayout(2, 2, 25, 25));
		container.add(jp1);

		String arr[] = { "音乐", "运动", "阅读", "旅行" };

		for (int i = 0; i < arr.length; i++) {
			JCheckBox jcb1 = new JCheckBox(arr[i]);
			jp1.add(jcb1);
		}

		// 学制 下拉列表
		JLabel studyJLabel = new JLabel("请选择学制：");
		studyJLabel.setBounds(50, 330, 75, 30);
		container.add(studyJLabel);

		String[] stuStrings = { "研究生", "本科生", "专科生" };
		JComboBox<String> stuBox = new JComboBox<String>(stuStrings);
		stuBox.setBounds(150, 330, 100, 30);
		container.add(stuBox);

		// 校区 列表框
		JLabel placeJLabel = new JLabel("校区：");
		placeJLabel.setBounds(90, 370, 40, 30);
		container.add(placeJLabel);

		String[] placeStrings = { "五山", "南海", "大学城" };
		JList<String> placeJList = new JList<String>(placeStrings);
		placeJList.setBounds(150, 370, 100, 70);
		container.add(placeJList);

		// 自我介绍 文本域
		JPanel jPanel=new JPanel();
		JLabel woJLabel = new JLabel("自我介绍：");
		woJLabel.setBounds(70, 480, 60, 30);
		container.add(woJLabel);

		JTextArea woArea = new JTextArea(5,30);
		woArea.setBackground(Color.white);
		woArea.setLineWrap(true); // 自动换行
		
		JScrollPane jsp = new JScrollPane(woArea); 
		jsp.setBounds(150, 480, 120, 80);
//		container.add(woArea);	//woArea已经被添加了
		container.add(jsp);
		
		

		// 提交
		JButton jButton = new JButton("提交");
		jButton.setBounds(150, 580, 100, 30);
		container.add(jButton);

		// 背景设置
		//container.setBackground(Color.white);
		setVisible(true);
		setBounds(300, 300, 400, 650);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null); 

	}

	public static void main(String[] args) {
		new Lab9_1();

	}

}
