package unit1;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class InOut {
	public static void main(String[] args) {
		/*
		1) Every Java statement must end with a ";"
		2) System.out.println() in Java = print() in Python
		3) Comments in Java are denoted by a "//"
		4) System.out.print() prints within the same line, unlike System.out.println()
		5) Code that you want to execute has to be within --- public static void main(String[] args) {}
		6) \n can be used to create a new line within the same System.out.println() statement.
		7) In Java, to create a variable, you need to state the variable and the data type.
		8) Primitive Data Types are not classes - byte, float, int, boolean, etc, are all primitive
		9) Variable naming rules: 
		 - Should: start w/ lowercase letters, underscores, use snake_case or camelCase, relevant (balance brevity with detail)
		 - Can't: Special Characters, can't start with a number, no spaces, no keywords
		10) Declaring variable - establishing variable, but not defining the value itself.
		11) "\\" can be used if you want to print a back-slash
		12) Taking in user input:
		  a) import java.util.Scanner
		  b) create a new scanner:
		  Scanner sc = new Scanner(System.in);
		  c) String name = sc.nextLine();
		   - if you want to get different data-types, you can do
		   sc.nextInt(), sc.nextLong(), sc.nextFloat(), sc.nextBoolean(), etc.
		  d) Optional: Print a prompt
		  e) if you ask for an integer and then a string, it will not really work, so better to avoid it all together.
		  
		  % = remainder
		  If you combine two of the same data type, you get that same numeric data type
		  	Ex: System.out.println(1/2) --> 0
		  Truncate: Chop the decimal off
		  If you combine two different numeric data types, you get the more specific of the two
		Math.pow(base, exponent); --> base**exponent --> base^exponent
		
		"Math" is an implicit class in java. implicit = don't need to import it
		*/
		
		/*
		Method 1:
		Math.random() - Gives a random number from [0, 1)
		
		To simulate an n-sided dice, 
		you do the following operation:
		Math.ceil(6*Math.random());	
			Formula: (int) Math.random()*(max-min+1);
		
		Method 2:
		1. import java.util.Random
		2. Create a Random object
		3. new Random().nextInt(min, max); -> [min, max)
		
	1.6 - Decimal Formatting
	Method 1
	- if all you care is rounding to a certain place
	1)  multiply b7 10^x where x is the number of decimal places
	2) int cast
	3) divide by 10^x (as a double)
	double pi = Math.PI;
	System.out.println(pi);
	System.out.println(pi*100);
	System.out.println((int)pi*100);
	System.out.println((int)pi*100/100.0);
	// Method 2 - DecimalFormat Class
	1) import java.text.DecimalFormat;
	2) create a DecimalFormat object
	2a) have to put the specified format
	in the parentheses (as a string)
	-# to indicate where the number should go
	- -will not show a number if there is no decimal value
	- -if you want 0s after the decimal, use them in the format
	-. to indicate where the period goes
	-, to specify how often commas should appear
	-$ will add a $
	3) df.format();
	
	1.7: String and String Methods
	"String" - String of characters
	
	Suppose the following: String str = "Hello World!";
	
	str.charAt - returns the character at index x (returns a char data type)
	str.compareTo(*Insert String*) - Returns the "distance" between the first different letter for the strings
	 - THIS IS CASE-SENSITIVE
	 - Numbers come before uppercase, 
	 - "computer".compareTo("duck") will return -1, because c is -1 from d
	str.contains("*Insert String*") - Returns boolean to see if the string in the parenthesis is inside str.
	str.equals("*Insert String*") - Returns boolean to see if the actual value of the strings equals
	 - This is necessary, because making a string with same value using the String object will result in different strings:
	  ~ Ex: String a = new String("1"); String b = new String("1"); boolean yes = a==b //This returns false
	  
	str.indexOf("*insert string*") //Returns first instance of the first letter of the String.
	str.replace("*insert string*", "*insert string*"); // Replaces all instance of the first string with the second string.
	str.substring(int, int) //Start inclusive, end exclusive; makes a substring.
	*/
		
	}
}