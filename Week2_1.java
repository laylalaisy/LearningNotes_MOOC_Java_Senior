public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}

class Clock
{
	private Display Hour;
	private Display Minute;
	private Display Second;
	
	public Clock(int hour, int minute, int second)
	{
		Hour = new Display(hour, 24);
		Minute = new Display(minute, 60);
		Second = new Display(second, 60);
	}
	
	public void tick()
	{
		Second.increase();
		if(Second.getValue() == 0)
		{
			Minute.increase();
			if(Minute.getValue() == 0)
			{
				Hour.increase();
			}
		}
	}
	
	public String toString()
	{
		String Output = String.format("%02d:%02d:%02d", Hour.getValue(), Minute.getValue(), Second.getValue());
		return Output;
	}
	
}


class Display
{
	private int value = 0;
	private int limit = 0;
	
	Display(int v, int l)
	{
		value = v;
		limit = l;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void increase()
	{
		value++;
		if(value == limit)
		{
			value = 0;
		}
	}
}