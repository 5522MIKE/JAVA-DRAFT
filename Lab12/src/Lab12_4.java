import java.util.Stack;

/*ʵ�������߳�֮���Э����ʹ�ö�ջStack�����������߳����ö�ջ��ѹ�����ݣ����������̴߳Ӷ�ջ��ȡ������
a����ջ����10������ʱ�������߳��������������ѹ���ջ
b����ջδ��ʱ�������̵߳���ջ������ջ��ʱ�������̵߳ȴ�
c��һ������һ�����ѣ��������̡߳��������߳�ִ��˳��ȷ��

*�ο�����:
Stack����Vector��һ�����࣬��ʵ����һ����׼�ĺ���ȳ���ջ��
��ջֻ������Ĭ�Ϲ��캯������������һ����ջ�� ��ջ���˰�����Vector��������з�����Ҳ�������Լ���һЩ������
���췽��:Stack<Integer> st = new Stack<Integer>();
��ŷ�������
1 boolean empty()    ���Զ�ջ�Ƿ�Ϊ�ա�
2 Object peek( )        �鿴��ջ�����Ķ��󣬵����Ӷ�ջ���Ƴ�����
3 Object pop( )         �Ƴ���ջ�����Ķ��󣬲���Ϊ�˺�����ֵ���ظö���
4 Object push(Object element)   ����ѹ���ջ������
5 int search(Object element)       ���ض����ڶ�ջ�е�λ�ã��� 1 Ϊ������*/

class Producer extends Thread{
	private Stack<Integer> stack = new Stack<Integer>();
	
//	public Producer() {
//		this.start();
//	}
	
	public void run() {
		while(true) {
			if (stack.empty()) {
				try {
					System.out.println("Consumer please wait!");
					Consumer.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				double rand = Math.random();
				int count = (int) (rand * 10);
				stack.add(count);
				System.out.println(stack.peek());
			}else if(stack.size()<10 && stack.size()>0) {
				double rand = Math.random();
				int count = (int) (rand * 10);
				stack.add(count);
				System.out.println(stack.peek());
			}else if(stack.size()>=10) {
				return;
			}
		}
	}
	
	synchronized public Integer stackPop() {
		if(stack.size()>0) {
			return stack.pop();
		}else {
			return null;
		}
		
	}
}

class Consumer extends Thread{
	private Producer producer = null;
	
	public Consumer(Producer producer) {
		this.start();
		producer.start();
		this.producer = producer;
	}
	
	public void run() {
		while(true) {
			if(producer.stackPop()==null) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				try {
					producer.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("consum:"+producer.stackPop());
			}
		}
	}
	
	public void pop() {
		System.out.println("consum:"+producer.stackPop());
	}
}

public class Lab12_4 {
	
	
	
	public static void main(String[] args) {
		Producer p = new Producer();
		Consumer c = new Consumer(p);
//		c.pop();
	}
}
