import java.util.Scanner;

public class Main1_3 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int a,b;
		 while(input.hasNextInt()){
		    a = input.nextInt();
		    b = input.nextInt();
		    if(a==0&&b==0){
		    	break;
		    }
		    System.out.println(a+b);
		 }

	}

}
