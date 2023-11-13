package marksheet;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Student 1
		System.out.println("ENTER THE STUDENT NO");
		int studentNo1 = in.nextInt();
		System.out.println("ENTER THE STUDENT NAME");
		String studentName = in.next();
		System.out.println("ENTER MARKS FOR SUBJECT 1");
		int stud1Sub1 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 2");
		int stud1Sub2 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 3");
		int stud1Sub3 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 4");
		int stud1Sub4 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 5");
		int stud1Sub5 = in.nextInt();
		int total1 = stud1Sub1 + stud1Sub2 + stud1Sub3 + stud1Sub4 + stud1Sub5;
		double average = total1 / 5;

		// Student 2
		System.out.println("ENTER THE STUDENT NO");
		int studentNo2 = in.nextInt();
		System.out.println("ENTER THE STUDENT NAME");
		String studentName2 = in.next();
		System.out.println("ENTER MARKS FOR SUBJECT 1");
		int stud2Sub1 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 2");
		int stud2Sub2 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 3");
		int stud2Sub3 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 4");
		int stud2Sub4 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 5");
		int stud2Sub5 = in.nextInt();
		int total2 = stud2Sub1 + stud2Sub2 + stud2Sub3 + stud2Sub4 + stud2Sub5;
		double average2 = total2 / 5;

		// Student 3
		System.out.println("ENTER THE STUDENT NO");
		int studentNo3 = in.nextInt();
		System.out.println("ENTER THE STUDENT NAME");
		String studentName3 = in.next();
		System.out.println("ENTER MARKS FOR SUBJECT 1");
		int stud3Sub1 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 2");
		int stud3Sub2 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 3");
		int stud3Sub3 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 4");
		int stud3Sub4 = in.nextInt();
		System.out.println("ENTER MARKS FOR SUBJECT 5");
		int stud3Sub5 = in.nextInt();
		int total3 = stud1Sub1 + stud1Sub2 + stud1Sub3 + stud1Sub4 + stud1Sub5;
		double average3 = total3 / 5;
		in.close();

		//Calculation of average of each subject
		double sub1average = (stud1Sub1 + stud2Sub1 + stud3Sub1)/3;
		double sub2average = (stud1Sub2 + stud2Sub2 + stud3Sub2)/3;
		double sub3average = (stud1Sub3 + stud2Sub3 + stud3Sub3)/3;
		double sub4average = (stud1Sub4 + stud2Sub4 + stud3Sub4)/3;
		double sub5average = (stud1Sub5 + stud2Sub5 + stud3Sub5)/3;

		System.out.println("");
		System.out.println("Welcome to Student Mark List Application");
		System.out
				.println("__________________________________________________________________________________________");
		System.out.println("SNo  Student Name\t\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
		System.out
				.println("__________________________________________________________________________________________");
		System.out.println(studentNo1 + "    " + studentName + "\t\t\t" + stud1Sub1 + "\t" + stud1Sub2 + "\t" + stud1Sub3 + "\t" + stud1Sub4 + "\t"
				+ stud1Sub5 + "\t" + total1 + "\t" + average);
		System.out.println(studentNo2 + "    " + studentName2 + "\t\t\t" + stud2Sub1 + "\t" + stud2Sub2 + "\t" + stud1Sub3 + "\t" + stud2Sub4 + "\t"
				+ stud2Sub5 + "\t" + total2 + "\t" + average2);
		System.out.println(studentNo3 + "    " + studentName3 + "\t\t\t" + stud3Sub1 + "\t" + stud3Sub2 + "\t" + stud3Sub3 + "\t" + stud3Sub4 + "\t"
				+ stud3Sub5 + "\t" + total3 + "\t" + average3);
		System.out
				.println("__________________________________________________________________________________________");
		System.out.println("\t\tAverage" + "\t\t" + (int) sub1average + "\t" + (int) sub2average + "\t"
				+ (int) sub3average + "\t" + (int) sub4average + "\t" + (int) sub5average + "\t");

	}

}
