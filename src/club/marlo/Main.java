package club.marlo;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("This is a test.");
		loopTest();
	}
	
	public static String[] grabTest()
	{
		String examText = "The most precious treasures we have in life are the images we store in the memory banks of our brains. The sum of these stored experiences is responsible for our sense of personal identity and our sense of connectedness to those around us.";
		//String examText = "This is a test lol";
		String[] splitTest = examText.split(" ");
		return splitTest;
	}
	
	public static void loopTest()
	{
		int correct = 0;
		int length = grabTest().length;
		String[] text = grabTest();
		
		for(int c = 0; c <= length; c++)
		{
			if(checkLoop(c, length))
			{
				System.out.println(correct + ":" + length);
			} else {
				printThree(text, c);
				String i = scan.next();
				if(checkInput(i, text[c]))
				{
					correct++;
				}
			}
		}
		
	}
	
	public static boolean checkLoop(int cur, int loop)
	{
		if(cur == loop)
		{
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkInput(String input, String compare)
	{
		if(input.equals(compare)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public static void printThree(String[] array, int c) 
	{
		try{
			System.out.println(array[c] + " " + array[c+1] + " " + array[c+2]);
		} catch(Exception e) { System.out.println(array[c]); }
	}
}
