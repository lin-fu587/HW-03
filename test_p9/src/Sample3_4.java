
public class Sample3_4
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
	}
}

//Car���O
class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}