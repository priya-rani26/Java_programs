import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}


	}

}

/*-------OUTPUT------
 
 
 enter number : 
5
* * * * *   
* * * *   
* * *   
* *   
*   
* *   
* * *   
* * * *   
* * * * *   
 
 
 */
