package javabasics;

public class Datatypes{
		public static void main(String args[])
		{
			String s1=new String("welcome");
			String s2=new String("wel");
			String s3=new String("welcome");
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			System.out.println("******************");
			String t1="welcome";
			String t2="wel";
			String t3="welcome";
			System.out.println(t1.equals(t2));
			System.out.println(t1.equals(t3));
			System.out.println(t1==t2);
			System.out.println(t1==t3);
			String s4=new String("abc");
			s4.concat("def");
			System.out.println(s4);
			
			}

	}