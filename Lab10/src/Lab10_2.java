import java.util.TreeSet;
import java.util.Iterator;

/*模仿完成P262例14.4，理解TreeSet是如何实现数据有序的。*/

class UpdateStu implements Comparable<Object> {
	String name;
	long id;

	public UpdateStu(String nameString, long id) {
		this.id = id;
		this.name = nameString;
	}

	public int compareTo(Object o) {
		UpdateStu upStu = (UpdateStu) o;
		int result = id > upStu.id ? 1 : (id == upStu.id ? 0 : -1);
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

public class Lab10_2 {

	public static void main(String[] args) {
		UpdateStu s1 = new UpdateStu("李小明", 001);
		UpdateStu s2 = new UpdateStu("李中明", 002);
		UpdateStu s3 = new UpdateStu("李大明", 003);
		UpdateStu s4 = new UpdateStu("李大大明", 004);

		TreeSet<UpdateStu> tree = new TreeSet<>();
		tree.add(s1);
		tree.add(s2);
		tree.add(s3);
		tree.add(s4);

		Iterator<UpdateStu> it = tree.iterator();
		System.out.println("Set集合中的所有元素");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + "" + stu.getName());
		}

		it = tree.headSet(s2).iterator();
		System.out.println("截取前面部分的集合：");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + "" + stu.getName());
		}

		it = tree.subSet(s2, s3).iterator();
		System.out.println("截取中间部分的集合");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + "" + stu.getName());
		}
	}

}
