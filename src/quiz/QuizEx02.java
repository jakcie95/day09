package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class QuizEx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    HashMap map = new HashMap();
	    String name = null;
	    String price = null;
	    int num=0;
	    while(true) {
	        System.out.println("1.�޴� ���");
	    	System.out.println("2.�޴��� ���� ����");		System.out.println("3.�� ��");
	        System.out.print(">>> ");
		num = input.nextInt();
		switch(num) {
		case 1 :
			while(true) {
			System.out.println("�޴� �Է�");
			name = input.next();
			if(map.containsKey(name) == false) {
				break;
			}
			System.out.println("�����ϴ� �޴�, �ٽ��Է�");
		}
			System.out.println("���� �Է�");
			price = input.next();
			map.put(name, price);
			break;
		case 2 : 
			//System.out.println(map);
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = (String)it.next();
				System.out.println(key+" : "+map.get(key));
			}
			System.out.println("1.���� 2.���� 3.������");
			num = input.nextInt();
			if(num == 1) {
				while(true) {
				System.out.println("���� �޴� �Է�");
				name = input.next();
				if(map.containsKey(name) == true) {
					break;
			}
				System.out.println("�������� �ʴ� �޴�. �ٽ�");
			}
			System.out.println("���� ���� �Է�");
			price = input.next();
			map.put(name, price);
			System.out.println("���� �Ǿ����ϴ�");
			}else if(num == 2) {
				while(true) {
					System.out.println("���� �޴� �Է�");
					name = input.next();
					if(map.containsKey(name) == true) {
						map.remove(name);
						System.out.println(name+"�� ���� �Ǿ����ϴ�");
						break;
					}
					System.out.println("�������� �ʴ� �޴�. �ٽ�");
			}
		}
			break;
		case 3: System.exit(1);
		}
		input.close();
	}
}
}

