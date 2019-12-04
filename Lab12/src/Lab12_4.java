import java.util.Stack;

/*实现两个线程之间的协作，使用堆栈Stack，由生产者线程往该堆栈中压入数据，由消费者线程从堆栈中取出数据
a、堆栈不足10个数据时生产者线程生产随机整数并压入堆栈
b、堆栈未空时消费者线程弹出栈顶，堆栈空时消费者线程等待
c、一边生产一边消费，生产者线程、消费者线程执行顺序不确定

*参考资料:
Stack类是Vector的一个子类，它实现了一个标准的后进先出的栈。
堆栈只定义了默认构造函数，用来创建一个空栈。 堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。
构造方法:Stack<Integer> st = new Stack<Integer>();
序号方法描述
1 boolean empty()    测试堆栈是否为空。
2 Object peek( )        查看堆栈顶部的对象，但不从堆栈中移除它。
3 Object pop( )         移除堆栈顶部的对象，并作为此函数的值返回该对象。
4 Object push(Object element)   把项压入堆栈顶部。
5 int search(Object element)       返回对象在堆栈中的位置，以 1 为基数。*/

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
