import java.util.Scanner;

public class BerlinClock {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String number4_5 = scan.nextLine();
		String[] input4_5 = number4_5.split(" ");
		int n4_5 = 0;
		for (int i = 0; i < 4; i++) {
			if (input4_5[i].equals("1")) {
				n4_5++;
			}
		}

		String number4_1 = scan.nextLine();
		String[] input4_1 = number4_1.split(" ");
		int n4_1 = 0;
		for (int i = 0; i < 4; i++) {
			if (input4_1[i].equals("1")) {
				n4_1++;
			}
		}

		String number11_5 = scan.nextLine();
		String[] input11_5 = number11_5.split(" ");
		int n11_5 = 0;
		for (int i = 0; i < 11; i++) {
			if (input11_5[i].equals("1")) {
				n11_5++;
			}
		}

		String numberl4_1 = scan.nextLine();
		String[] inputl4_1 = numberl4_1.split(" ");
		int nl4_1 = 0;
		for (int i = 0; i < 4; i++) {
			if (inputl4_1[i].equals("1")) {
				nl4_1++;
			}
		}

		int h;
		int m;

		h = (n4_5 * 5) + n4_1;
		m = (n11_5 * 5) + nl4_1;

		System.out.println(h + " " + m + "\n");
	}

}
