
// Question 1

/*
import java.util.*;
public class BasicProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = s;
		boolean palin  = true;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s1.charAt((s.length()-1)-i)) {
				System.out.println("String is not Palindrome");
				palin = false;
				break;
			}
		}
		
		if (palin) {
			System.out.println("String is Palindrome");	
		}
		
	}
}
*/


// Question 2

/*
import java.util.*;
public class BasicProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int p = n;
		int rev = 0;
		while(n>0) {
			int rem = n % 10;
			rev = rem + rev*10;
			n = n/10;
		}
		
		System.out.println("Reversed number is: "+rev);
		
	}
}
*/

// Question 3

/*
 import java.util.*;
public class BasicProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		
		if (n == 0 ) {
			System.out.println("Entered number is 0");
		}
		
		if (n == 1) {
			System.out.println("Prime Number");
		}
		
		for (int i = 2; i <= n/2; i++) {
			if (n%i == 0) {
				flag = false;
				System.out.println("Not a prime number");
				break;
			}
		}
		
		if (flag) {
			System.out.println("Prime Number");		
		}
	
		
	}
}
 */ 


/*
// Question 4

import java.util.*;

public class BasicProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want in fibonnachi series: ");
		int n = sc.nextInt();
		
		int a = 0;
		int b =1;
		
		System.out.print(a+" "+b+" ");
	
		for (int i = 0; i < n-2; i++) {
			int c;
			c = a+b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
		
	}
} 
 */


// Parameterized, non-paramerterized and default 

import java.util.*;

public class BasicProgram1 {

	int age;
	String name;
	int salary;
	
	// no-arg parameter
	BasicProgram1(){
		this.age = 21;
		this.name = "Yash Singhal";
		this.salary = 525000;
	}
	
	// arg constructor
	BasicProgram1(int age, String name, int salary){
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		BasicProgram1 obj = new BasicProgram1(32,"Yash",55000);
		
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		
	}
} 
