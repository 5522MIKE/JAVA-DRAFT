import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*编写一个程序，测试使用ArrayList和LinkedList在大规模、高频率插入、删除数据时的效率。
 * 测试条件及方法自己设计，并在程序前面以注释方式加以说明。*/

//ArrayList：查询快，插入和删除慢
//LinkedList：查询慢，插入和删除快

public class Lab10_4 {
		//测试arrayList插入速度和LinkedList插入速度
		//插入数据20万条 
		public static void testArrayList() {
			List<Integer> list =new ArrayList<Integer>();
			
			for (int i = 0; i < 20000; i++) {
				list.add(i);
			}
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < 200000; i++) {
				list.add(100, i);
			}
			//System.out.println(list.size());
			//计时器
			long endTime = System.currentTimeMillis();
			int time=(int) (endTime - startTime);
			System.err.println("arrayList:插入数据:"+list.size()+" 运行时间:" + time + "ms");
		}
		
		//插入数据20万条 
		public static void testLinkedList() {
			List<Integer> list =new LinkedList<Integer>();
			for (int i = 0; i < 20000; i++) {
				list.add(i);
			}
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < 200000; i++) {
				list.add(100, i);
			}
			//System.out.println(list.size());
			//计时器
			long endTime = System.currentTimeMillis();
			int time=(int) (endTime - startTime);
			System.err.println("linkedList:插入数据:"+list.size()+" 运行时间:" + time + "ms");
		}
		
		public static void main(String[] args) {
			Lab10_4.testArrayList();
			Lab10_4.testLinkedList();
		}

}
