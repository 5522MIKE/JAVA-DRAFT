import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*�ֱ�ʹ��HashMap��TreeMap�洢ͬ��˳���10����ͬӢ�ĵ��ʣ�
 * Ȼ��ֱ����������ǣ��������ߵĴ洢����кβ�ͬ��*/
//TreeMap�������˳�����
public class Lab10_3 {

	public static void main(String[] args) {

		// HashMapʵ��
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "a");
		map.put("3", "c");
		map.put("2", "b");

		// ����Map����������valuesֵ�ļ���
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("key�����е�Ԫ��");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// ����Map����������valuesֵ�ļ���
		Collection<String> collection = map.values();
		it = collection.iterator();
		System.out.println("values�����е�Ԫ��");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// TreeMapʵ��
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("1", "a");
		treeMap.put("3", "c");
		treeMap.put("2", "b");

		// ����Map����������valuesֵ�ļ���
		Set<String> tset = treeMap.keySet();
		Iterator<String> tit = set.iterator();
		System.out.println("treeMap key�����е�Ԫ��");
		while (tit.hasNext()) {
			System.out.println(tit.next());
		}

		// ����Map����������valuesֵ�ļ���
		Collection<String> tcollection = treeMap.values();
		tit = tcollection.iterator();
		System.out.println("treeMap values�����е�Ԫ��");
		while (tit.hasNext()) {
			System.out.println(tit.next());
		}

	}

}
