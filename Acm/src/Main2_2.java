import java.util.Scanner;

public class Main2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n,i,j,k,m,sum;
		n = sc.nextLong();
		while(n>0)
		{
			Long t ;
			sum = (long) 1;
			m = sc.nextLong();
			for(i = (long) 2;i <= Math.sqrt(m);i++){
				if(m%i == 0){
					sum+=i;
					t = m/i;
					if(t!=i){
						sum+=t;
					}
				}
			}
			System.out.println(sum);
			n--;
		}

	}

}
