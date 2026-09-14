package DemoFramework.DemoFramework.ProblemSolving;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Demo {

//	public static void main(String[] args) {
//		
//	}

	@Test
	public static void WAP_to_print_the_numbers_from_1_to_10_using_for_loop()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	
//	1.	WAP to print “Hello World” by MWC. 
	public static void helloWorld() {
		System.out.println("Hello World");
	}

//	2.	WAP to print number from 1 to 10 using for loop by MWC. 
	public static void printNumberfrom1To10UsingForLoop() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

//	3.	WAP to print number from 10 to 1 using for loop by MWC. 
	public static void printNumberFrom10To1UsingForLoop() {
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

//	4.	WAP to check no is Even or not by MWC. 
	public static void checkNoIsEvenOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check number is Even or not:-");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + " is Even number");
		} else {
			System.out.println(a + " is not Even number");
		}
		sc.close();
	}

//	5.	WAP to check no is Odd or not by MWC. 
	public static void checkNoIsOddOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check number is odd or not:-");
		int a = sc.nextInt();
		if (a % 2 != 0) {
			System.out.println(a + " is Odd number");
		} else {
			System.out.println(a + " is not Odd number");
		}
		sc.close();
	}

//	6.	WAP to print all Even no from 1 to 10 by MWC. 
	public static void printAllEvenNoFrom1To10() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

//	7.	WAP to print all Odd no from 1 to 10 by MWC. 
	public static void printAllOddNoFrom1To10() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

//	8.	WAP to print number from 1 to 10 using while loop by MWC. 
	public static void printNumberFrom31To10UsingWhileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}

//	9.	WAP to print number from 10 to 1 using while loop by MWC. 
	public static void printNumberFrom10To1UsingWhileLoop() {
		int i = 10;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
	}

//	10.	WAP to find FACTORIAL of given no 5 by MWC. 
	public static void findFactorialOfNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number and check factorial");
		int no = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
			System.out.print(fact + " ");
		}
		System.out.println(fact);
		sc.close();
	}

//	11.	WAP to SUM no from 1 to 10 by MWC. 
	public static void sumNoFrom1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("Total Sum of 1 to 10 is: " + sum);
	}

//	12.	WAP to SUM all EVEN no from 1 to 10 by MWC. 
	public static void sumAllEvenNoFrom1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Total sum of all even number from 1 to 10 is: " + sum);
	}

//	13.	WAP to SUM all ODD no from 1 to 10 by MWC. 
	public static void sumAllOddNoFrom1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("Total sum of all Odd number from 1 to 10 is: " + sum);
	}

//	14.	WAP to COUNT Even no from 20 to 30 by MWC. 
	public static void countEevnNoFrom20To30() {
		int count = 0;
		for (int i = 20; i <= 30; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println("Total count of even number between 20 to 30 is: " + count);
	}

//	15.	WAP to COUNT Odd no from 10 to 30 by MWC. 
	public static void countOddNoFrom10To30() {
		int count = 0;
		for (int i = 10; i <= 30; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		System.out.println("Total count of Odd number between 10 to 30 is: " + count);
	}

//	16.	WAP to SWAP two no using third variable by MWC. 
	public static void swapTowNoUsingThirdVariable() {
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before Swap a = " + a + " and b = " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap a = " + a + " and b = " + b);
	}

//	17.	WAP to SWAP two no without using third variable by MWC. 
	public static void swapTwoNoWithoutUsingThirdVariable() {
		int a = 30;
		int b = 40;
		System.out.println("Before Swap a = " + a + " and b = " + b);
		b = a + b;
		a = b - a;
		b = b - a;
		System.out.println("After Swap a = " + a + " and b = " + b);
	}

//	18.	WAP to print EVEN no without using if condition by MWC. 
	public static void printEvenNoWithoutUsingifCondition() {
		for (int i = 2; i <= 10; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

//	19.	WAP to print ODD no without using if condition by MWC. 
	public static void printOddNoWithoutUsingIfCondition() {
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

//	20.	WAP to print FIBONACCI SERIES for first 10 numbers by MWC. 
	public static void printFibonacciSeriesForFirst10Number() {
		int fib1 = 0;
		int fib2 = 1;
		System.out.print(fib1 + " " + fib2 + " ");

		for (int i = 1; i <= 10; i++) {
			int fib3 = fib1 + fib2;
			System.out.print(fib3 + " ");
			fib1 = fib2;
			fib2 = fib3;
		}
	}

//	21.	WAP for SUM of DIGITS in a given no by MWC. 
	public static void sumOfDigitsInGivenNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number digits:- ");
		int no = sc.nextInt();
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			no = no / 10;
			sum = sum + rem;
		}
		System.out.println("Sum of the give digits are: " + sum);
		sc.close();

	}

//	22.	WAP for SUM of EVEN DIGITS in a given no by MWC. 
	public static void sumOfEvenDigitsInGivenNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number digits:- ");
		int no = sc.nextInt();
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 == 0) {
				sum = sum + rem;
			}
			no = no / 10;
		}
		System.out.println("Sum of all even number in given digits are: " + sum);
		sc.close();

	}

//	23.	WAP for SUM of ODD DIGITS in a given no by MWC. 
	public static void sumOfOddDigitsInGivenNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number digits:- ");
		int no = sc.nextInt();
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 != 0) {
				sum = sum + rem;
			}
			no = no / 10;
		}
		System.out.println("Sum of all odd numver in given digits are: " + sum);
		sc.close();
	}

//	24.	WAP for COUNT of EVEN DIGITS in a given no by MWC. 
	public static void countOfEvenDigitsInGivenNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number digits:- ");
		int no = sc.nextInt();
		int count = 0;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 == 0) {
				count++;
			}
			no = no / 10;
		}
		System.out.println("Count of event number in given digits are: " + count);
		sc.close();
	}

//	25.	WAP for COUNT of ODD DIGITS in a given no by MWC. 
	public static void countOfOddDigitsInGivenNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number digits:- ");
		int no = sc.nextInt();
		int count = 0;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 != 0) {
				count++;
			}
			no = no / 10;
		}
		System.out.println("Count of odd number in given digits are: " + count);
		sc.close();
	}

//	26.	WAP to check the no 12321 is PALINDROME or not by MWC.
	public static void checkGivenTheNoIsPalindromeOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check palindrome");
		int no = sc.nextInt();
		int temp = no;
		int rev = 0;
		while (temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {
			System.out.println("The given number is palindrome");
		} else {
			System.out.println("The given number is not palindrome");
		}
		sc.close();
	}

//	27.	WAP to check the no 28 is PERFECT or not by MWC. 
//	Perfect No:- A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding the number itself.
//	Ex:-6, 28
	public static void checkTheNumberIsPerfectOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check is it perfect number?:-");
		int no = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= no / 2; i++) {
			if (no % i == 0) {
				sum = sum + i;
			}
		}
		if (no == sum) {
			System.out.println("Given number is a perfect number:");
		} else {
			System.out.println("Given number is not perfect number:");
		}
		sc.close();
	}

//	28.	WAP to check the no 153 is ARMSTRONG or not by MWC. 
//  Armstrong no:- An Armstrong number is equal to the sum of its digits, where each digit is raised to the power of the total number of digits.
//	Ex:-153, 1634
	public static void checkTheGivenNumberIsArmstrongOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check is it Armstrong number?:-");
		int no = sc.nextInt();
		int temp = no;
		int count = 0;
		int sum = 0;
		while (temp != 0) {
			count++;
			temp = temp / 10;
		}
		temp = no;
		while (temp != 0) {
			int rem = temp % 10;
			int total = 1;
			for (int i = 1; i <= count; i++) {
				total = total * rem;
			}
			sum = sum + total;
			temp = temp / 10;
		}
		if (no == sum) {
			System.out.println("Given number is an Armstrong number:");
		} else {
			System.out.println("Given number is not an Armstrong number:");
		}
		sc.close();
	}

//	29.	WAP to check the no 13 is HAPPY NO or not with recursion by MWC. 
//	A Happy Number is a positive integer that eventually becomes 1 when you repeatedly replace the number with the sum of the squares of its digits.
	public static void checkTheGivenNumberIsHappyNumberOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check is it Happy number:-");
		int no = sc.nextInt();
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		happyNumber(no, set);
		sc.close();
	}

	public static void happyNumber(int no, LinkedHashSet<Integer> set) {
		if (no == 1) {
			System.out.println("Given number is Happy Number");
			return;
		}
		if (set.contains(no)) {
			System.out.println("Given number is Not Happy Number");
			return;
		}
		set.add(no);
		int sum = 0;

		while (no != 0) {
			int digit = no % 10;
			sum += digit * digit;
			no /= 10;
		}
		happyNumber(sum, set);
	}

//	WAP to check the no 13 is HAPPY NO or not with recursion by MWC. 
//	A Happy Number is a positive integer that eventually becomes 1 when you repeatedly replace the number with the sum of the squares of its digits.
	public static void checkTheGivenNumberIsHappyNumberOrNotWithoutRecursion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check is it Happy number:-");
		int no = sc.nextInt();
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		while (no != 1 && !set.contains(no)) {
			set.add(no);
			int sum = 0;
			while (no > 0) {
				int digit = no % 10;
				sum = sum + (digit * digit);
				no = no / 10;
			}
			no = sum;
		}
		if (no == 1)
			System.out.println("Given number is Happy Number");
		else
			System.out.println("Given number is not Happy Number");
		sc.close();
	}

//	30.	WAP to check the no 25 is AUTOMORPHIC NO or not by MWC. 
//	Square the No and check last digits are equal to No 
	public static void checkTheGivenNumberIsAutomorphicNumberOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to chcek is it Automorphic or not:-");
		int no = sc.nextInt();
		int sq = no * no;
		int temp = no;
		int digits = 0;
		while (temp > 0) {
			digits++;
			temp = temp / 10;
		}
		int divisor = (int) Math.pow(10, digits);
		if (sq % divisor == no) {
			System.out.println("Given number is automorphic number:");
		} else {
			System.out.println("Given number is not automorphic number:");
		}
		sc.close();
	}

//	31.	WAP to fetch the element from ARRAY by MWC. 
	public static void fetchTheElementFromArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:-");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " element");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Element present in Array are:");
		for (int j = 0; j < size; j++) {
			System.out.print(arr[j] + " ");
		}
		sc.close();
	}

//	32.	WAP to print ARRAY element in reverse order by MWC. 
	public static void printArrayElementInReverseOrder() {
		int arr[] = { 23, 34, 5, 54, 65, 57 };
		System.out.println("Array element in reverse order are:-");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

//	33.	WAP to SUM ARRAY element by MWC. 
	public static void sumArrayElement() {
		int arr[] = { 2, 4, 5, 1, 8 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.println("Sum of array elements are: " + sum);
	}

//	34.	WAP to SUM Even no from ARRAY element by MWC. 
	public static void sumEvenNumberFromArrayElement() {
		int arr[] = { 2, 3, 6, 34, 23, 65, 10 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				sum = sum + arr[i];
			}
		}
		System.out.println();
		System.out.println("Sum of Even no from array elements are: " + sum);
	}

//	35.	WAP to SUM Odd no from ARRAY element by MWC. 
	public static void sumOddNumberFromArrayElement() {
		int arr[] = { 23, 34, 5, 2, 6, 7 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
				sum = sum + arr[i];
			}
		}
		System.out.println();
		System.out.println("Sum of odd no from array elements are: " + sum);
	}

//	36.	WAP to COUNT Even no from ARRAY element by MWC. 
	public static void countEvenNumberFromArrayElement() {
		int arr[] = { 2, 34, 56, 24, 668, 9 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of even no from array elements are: " + count);
	}

//	37.	WAP to COUNT Odd no from ARRAY element by MWC. 
	public static void countOddNumberFromArrayElement() {
		int arr[] = { 2, 34, 63, 75, 71, 123, 9, 24 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of odd no from array elements are: " + count);
	}

//	38.	WAP to REVERSE a given STRING by MWC. 
	public static void reverseGivenString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:-");
		String Str = sc.nextLine();
		String rev = "";
		for (int i = Str.length() - 1; i >= 0; i--) {
			rev = rev + Str.charAt(i);
		}
		System.out.println("Reverse of " + Str + " is " + rev);
		sc.close();
	}

//	39.	WAP to check given String is PALINDROME or Not by MWC.
	public static void checkGivenStringISPalindrom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String and check is it Palindrom:");
		String str = sc.nextLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("Given String is palindrom:");
		} else {
			System.out.println("Given String is not palindrom");
		}
		sc.close();
	}

//	40.	WAP to REVERSE SENTENCE by MWC. 
	public static void reverseGievnSentence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence:-");
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

//	41.	WAP to REVERSE WORD in SENTENCE by MWC. 
	public static void reverseWordInGivenSentence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence:-");
		String str = sc.nextLine();
		String rev = "";
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				rev = rev + arr[i].charAt(j);

			}
			rev = rev + " ";
		}
		System.out.println(rev);
		sc.close();
		sc.close();
	}

	public static void reversSpecificWordInGivenSentence() {
		String str1 = "My name is Shubham Kumar";
		String str2 = "name";
		String rev = "";
		String arr[] = str1.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str2)) {
				for (int j = arr[i].length() - 1; j >= 0; j--) {
					rev = rev + arr[i].charAt(j);
				}
				System.out.print(rev + " ");
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}

//	42.	WAP for BUBBLE SORT by MWC. 
	public static void bubbleSort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Add number value in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array after sorting:");
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

//	43.	WAP to fetch VOWELS in String by MWC. 
	public static void fetchVowelsFromString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string value and will fetch vowels from string:-");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U' || chr == 'a' || chr == 'e'
					|| chr == 'i' || chr == 'o' || chr == 'u') {
				System.out.print(chr + " ");
			}
		}
		sc.close();
	}

//	44.	WAP to count VOWELS in String by MWC. 
	public static void countVowelsInString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String value and will fetch count of vowels from string:-");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U' || chr == 'a' || chr == 'e'
					|| chr == 'i' || chr == 'o' || chr == 'u') {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

//	45.	WAP to REMOVE DUPLICATE NO in ARRAY by MWC. 
	public static void removeDuplicateNumberInArray() {
		int arr[] = { 10, 20, 40, 35, 10, 58, 40, 84, 94 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int num : arr) {
			set.add(num);
		}
		for (int num : set) {
			System.out.print(num + " ");
		}
	}

//	46.	WAP to REMOVE DUPLICATE CHARACTER in ARRAY by MWC. 
	public static void removeDuplicateCharacterInArray() {
		char arr[] = { 'a', 'a', 'f', 'e', 'y', 't', 'e', 't', 'd' };
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (char ch : arr) {
			set.add(ch);
		}
		for (char ch : set) {
			System.out.print(ch + " ");
		}
	}

//	47.	WAP to REMOVE DUPLICATE STRING in ARRAY by MWC. 
	public static void removeDuplicateStringInArray() {
		String arr[] = { "Hi", "Hello", "Bye", "call", "Hi", "Tata" };
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (String str : arr) {
			set.add(str);
		}
		for (String str : set) {
			System.out.print(str + " ");
		}
	}

//	48.	WAP to REMOVE UNIQUE NO in ARRAY by MWC. 
	public static void removeUniqueNumberInArray() {
		int arr[] = { 2, 3, 5, 6, 2, 7, 5, 6 };
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				int x = map.get(arr[i]);
				x++;
				map.put(arr[i], x);
			}
		}
		System.out.println(map);
		for (java.util.Map.Entry<Integer, Integer> a1 : map.entrySet()) {
			if (a1.getValue() > 1) {
				System.out.println(a1.getKey() + " ");
			}
		}
	}

//	49.	WAP to REMOVE UNIQUE CHARACTER in ARRAY by MWC. 
	public static void removeUniqueCharacterInArray() {
		char arr[] = { 'a', 'd', 's', 'f', 'a', 's', 'h', 'r', 'd' };
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				int x = map.get(arr[i]);
				x++;
				map.put(arr[i], x);
			}
		}
		System.out.println(map);
		for (java.util.Map.Entry<Character, Integer> a1 : map.entrySet()) {
			if (a1.getValue() > 1) {
				System.out.println(a1.getKey() + " ");
			}
		}
	}

//	50.	WAP to REMOVE UNIQUE STRING in ARRAY by MWC. 
	public static void removeUniqueStringInArray() {
		String arr[] = { "Hi", "Hello", "Bye", "Hi", "Bye" };
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				int x = map.get(arr[i]);
				x++;
				map.put(arr[i], x);
			}
		}
		System.out.println(map);
		for (java.util.Map.Entry<String, Integer> a1 : map.entrySet()) {
			if (a1.getValue() > 1) {
				System.out.println(a1.getKey() + " ");
			}
		}
	}

//	51.	WAP to fetch largest number in array by MWC. 
//	52.	WAP to fetch smallest number in array by MWC. 
//	53.	WAP to fetch 1st, 2nd, 3rd largest number in array by MWC. 
//	54.	WAP to check given no is PRIME No or not by MWC. 
//	55.	WAP to find the RANGE of PRIME NO from 1 to 100 by MWC. 
//	56.	WAP to check the no 145 is STRONG or not by MWC. 
//	57.	WAP to Separate UC, LC, NUMBER, SPECIAL CHARACTER in String by MWC. 
//	58.	WAP for STAR PATTERNS by MWC. 
//	59.	WAP for NUMBER PATTERNS by MWC. 
//	60.	WAP for NUMBER PATTERNS by MWC. 
//	61.	WAP to add Integer literal with character literal by MWC. 
//	62.	WAP to print UPPER CASE Alphabets by MWC. 
//	63.	WAP to print LOWER CASE Alphabets by MWC. 
//	64.	WAP to fetch ORDER OF OCCURRENCE of each no in Array by MWC. 
//	65.	WAP to fetch ORDER OF OCCURRENCE of each Character in Array by MWC. 
//	66.	WAP to fetch ORDER OF OCCURRENCE of each String in Array by MWC. 
//	67.	WAP to fetch DUPLICATE NO in ARRAY by MWC. 
//	68.	WAP to fetch DUPLICATE CHARACTER in ARRAY by MWC. 
//	69.	WAP to fetch DUPLICATE STRING in ARRAY by MWC. 
//	70.	WAP to fetch UNIQUE NO in ARRAY by MWC. 
//	71.	WAP to fetch UNIQUE CHARACTER in ARRAY by MWC. 
//	72.	WAP to fetch UNIQUE STRING in ARRAY by MWC. 
//	73.	WAP to SWAP String values without using third variable by MWC. 
//	74.	WAP to convert String integer to Integer data type by MWC. 
//	75.	WAP for Linear Search for No by MWC. 
//	76.	WAP for Linear Search for Character by MWC. 
//	77.	WAP for Linear Search for String by MWC. 
//	78.	WAP to Merge two Arrays into single Array by MWC. 
//	79.	WAP to SUM of PRIME No from range 1 to 100 by MWC. 
//	80.	WAP to COUNT of PRIME No from range 1 to 100 by MWC. 
//	81.	WAP for Printing no 1 to 10 using Recursion by MWC. 
//	82.	WAP for Printing no 10 to 1 using Recursion by MWC. 
//	83.	WAP for Printing EVEN no 1 to 10 using Recursion by MWC. 
//	84.	WAP for Printing ODD no 1 to 10 using Recursion by MWC. 
//	85.	WAP for FACTORIAL using Recursion by MWC. 
//	86.	WAP for ROTATION of Array by MWC. 
//	87.	WAP to add from ARRAY to ARRAYLIST by MWC. 
//	88.	WAP to add from ARRAYLIST to ARRAY by MWC. 
//	89.	WAP to find missing no in Array by MWC. 
//	90.	WAP to print Lower Case alphabet to Upper Case alphabet by MWC. 
//	91.	WAP to print Lower Case alphabet to Lower Case alphabet by MWC. 
//	92.	WAP for TOGGLE String by MWC. 
//	93.	WAP to Sort Array using inbuilt function by MWC. 
//	94.	WAP for STRING ANAGRAM by MWC. 
//	95.	WAP to convert String into Character Array by MWC. 
//	96.	WAP to convert Character Array into String by MWC. 
//	97.	WAP to find String length without using length() by MWC. 
//	98.	WAP to SUM the FIRST DIGIT and LAST DIGIT by MWC. 
//	99.	WAP to fetch words starting with vowels in String Array by MWC. 
//	100.WAP to convert ArrayList to TreeSet by MWC. 

//	101.WAP to check day using Switch case by MWC.
	public static void checkDayUsingSwitchCase() {
		String day = "Friday";
		switch (day) {
		case "Monday": {
			System.out.println("Today is Monday");
			break;
		}
		case "Tuesday": {
			System.out.println("Today is Tuesday");
			break;
		}
		case "Wednesday": {
			System.out.println("Today is Wednesday");
			break;
		}
		case "Thrusday": {
			System.out.println("Today is Thrusday");
			break;
		}
		case "Friday": {
			System.out.println("Today is Friday");
			break;
		}
		case "Satarday": {
			System.out.println("Today is Satarday");
			break;
		}
		case "Sunday": {
			System.out.println("Today is Sunday");
			break;
		}
		default: {
			System.out.println("Invalid day");
			break;
		}
		}
	}

}
