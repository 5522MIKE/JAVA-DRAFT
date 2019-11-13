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


/*����һ���û�ע����棬Ҫ�����پ�������������:

a������:�ı���JTextField������:�����JPassWord

b���Ա�:��ѡJRadioButton

c������:��ѡ��JCheckBox

d��ѧ��:�����б�JComBox �����ơ�ר�ơ��о�����

e��У��:�б��JList     ����ɽ���Ϻ�����ѧ�ǣ�

f�����ҽ���:�ı���JTextArea��Ҫ����д�ֱ������������JScrollPane����
*/
public class Lab9_1 extends JFrame {
	public Lab9_1() {
		Container container = getContentPane();
		setLayout(null);

		// �û�ע��
		final JLabel jlT = new JLabel("<html><body><h1 color='blue'>�û�ע��</h1></body></html>");
		jlT.setBounds(150, 10, 100, 30);
		container.add(jlT);

		// ����
		JLabel nameJLabel = new JLabel("�û�����");
		nameJLabel.setBounds(100, 50, 50, 30);
		JTextField jTname = new JTextField();
		jTname.setBounds(150, 50, 100, 30);

		JLabel passwJLabel = new JLabel("���룺");
		passwJLabel.setBounds(100, 100, 50, 30);
		JPasswordField jPasswordField = new JPasswordField();
		jPasswordField.setBounds(150, 100, 100, 30);

		container.add(nameJLabel);
		container.add(passwJLabel);
		container.add(jTname);
		container.add(jPasswordField);

		// �Ա� ��ѡ��
		JRadioButton jrman = new JRadioButton();
		JRadioButton jrwoman = new JRadioButton();
		jrman.setBounds(150, 150, 50, 30);
		jrwoman.setBounds(200, 150, 50, 30);
		jrman.setText("��");
		jrwoman.setText("Ů");
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(jrman);
		bGroup.add(jrwoman);
		container.add(jrman);
		container.add(jrwoman);

		// ���� ��ѡ��
		JLabel jLlike = new JLabel("����:");
		jLlike.setBounds(100, 200, 30, 30);
		container.add(jLlike);

		final JPanel jp1 = new JPanel();
		jp1.setBounds(150, 200, 200, 100);
		jp1.setLayout(new GridLayout(2, 2, 25, 25));
		container.add(jp1);

		String arr[] = { "����", "�˶�", "�Ķ�", "����" };

		for (int i = 0; i < arr.length; i++) {
			JCheckBox jcb1 = new JCheckBox(arr[i]);
			jp1.add(jcb1);
		}

		// ѧ�� �����б�
		JLabel studyJLabel = new JLabel("��ѡ��ѧ�ƣ�");
		studyJLabel.setBounds(50, 330, 75, 30);
		container.add(studyJLabel);

		String[] stuStrings = { "�о���", "������", "ר����" };
		JComboBox<String> stuBox = new JComboBox<String>(stuStrings);
		stuBox.setBounds(150, 330, 100, 30);
		container.add(stuBox);

		// У�� �б��
		JLabel placeJLabel = new JLabel("У����");
		placeJLabel.setBounds(90, 370, 40, 30);
		container.add(placeJLabel);

		String[] placeStrings = { "��ɽ", "�Ϻ�", "��ѧ��" };
		JList<String> placeJList = new JList<String>(placeStrings);
		placeJList.setBounds(150, 370, 100, 70);
		container.add(placeJList);

		// ���ҽ��� �ı���
		JPanel jPanel=new JPanel();
		JLabel woJLabel = new JLabel("���ҽ��ܣ�");
		woJLabel.setBounds(70, 480, 60, 30);
		container.add(woJLabel);

		JTextArea woArea = new JTextArea(5,30);
		woArea.setBackground(Color.white);
		woArea.setLineWrap(true); // �Զ�����
		
		JScrollPane jsp = new JScrollPane(woArea); 
		jsp.setBounds(150, 480, 120, 80);
//		container.add(woArea);	//woArea�Ѿ��������
		container.add(jsp);
		
		

		// �ύ
		JButton jButton = new JButton("�ύ");
		jButton.setBounds(150, 580, 100, 30);
		container.add(jButton);

		// ��������
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
