package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {
/*
  set
  - ������ �������� �ʴ´�
  - �ߺ��� ���� ������� ����
 */
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("ȫ�浿"); arr.add("ȫ�浿"); //ArrayList �� �ߺ��� �����
		System.out.println("arr : "+ arr);
		
		HashSet hs = new HashSet();
		hs.add("ȫ�浿"); hs.add("�谳��"); // Set�� �ߺ��� ������� ����
		hs.add("ȫ�浿");
		System.out.println(hs.remove("ȫ�浿"));
		System.out.println("hs : " +hs);
		
		hs.add("ȫ�浿");
		// bof = ������, eof = ���Ŀ��� �����Ͱ� ������ �˷���
		//it =[bof,'ȫ�浿','ȫ�浿',eof]
		//		it 
		//			 it
		//					 it
		Iterator it = arr.iterator();
		while(it.hasNext() == true ) {
			System.out.println(it.next());
		}
		/*
		System.out.println(it.hasNext()); //it���� ������ ���� �ִ°� �����ѵ� �� �������� ǥ��
		System.out.println(it.next());	  //it ���� �� ���
		
		System.out.println(it.hasNext()); 
		System.out.println(it.next());
		
		System.out.println(it.hasNext()); //�������� �������� false
		*/
		it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			String st = (String)s; //����ȯ
			System.out.println(s);
			
		}	
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(s1);
}
}










