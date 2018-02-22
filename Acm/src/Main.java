import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int a,b;
		 while(input.hasNextInt()){
		    a = input.nextInt();
		    b = input.nextInt();
		    System.out.println(a+b);
		 }
	}
}
