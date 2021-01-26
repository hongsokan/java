package ch13.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "hong", "kim", "lee", "lim", "kim" };
		int[] nums = { 1234, 4567, 2340, 9870, 5432 };

		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		System.out.println(map);
		System.out.println();
		System.out.println("====== Map 이용하여 출력 ======");
		System.out.println("hong 번호: " + map.get("hong"));
		System.out.println("lee  번호: " + map.get("lee"));
		System.out.println("kim  번호: " + map.get("kim"));
		System.out.println();
		
		
		System.out.println("====== Set 이용하여 출력 ======");
		Set<String> keys = map.keySet(); // key(names)
		for(String key : keys) {
			System.out.println(key + " = " + map.get(key));
		}
		System.out.println();
		
		
		System.out.println("====== Iterator 이용하여 출력 ======");
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a + " = " + map.get(a));
		}
		System.out.println();
		
		System.out.println("====== Iterator 이용하여 value만 출력 ======");
		// Map 객체에서 value들만 조회
		Collection<Integer> values = map.values();
		for (Integer i : values) System.out.println(i);
		System.out.println();
		
		Iterator<Integer> itvalue = values.iterator();
		while(itvalue.hasNext()) System.out.println(itvalue.next());
		System.out.println();
		
		
		// key, value 쌍인 객체(Entry)로 조회
		System.out.println("====== key, value 쌍인 객체(Entry)로 조회 ======");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + " 의 번호: " + m.getValue());
			System.out.println(m);
			System.out.println();
		}
	}

}
