package week1_1;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
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

class Fraction
{
	int Numerator,Denominator;
	
	Fraction()
	{
		Numerator = 1;
		Denominator = 1;
	}
	
	Fraction(int a, int b)
	{
		Numerator = a;
		Denominator = b;
	}
	
	double toDouble()
	{
		return ((double)(Numerator/Denominator));
	}
	
	Fraction plus(Fraction r)
	{
		Fraction Result = new Fraction();
		Result.Numerator = this.Numerator * r.Denominator + this.Denominator * r.Numerator;
		Result.Denominator = this.Denominator * r.Denominator;
		return Result.Simplify( Result );	
	}
	
	Fraction multiply(Fraction r)
	{
		Fraction Result = new Fraction();
		Result.Numerator = this.Numerator * r.Numerator;
		Result.Denominator  = this.Denominator * r.Denominator;
		return Result.Simplify(Result);
	}
	
	void print()
	{
		Simplify(this);
		if(this.Numerator == 1 && this.Denominator == 1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(this.Numerator + "/" + this.Denominator);
		}
	}
	
	Fraction Simplify(Fraction r)
	{
		int Gcd;
		Gcd = gcd(this.Numerator, this.Denominator);
		r.Numerator /= Gcd;
		r.Denominator /= Gcd;
		return r;
	}
	
	int gcd(int a, int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
}
