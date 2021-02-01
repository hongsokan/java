package ch13.collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx03 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names =	{"ȫ�浿","���","�̸���","�Ӳ���","���"};
		int[] nums = {1234,4567,2350,9870,2345};
		for(int i=0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		//Map ��ü���� value�鸸 ��ȸ�ϱ�
		Collection<Integer> values = map.values();
		for(Integer i : values)
			System.out.println(i);
		Iterator<Integer> it = values.iterator();
		while(it.hasNext())
			System.out.println(it.next());
    }
}