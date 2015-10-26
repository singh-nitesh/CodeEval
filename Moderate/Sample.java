import java.util.List;
import java.util.ArrayList;

public class Sample {
	private String a;
	private int n;
	public Sample(String a, int n) {
		this.a = a;
		this.n = n;
	}
	public List<String> getVariations() {
		int l = a.length();
		int permutations = (int) Math.pow(l, n);
		char[][] table = new char[permutations][n];
		for (int x = n-1; x >= 0; x--) {
			int t2 = (int) Math.pow(l, x);
			for (int p1 = 0; p1 < permutations;) {
				for (int al = 0; al < l; al++) {
					for (int p2 = 0; p2 < t2; p2++) {
						table[p1][x] = a.charAt(al);
						p1++;
					}
				}
			}
		}


		List<String> result = new ArrayList<String>();
		for (char[] permutation : table) {
			result.add(new String(permutation));
		}
		return result;
	}
	public static void main(String[] args) {

		Sample gen = new Sample("abc", 3);
		List<String> v = gen.getVariations();
		for (String s : v) {
			System.out.println(s);
		}
	}
}