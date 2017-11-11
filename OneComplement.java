import java.util.ArrayList;
import java.util.Scanner;

public class OneComplement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int s = scan.nextInt();
		String str = Integer.toBinaryString(s);

		int num = 0;
		String zero = "";
		if (str.length() < 16) {
			num = 16 - str.length();
			for (int i = 0; i < num; i++) {
				zero += "0";
			}
			str = zero + str + "";
		}

		ArrayList<Integer> compi = new ArrayList();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				compi.add(1);
			} else {
				compi.add(0);
			}
		}

		String[] ss = new String[4];

		int cnt = 1;
		int index = 0;
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String s4 = "";

		for (int i = 0; i < compi.size(); i++) {
			if (i < 4) {
				s1 += compi.get(i) + "";
			} else if (i >= 4 && i < 8) {
				s2 += compi.get(i) + "";
			} else if (i >= 8 && i < 12) {
				s3 += compi.get(i) + "";
			} else {
				s4 += compi.get(i) + "";
			}
		}

		ss[0] = s1;
		ss[1] = s2;
		ss[2] = s3;
		ss[3] = s4;

		int c = 1;
		int sum = 0;

		ArrayList<Integer> ar = new ArrayList<>();

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (ss[i].charAt(j) == '1') {
					if (c == 1) {
						sum += 8;
					} else if (c == 2) {
						sum += 4;
					} else if (c == 3) {
						sum += 2;
					} else if (c == 4) {
						sum += 1;
					}
				} else {
					sum = sum;
				}
				c++;
			}
			ar.add(sum);
			c = 1;
			sum = 0;
		}
		
		for(int i = 0; i < ar.size(); i++){
			if(ar.get(i) >=0 && ar.get(i) <= 9){
				System.out.print(ar.get(i));
			} else if (ar.get(i) == 10){
				System.out.print("A");
			} else if (ar.get(i) == 11){
				System.out.print("B");
			} else if (ar.get(i) == 12){
				System.out.print("C");
			} else if (ar.get(i) == 13){
				System.out.print("D");
			} else if (ar.get(i) == 14){
				System.out.print("E");
			} else if (ar.get(i) == 15){
				System.out.print("F");
			}
		}
		System.out.println();

	}

}
