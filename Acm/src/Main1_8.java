import java.util.Scanner;

public class Main1_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,i;
		long sum,sum1;
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>=b){
				c = a;
				a = b;
				b = c;
			}
			sum = 0;
			sum1 = 0;
			for(i = a;i<=b;i++){
				if(i%2==0){
					sum = sum+i*i;
				}else{
					sum1 = sum1+i*i*i;
				}
			}
			System.out.println(sum+" "+sum1);
		}
	}

}
