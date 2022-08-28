package javaTestsPractice;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Siddhi");
		list.add("Mitul");
		list.add("Simi");
		list.add("Mitsi");
	//	System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("----------------------------------------------------------");
		list.remove(3);	
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		
	}

}
