import java.util.Arrays;
import java.util.Scanner;
public class Main1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a,b,c;
		String s;
		while(sc.hasNext()){
			s = sc.nextLine();
			char[]w= s.toCharArray();
			Arrays.sort(w);
			System.out.println(w[0]+" "+w[1]+" "+w[2]); 
		}

	}

}
