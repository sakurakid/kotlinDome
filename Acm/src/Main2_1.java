import java.util.Scanner;

public class Main2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,k,sum = 0;
		while(sc.hasNext()){
			n = sc.nextInt();
			sum = 0;
			for(i = 0;i <= n/3;i++){
				sum+=(n-3*i)/2+1;
				
			}
			System.out.println(sum);
		}
	}
}
