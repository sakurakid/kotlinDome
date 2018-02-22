import java.util.Scanner;

public class Main1_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m,i,j,a,b,c,sum;
		while(sc.hasNext()){
			n = sc.nextInt();
			m = sc.nextInt();	
			for(i=n;i<=m;i++){
				a = i%100;
				b = ((i-a)/10)%10;
				c = i/100;
				if(a*a*a+b*b*b+c*c*c==i){
					System.out.print(i+" ");
				}
			}
			System.out.println();
			}

	}

}
