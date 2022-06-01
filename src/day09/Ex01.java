package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {
/*
  set
  - 순서를 유지하지 않는다
  - 중복된 값은 허용하지 않음
 */
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("홍길동"); arr.add("홍길동"); //ArrayList 는 중복을 허용함
		System.out.println("arr : "+ arr);
		
		HashSet hs = new HashSet();
		hs.add("홍길동"); hs.add("김개똥"); // Set은 중복을 허용하지 않음
		hs.add("홍길동");
		System.out.println(hs.remove("홍길동"));
		System.out.println("hs : " +hs);
		
		hs.add("홍길동");
		// bof = 시작점, eof = 이후에는 데이터가 없음을 알려줌
		//it =[bof,'홍길동','홍길동',eof]
		//		it 
		//			 it
		//					 it
		Iterator it = arr.iterator();
		while(it.hasNext() == true ) {
			System.out.println(it.next());
		}
		/*
		System.out.println(it.hasNext()); //it지점 다음에 값이 있는가 질문한뒤 참 거짓으로 표현
		System.out.println(it.next());	  //it 다음 값 출력
		
		System.out.println(it.hasNext()); 
		System.out.println(it.next());
		
		System.out.println(it.hasNext()); //다음값이 없음으로 false
		*/
		it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			String st = (String)s; //형변환
			System.out.println(s);
			
		}	
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(s1);
}
}










