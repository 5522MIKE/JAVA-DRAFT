/*�ڰ�Lab2�д���һ����ΪLab2_4�������ڴ洢�����˻���Ϣ��
 * Ҫ���ܹ�����û����˺š�������������˻����ȸ�����Ϣ��
 * ��������ȡ���ѯ�����޸��˻�����Ȳ��������ô��ഴ������
 * ������˺�Ϊ100������ΪTom������Ϊ11111���˻����Ϊ10000��*/
public class Lab2_4 {
	private String id,name,password;
	private double balance;
	
	public Lab2_4(String name,String id,String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public double deposit(double d) {
		balance += d;
		return balance;
	}

	public double withdraw(double w) {
		balance += w;
		return balance;
	}
	
	public void show() {
		System.out.println(this.id+"�����~���N�~�飺"+balance);
	}
	
	public void revise(String id,String password) {
		this.id = id;
		this.password = password;
	}

	public static void main(String[] args) {
		Lab2_4 Tom = new Lab2_4("Tom","100","11111");
		Tom.deposit(1000);
		Tom.show();
	}

}
