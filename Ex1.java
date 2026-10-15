/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//java預設會載入java.lang套件中的所有類別,因此可以省略
import java.lang.Math;

public class Ex1 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) 
		{
		 for (j=1; j<=i; j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
		}
	}
}