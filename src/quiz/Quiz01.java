package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		int a, b;
		HashMap map = new HashMap();
		map.put("���","1500");
		map.put("���", "1000");
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1.�޴� ���");
		System.out.println("2.�޴��� ���� ����");
		System.out.println("3. ����");
		a = sc.nextInt();
		if(a == 1) {
			System.out.println("�޴� �Է�");
			System.out.println("���� �Է�");
			String menu = sc.next();
			String price = sc.next();
			if(map.get(menu) == null) {
				map.put(menu, price);
				System.out.println(map);
			}else {
				System.out.println("�����ϴ� �޴��Դϴ�");
			}
		}else if(a == 2) {
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
			String menu = (String)it.next();
			System.out.println(menu+" : "+map.get(menu));
			}
			System.out.println("1.����\t2.����\t3.������");
			b =sc.nextInt();
			if(b == 1) {
				
			}else if(b == 2) {
			
			}else if(b == 3) {
				break;
			}
				
		}else {
			System.out.println("�ý��� ����");
			System.exit(0);
		}
		sc.close();
	}
	
		
		
}
}
