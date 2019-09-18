/*在包Lab2中创建一个名为Lab2_4的类用于存储银行账户信息，
 * 要求能够存放用户的账号、姓名、密码和账户余额等个人信息，
 * 并包含存款、取款、查询余额和修改账户密码等操作，并用此类创建对象，
 * 对象的账号为100，姓名为Tom，密码为11111，账户余额为10000。*/
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
		System.out.println(this.id+"您的賬戶餘額為："+balance);
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
