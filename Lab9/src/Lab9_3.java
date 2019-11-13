
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.acl.Group;
import java.sql.Connection;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Lab9_3 extends JFrame{

	public Lab9_3() {
		Container container=getContentPane();
		setLayout(null);
		final JRadioButton jr1=new JRadioButton();
		final JRadioButton jr2=new JRadioButton();
		final JLabel jl1=new JLabel();
		final JButton btn1=new JButton("提交");
		
		final JLabel jlT=new JLabel("<html><body><h1 color='red'>问卷调查</h1></body></html>");
		jlT.setBounds(150,10,100,30);
		container.add(jlT);
		
		jr1.setText("男");
		jr1.setSelected(true);
		jr1.setBounds(100,50,100,30);
		
		jr2.setText("女");
		jr2.setBounds(100,90,100,30);
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(jr1);
		bg1.add(jr2);		
		container.add(jr1);
		container.add(jr2);
		
		JLabel jl2=new JLabel("爱好：");
		jl2.setBounds(100,120,100,40);
		container.add(jl2);
		
		final JPanel jp1=new JPanel();
		jp1.setBounds(100,150,200,100);		
		jp1.setLayout(new GridLayout(2,2,25,25));
		container.add(jp1);
		
		String arr[]={"音乐","运动","阅读","旅行"};
		
		for(int i=0;i<arr.length;i++)
		{
			JCheckBox jcb1=new JCheckBox(arr[i]);
			jp1.add(jcb1);
		}		
				
		btn1.setBounds(100,250,100,30);
		container.add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {	
				String s1="";
				String s2="";
				if(jr1.isSelected())
					s1="先生";
				else {
					s1="女士";
				}
			
				Component cps[]=jp1.getComponents();
				for (Component cp : cps)
				{
					if(cp instanceof JCheckBox)
					{
						JCheckBox jcb=(JCheckBox)cp;
						if(jcb.isSelected())
							s2+=jcb.getText()+" ";
					}
					
				}
				String str="<html><body><h1>调查结果</h1><p>";
				str+= s1+"，早上好！</p>";
				str+="<p>您的爱好是："+s2+"</p>";
				str+="</body></html>";
				jl1.setText(str);
			}
		});
		
		jl1.setBounds(100,280,200,100);
		container.add(jl1);
		
		setBounds(300,300,400,450);
		setVisible(true);		
		
	}

	public static void main(String[] args) {
		new Lab9_3();
		

	}

}
