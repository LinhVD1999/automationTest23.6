package day5_overloading;

public class TinhTong {
	public int add (int st1, int st2)
	{
		return st1+st2;
	}
	
	public float add(float st1, float st2, float st3)
	{
		return st1+st2+st3;
	}
	public double add(double st1, double st2)
	{
		return st1 + st2;
	}
	public String add(String text1, String text2)
	{
		return text1 + text2;
	}
}
