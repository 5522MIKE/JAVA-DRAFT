import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*��дһ�����򣬲���ʹ��ArrayList��LinkedList�ڴ��ģ����Ƶ�ʲ��롢ɾ������ʱ��Ч�ʡ�
 * ���������������Լ���ƣ����ڳ���ǰ����ע�ͷ�ʽ����˵����*/

//ArrayList����ѯ�죬�����ɾ����
//LinkedList����ѯ���������ɾ����

public class Lab10_4 {
	// ����arrayList�����ٶȺ�LinkedList�����ٶ�
	// ��������20����
	public static void testArrayList() {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 20000; i++) {
			list.add(i);
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
			list.add(100, i);
		}
		// System.out.println(list.size());
		// ��ʱ��
		long endTime = System.currentTimeMillis();
		int time = (int) (endTime - startTime);
		System.err.println("arrayList:��������:" + list.size() + " ����ʱ��:" + time + "ms");
	}

	// ��������20����
	public static void testLinkedList() {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 20000; i++) {
			list.add(i);
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
			list.add(100, i);
		}
		// System.out.println(list.size());
		// ��ʱ��
		long endTime = System.currentTimeMillis();
		int time = (int) (endTime - startTime);
		System.err.println("linkedList:��������:" + list.size() + " ����ʱ��:" + time + "ms");
	}

	public static void main(String[] args) {
		Lab10_4.testArrayList();
		Lab10_4.testLinkedList();
	}

}
