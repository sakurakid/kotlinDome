import java.util.Scanner;
public class Main1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum ,i,j;
		while(sc.hasNext()){
			n = sc.nextInt();
			if(n==0){
				break;
			}
			sum = 0;
			for(i = 0;i < n;i++){
				j = sc.nextInt();
				sum = sum+j;
			}
			System.out.println(sum);
		}
	}
}
