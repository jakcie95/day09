package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		int a, b;
		HashMap map = new HashMap();
		map.put("김밥","1500");
		map.put("라면", "1000");
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1.메뉴 등록");
		System.out.println("2.메뉴별 가격 보기");
		System.out.println("3. 종료");
		a = sc.nextInt();
		if(a == 1) {
			System.out.println("메뉴 입력");
			System.out.println("가격 입력");
			String menu = sc.next();
			String price = sc.next();
			if(map.get(menu) == null) {
				map.put(menu, price);
				System.out.println(map);
			}else {
				System.out.println("존재하는 메뉴입니다");
			}
		}else if(a == 2) {
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
			String menu = (String)it.next();
			System.out.println(menu+" : "+map.get(menu));
			}
			System.out.println("1.수정\t2.삭제\t3.나가기");
			b =sc.nextInt();
			if(b == 1) {
				
			}else if(b == 2) {
			
			}else if(b == 3) {
				break;
			}
				
		}else {
			System.out.println("시스템 종료");
			System.exit(0);
		}
		sc.close();
	}
	
		
		
}
}
