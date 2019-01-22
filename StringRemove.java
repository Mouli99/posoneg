
public class StringRemove {

	public static void main(String[] args) {
		int odd_C = 0;
		int even_C = 0;
		int[] integers = new int[] { 2, 4, 0, 100, 4, 11, 2602, 36 };
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] % 2 == 0) {
				//System.out.println(integers[i]);
				even_C++;
			} else {
				odd_C++;
			}
		}
		if (odd_C < even_C) {
			for (int i1 = 0; i1 < integers.length; i1++) {
				if (integers[i1] % 2 != 0) {
					System.out.println(integers[i1]);
					break;
				}
			}
		} else {
			for (int i1 = 0; i1 < integers.length; i1++) {
				if (integers[i1] % 2 == 0) {
					System.out.println(integers[i1]);
					break;
				}
			}

		}

	}

}
