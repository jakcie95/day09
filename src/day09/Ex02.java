package day09;
/*
 Map
 - 키와 값으로 하나의 쌍으로 이루어져 있다.
 - 순서는 유지되지 않으며, 키의 중복은허용하지 않는다.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "50만원");
		map.put("자동차", "10만원");
		
		map.put("선풍기", "1000만원"); 
		System.out.println(map);
		System.out.println(map.get("선풍기"));
		System.out.println(map.get("자동차"));
		System.out.println(map.get("없는값"));
		
		System.out.println(map.containsKey("자동차"));
		System.out.println(map.containsKey("ㅁㅁㅁ"));

		map.remove("선풍기");
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		//Set set = map.keySet();
		//Iterator it = set.iterator();
		Iterator it = map.keySet().iterator();
		//it = [bof, 자동차, 선풍기, eof]
		//map = {자동차:10만원, 선풍기:100만원}
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s+" : "+map.get(s));
		}
		
		String k = "우리집", v ="종로 3가";
		map.put(k, v);
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 값 입력");
		String search = sc.next();
		if(map.get(search) == null) {
			System.out.println("존재하지 않는 주소");
		}else {
			System.out.println(
					search + " : " +map.get(search));
		}
		
}
}






