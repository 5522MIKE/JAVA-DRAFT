import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*分别使用HashMap、TreeMap存储同样顺序的10个不同英文单词，
 * 然后分别遍历输出它们，看看两者的存储结果有何不同。*/
//TreeMap可以完成顺序输出
public class Lab10_3 {

	public static void main(String[] args) {

		// HashMap实现
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "a");
		map.put("3", "c");
		map.put("2", "b");

		// 构建Map集合中所有values值的集合
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("key集合中的元素");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 构建Map集合中所有values值的集合
		Collection<String> collection = map.values();
		it = collection.iterator();
		System.out.println("values集合中的元素");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// TreeMap实现
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("1", "a");
		treeMap.put("3", "c");
		treeMap.put("2", "b");

		// 构建Map集合中所有values值的集合
		Set<String> tset = treeMap.keySet();
		Iterator<String> tit = set.iterator();
		System.out.println("treeMap key集合中的元素");
		while (tit.hasNext()) {
			System.out.println(tit.next());
		}

		// 构建Map集合中所有values值的集合
		Collection<String> tcollection = treeMap.values();
		tit = tcollection.iterator();
		System.out.println("treeMap values集合中的元素");
		while (tit.hasNext()) {
			System.out.println(tit.next());
		}

	}

}
