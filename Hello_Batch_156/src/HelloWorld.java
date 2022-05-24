class ReverseTheNumber{
	public int ReverseNum(int n)
	{
		int rev = 0;
		while(n>0) {
			int temp = n%10;
			rev = rev*10 + temp;
			n = n/10;
		}
		return rev;
	}
}
class Fibonacci{
	
	public int Fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return Fib(n-1)+Fib(n-2);
	}
}

public class HelloWorld {
// when we want to call a method without making an object. then static
//String arg is command line argument
//jvm only understands main method
//java always reads the string data
//we need a public to access the method , anyone should be able to access this method
	public static void main(String[] args)
	{
		
//		System.out.print("Hello Word!!");
//		System.out.print("Avani");
		ReverseTheNumber rtn = new ReverseTheNumber();
		System.out.println(rtn.ReverseNum(123456));
		Fibonacci f = new Fibonacci();
//		for(int i = 0;i<5;i++)
//		{
//			System.out.println(f.Fib(i));
//		}
		int i = 0;
		while(f.Fib(i)<=12)
		{
			System.out.println(f.Fib(i));
			i++;
		}
	}
	
//	
}
