import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*ʹ��ArrayList�࣬�洢һЩӢ�ĵ��ʣ�
 * �ɸ����û�����������ӡ�ɾ��ĳ�����ʡ�
 * ��ӻ�ɾ��֮ǰ��Ҫ�ȱ����������飬���õ����Ƿ���ڡ�*/
public class Lab10_1 {

	public static void main(String[] args) {
		List<String> arr_list = new ArrayList<>();
		arr_list.add("apple");
		arr_list.add("boss");
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("�������������(i/s)");
		String mlString = inputScanner.nextLine();

		if (mlString.equals("i")) {
			System.out.println("�Ѿ��������ģʽ��");
			String string = inputScanner.nextLine();
			arr_list.add(string);
			System.out.println("����ӣ�");
		} else if (mlString.equals("s")) {
			System.out.println("�Ѿ�����ɾ��ģʽ��");
			String string = inputScanner.nextLine();
			for (int i = 0; i < arr_list.size(); i++) {
				if (string.equals(arr_list.get(i))) {
					arr_list.remove(i);
					System.out.println("��ɾ����");
					break;
				}
				if (i >= arr_list.size() - 1) {
					System.out.println("δ�ҵ��ôʣ�");
				}
			}
		} else {
			System.out.println("�������");
		}

	}

}
