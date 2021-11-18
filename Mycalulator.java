package week1.day2;

import java.io.IOException;

public class Mycalulator {
  
	public  Mycalulator() {
	}
	public int add(int num1, int num2, int num3) {
				return num1+num2+num3;
				}
			public int sub(int num1, int num2) {
				return num1-num2;	
			}
			public int mul(int num1,int num2) {
				return num1*num2;
			}
			public int div(int num1,int num2) {
				return num1/num2;
			}
			public static void main(String[] args)
			
			throws IOException 
			  {
				Mycalulator a= new Mycalulator();
				
				System.out.println(a.add(6,7,9));
				
				System.out.println(a.sub(6, 7));
				
				System.out.println(a.mul(6, 7));
				
				System.out.println(a.div(6,7));
			}
	}

