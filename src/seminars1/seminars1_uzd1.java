package seminars1;

import java.util.Arrays;
import java.util.Random;

public class seminars1_uzd1 {
	
	private static final double GRAVITY = -9.81; //mainigos 99% taisa kā private, lai tos nenomainitu final-tas pats kas konstante, AR LEILIEM BURTIEM, JA NEMAINA
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0/uzdevumam
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
				"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
				"Kate" };
		
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
				299, 343, 317, 265 };
		
		int nameSize = names.length; 
		int timeSize = times.length;

		if(nameSize == timeSize) {

			for(int  i=0; i<nameSize; i++) {

			System.out.println("[" + names[i] + ", <" + times[i] + ">]:");

		}
		}
		//nakama 1.uzd izprintesana
		try {
		System.out.println(positionCalc(10,0,100));
		}
		catch (Exception ex) {
			System.out.println(ex); 
		}
		System.out.println("Programma strada");
		
		//3.uzd izprintesa
		
		try {
			System.out.println(Arrays.toString(generateArray (10, 3.5, 6.5)));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//uzdevums1
	public static double positionCalc(double initialVelocity, double
		
			
			initialPosition, double fallingTime) throws Exception {
		
		if(initialVelocity >=0 && initialVelocity < 299792458 
			&& initialPosition >=0 && initialPosition < 20000
			&& fallingTime >= 0 && fallingTime < 80000) {
			//x(t) = 0.5 × a*t^2 + v_0*t + x_0

			return 0.5* GRAVITY * Math.pow(fallingTime, 2) //cipars norada pakapi
					+ initialVelocity * fallingTime + initialPosition;
					
		}
		else {
			throw new Exception("incorrect imput parameters"); //izņēmums, obligati janorada ari augstak
		}
		
	}
	
	//public static int factorialForLoop(int N)	{
		//TODO
		//1.pārbaudīt ienākošo parametru
		//1.1.1. 
	//}

	public static double [] generateArray(int N, double lower, double upper) 
			throws Exception{
		if(N<=0 || (upper < lower)) throw new Exception ("wrong input parameters");
		
		double [] result = new double[N];
		Random rand = new Random(); 
		for (int i =0; i<result.length; i++) {
			result[i] = rand.nextDouble(lower,upper);
			
		}
		return result;
		
	}

}
