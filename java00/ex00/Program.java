public class Program {
	public static void main(String[] args) {
		int nbr = 479598;
		int mlt = 10;
		int sum = 0;
		for (int i = 0; i < 6; i++)
		{
			int m = 0;
			m += nbr % mlt;
			if (m > 10)
				m /= mlt / 10;
			sum += m;
			mlt *= 10;
		}
        System.out.println(sum);
    }
}