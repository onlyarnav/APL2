/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
// 		Add a1 = new Add(); //creating object of class Add
// 		int result = a1.sum(60, 7);
		
// 		System.out.println("This is the sum of 60 & 7: " + result);

		System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        Integer val = scanner.nextInt();
        for(int i = 1; i < 11; i++){
            System.out.println(val + " x " + i + " = " + val*i);
        }
	}
}