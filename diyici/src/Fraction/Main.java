package Fraction;


	import java.util.Scanner;




	public class Main {




		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);

			Fraction a = new Fraction(in.nextInt(), in.nextInt());

			Fraction b = new Fraction(in.nextInt(),in.nextInt());

			a.print();

			b.print();

			a.plus(b).print();

			a.multiply(b).plus(new Fraction(5,6)).print();

			a.print();

			b.print();

			in.close();

		}




	}
class  Fraction{
	public  static  void  main(String  []  args) {
		int  a;
		int  b;
		Fraction(int a;  int  b){
			a=a;
			b=b;
			
		}
		
			if(a<b) { 
				System.out.println("这个分数是:"a/b);
			}
				else  if(a>b) {
				
					System.out.println("这个分数是:"a/b);
				}
				else
					System.out.println("这个分数是："1);
			}
				
		
	}

