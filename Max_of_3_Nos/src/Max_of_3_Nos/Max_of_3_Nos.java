package Max_of_3_Nos;
import java.util.*;

public class Max_of_3_Nos {

	public static void main(String[] args) {
		int f1,f2=0;
		int f3=1;
		for(int i=1;i<=5;i++)
		{
			System.out.println(" "+f3);
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
		
		/*String str="I am Manisha";
		System.out.println("lenth of string="+str.length()); //String Length...6
		String s="MANISHA";;
		String l=s.toLowerCase();
		System.out.println("LowerCase="+l);*/
		
		/*Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("Enter No");     //even_Odd.......5
		no=sc.nextInt();
		if(no /2==0) {
		System.out.println(no+" is even");
		}
		else
		{
			System.out.println(no +" is odd");
		} */
		
		
	/*	int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("inter year");
		year=sc.nextInt();
		if(year%400==0||year%100!=0 && year%4==0)		//Leap year ...1
		{
			Syst7em.out.println(year+" is leap year");
			
			}
		else
		{
			System.out.println(year +" is not leap year");
		}*/
		
		/*for(int i=1;i<=5;i++)					//random 5 no.......2
		{
			System.out.println((int)(Math.random()*10));
		} */
		
		
		/* double c_interest=0,p_amount=0,rate=0;
		 double year=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter amount");     // compound interest  .....3
		 p_amount=sc.nextDouble();
		 System.out.println("Enter interest rate");
		 rate=sc.nextDouble();
		 System.out.println("Enter years");
		 year=sc.nextDouble();
		 c_interest=p_amount*Math.pow((1+rate/100),year);
		 System.out.println("Compound interest="+c_interest);*/
		
		 
		 /*Scanner sc=new Scanner(System.in);
		 System.out.println("Enter radius"); //area of circle........4
		 r=sc.nextInt();
		 area=Math.PI*r*r;
		 System.out.println("Area="+area);*/
}

}