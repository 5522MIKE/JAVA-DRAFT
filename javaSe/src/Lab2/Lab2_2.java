/*����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ���?*/

package Lab2;

import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,mouth,day,sum=0;
		boolean error=false;
		
		var input = new Scanner(System.in);
		
		do {
			error = false;
            System.out.println("������:");
            year = input.nextInt();
            System.out.println("������:");
            mouth = input.nextInt();
            System.out.println("������:");
            day = input.nextInt();
            if (mouth < 0 || mouth > 12 || day < 0 || day > 31) {
                System.out.println("input error!");
                error = true;
            }
        } while (error == true);
		
		for (int i = 1; i <mouth; i++) {
            switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                day = 31;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                day = 30;
                break;
            }
            case 2: {
                if ((year % 100 !=0 &&year % 4 == 0) || (year % 100 == 0 && year%400==0)) {
                    day = 29;
                } else {
                    day = 28;
                }
            }
            default:
                break;
            }
            sum += day;
        }
        System.out.println("����"+year+"���"+(sum+day)+"��");

	}

}
