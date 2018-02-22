import java.util.Scanner;

public class Main2_2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[500001];
		int n,k,i;
		int j;
		int m;
		a[0]=a[1]=0;
	    for(i=1;i<=500000/2;i++){
		  for(j=i*2;j<=50000;j+=i){
		       a[j]+=i;
		  }
	    }
	    n = sc.nextInt();
	    while(n>0){
	    	m = sc.nextInt();
	    	System.out.println(a[m]);
	    	n--;
	    }
	}
}
