import java.util.Scanner;

public class Main1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,sum,n,i;
		n = sc.nextInt();
		while(n>0){
			a = sc.nextInt();
			if(a==0){
				break;
			}
			sum=0;
			for(i=0;i < a;i++){
				b = sc.nextInt();
				sum = sum+b;
			}
			System.out.println(sum);
			if(n!=1){
				System.out.println();
			}
			n--;
		}
	}

}
