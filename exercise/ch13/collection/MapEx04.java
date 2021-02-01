package ch13.collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx04 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "ȫ�浿", "���", "�̸���", "�Ӳ���", "���" };
		int[] nums = { 1234, 4567, 2350, 9870, 2345 };
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		// Map ��ü�� (Ű,��ü)������ �̷���� ��ü���� ����.
		// (Ű,��ü)���� ��ü ��ȸ�ϱ�
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "=" + m.getValue());
			System.out.println(m);
		}
	}
}