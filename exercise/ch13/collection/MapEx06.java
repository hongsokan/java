package ch13.collection;
import java.util.*;
import java.util.Map.Entry;

class MapEx06 {
	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap();
	//groupName , collection(Map)
	public static void main(String[] args) {
		addPhoneNo("ģ��", "���ڹ�", "010-111-1111");
		addPhoneNo("ģ��", "���ڹ�", "010-222-2222");
		addPhoneNo("ģ��", "���ڹ�", "010-333-3333");
		addPhoneNo("ȸ��", "��븮", "010-444-4444");
		addPhoneNo("ȸ��", "��븮", "010-555-5555");
		addPhoneNo("ȸ��", "�ڴ븮", "010-666-6666");
		addPhoneNo("ȸ��", "�̰���", "010-777-7777");
		addPhoneNo("��Ź", "010-888-8888");
		printList();
	} 

	// �׷쿡 ��ȭ��ȣ�� �߰��ϴ� �޼���
		static void addPhoneNo(String groupName, String name, String tel) {
			addGroup(groupName);
			HashMap<String, String> group =  phoneBook.get(groupName);
			group.put(tel, name);	// �̸��� �ߺ��� �� ������ ��ȭ��ȣ�� key�� �����Ѵ�.
		}
		static void addPhoneNo(String name, String tel) {
			addPhoneNo("��Ÿ", name, tel);		}
	// �׷��� �߰��ϴ� �޼���<String, HashMap>
	
		static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap<String, String>());	}
		
		static void printList() {
		//phoneBook.entrySet()---> set.iterator() ----> Iterator(�ݺ���)
	//	Set<Map.Entry<String , HashMap<String, String>>> set=  ;
		Iterator<Map.Entry<String , HashMap<String, String>>>   
		itp = phoneBook.entrySet().iterator();
			while(itp.hasNext()) {	
				Map.Entry<String , HashMap<String, String>> e=itp.next();
				System.out.println(" * "+ e.getKey()  + "["+e.getValue().size()+"]");
			//	System.out.println(e.getValue());
				
				Iterator<Map.Entry<String, String>>   subit = 
						e.getValue().entrySet().iterator();
				while(subit.hasNext()) {	
					Map.Entry<String, String> se = subit.next();
					System.out.println(se.getValue()+"="+se.getKey());
				}
			}
		}
		
} // class








