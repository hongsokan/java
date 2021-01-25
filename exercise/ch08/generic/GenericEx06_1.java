package ch08.generic;

class Generic6 <T> {
	T[] v;
	
	void set(T[] n) {
		v = n;
	}
	
	T[] get() {
		return v;
	}
	
	void print() {
		for (T o : v) {
			System.out.print(o + ",");
		}
		System.out.println();
	}
}

public class GenericEx06_1 {

	public static void main(String[] args) {
		Generic6<String> sg = new Generic6<String>();
		String[] ss = { "  월매  ", "  춘향  ", "  향단  "};
		sg.set(ss);
		sg.print();
		String[] objs = sg.get();
		for (Object o : objs) {
			String s = (String) o;
			System.out.println("[" + s.trim() + "]");
		}
		
		Generic6<Integer> ig = new Generic6<Integer>();
		Integer[] ii = { 1, 2, 3 };
		ig.set(ii);
		Integer[] iig = ig.get();
		ig.print();
		for (Object o : iig) {
			Integer s = (Integer) o;
			System.out.println(s);
		}
	}

}
