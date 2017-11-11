import java.util.ArrayList;
import java.util.Scanner;

public class The7Dwarfs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 100;
		
		ArrayList<Integer> list = new ArrayList<>();
		int sm=0;
		for(int i = 0; i < 9; i++){
			list.add(scan.nextInt());
			sm += list.get(i);
		}
		
		int s = Math.abs(sm-sum);
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(list.get(i)+list.get(j) == s){
					num1 = i;
					num2 = j;
				}
			}
		}
		
		list.remove(num1);
		list.remove(num2);
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		
		
	}

}
