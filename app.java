
public class app {
	public static void main(String[] args) {
		for(double $i = 1000000000000d; $i < 1000000001000d; $i++)
		{
			for(double $j = 2; $j < $i+1; $j++)
			{
				if($i % $j != 0) continue;
				if($j < $i) break;
				System.out.println($i);
			}			
		}
	}
}
