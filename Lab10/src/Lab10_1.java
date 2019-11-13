import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*使用ArrayList类，存储一些英文单词，
 * 可根据用户输入的命令，添加、删除某个单词。
 * 添加或删除之前需要先遍历整个数组，检测该单词是否存在。*/
public class Lab10_1 {

	public static void main(String[] args) {
		List<String> arr_list = new ArrayList<>();
		arr_list.add("apple");
		arr_list.add("boss");
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("请输入你的命令(i/s)");
		String mlString = inputScanner.nextLine();

		if (mlString.equals("i")) {
			System.out.println("已经进入添加模式！");
			String string = inputScanner.nextLine();
			arr_list.add(string);
			System.out.println("已添加！");
		} else if (mlString.equals("s")) {
			System.out.println("已经进入删除模式！");
			String string = inputScanner.nextLine();
			for (int i = 0; i < arr_list.size(); i++) {
				if (string.equals(arr_list.get(i))) {
					arr_list.remove(i);
					System.out.println("已删除！");
					break;
				}
				if (i >= arr_list.size() - 1) {
					System.out.println("未找到该词！");
				}
			}
		} else {
			System.out.println("命令错误！");
		}

	}

}
