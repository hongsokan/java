package ch13.collection;

import java.util.*;

public class HashMapEx03 {
	
	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("친구", "aaaa", "010-1111-1111");
		addPhoneNo("친구", "bbbb", "010-2222-2222");
		addPhoneNo("친구", "cccc", "010-3333-3333");
		addPhoneNo("회사", "abcd", "010-4444-4444");
		addPhoneNo("회사", "bbcc", "010-5555-5555");
		addPhoneNo("회사", "ddee", "010-6666-6666");
		addPhoneNo("회사", "aaaa", "010-7777-7777");
		addPhoneNo("세탁", "010-8888-8888");
//		System.out.println(phoneBook);
//		System.out.println();
		printList();
	}
	
	// 그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> group = phoneBook.get(groupName);
		group.put(tel, name); // 이름은 증복될 수 있으나, 전화번호를 key로 저장.
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	
	// 그룹을 추가하는 메서드 <String, HashMap>
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}
	
	static void printList() {
//		Set<Map.Entry<String, HashMap<String, String>>> set = phoneBook.entrySet();
//		Iterator<Map.Entry<String, HashMap<String, String>>> itp = set.iterator();
		
		Iterator<Map.Entry<String, HashMap<String, String>>> itp = phoneBook.entrySet().iterator();
		
		while(itp.hasNext()) {
			Map.Entry<String, HashMap<String, String>> e = itp.next();
			
			System.out.println(" * " + e.getKey() + "[" + e.getValue().size() + "]");
			// System.out.println(e.getValue());
			
			Iterator<Map.Entry<String, String>> subIter = e.getValue().entrySet().iterator();
			while(subIter.hasNext()) {
				// System.out.println(subIter.next());
				Map.Entry<String, String> se = subIter.next();
				System.out.println(se.getValue() + " = " + se.getKey());
			}
			
			System.out.println();
			
//			for(Map.Entry<String, String> entry: e.getValue().entrySet()) {
//				System.out.println(entry.getValue() + " = " + entry.getKey());
//			}
		}
	}
}
