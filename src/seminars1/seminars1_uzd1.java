package seminars1;

import java.util.Arrays;
import java.util.Random;

public class seminars1_uzd1 {
	
	private static final double GRAVITY = -9.81; //mainigos 99% taisa kā private, lai tos nenomainitu final-tas pats kas konstante, AR LEILIEM BURTIEM, JA NEMAINA
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EXCERCISE 0
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
				"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
				"Kate" };
		
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
				299, 343, 317, 265 };
		
		int nameSize = names.length; 
		int timeSize = times.length;

		System.out.println("EXERCISE 0");
		if(nameSize == timeSize) {

			for(int  i=0; i<nameSize; i++) {

				
			System.out.println("[" + names[i] + ", <" + times[i] + ">]:");

		}
		}
		
		//izprintesana EXERCISE 1 (position calculator)
		System.out.println("\nEXERCISE 1");
		try {
		System.out.println(positionCalc(10,10,100));
		}
		catch (Exception ex) {
			System.out.println(ex); 
		}
		
		//izprintesana EXERCISE 2 (factorials)
		System.out.println("\nEXERCISE 2");
		try {
		System.out.println(factorialForLoop(16));
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		

		//izprintesana EXERCISE 3 (arrays)
		System.out.println("\nEXERCISE 3");
		try {
			double[] mas = generateArray(10, 1, 10);
			System.out.println(Arrays.toString(mas));
			System.out.println ("Avg: " + getMean(mas));
			System.out.println ("Min value: " + getMin(mas));
			System.out.println ("Max value: " + getMax(mas));
			System.out.println(Arrays.toString(arraySort(mas)));
			
		} 
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		//izprintesana EXERCISE 4 (matrix)
		System.out.println("\nEXERCISE 4");
		try {
			System.out.println(Arrays.deepToString(generateMatrix(2)));
			System.out.println("product: " + getProduct(generateMatrix(2),1,1)); // nesanaca 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//izprintesana EXERCISE 5 (coinFlip)
		System.out.println("\nEXERCISE 5 - coin flip");
		try {
			
			System.out.println("N=10: " + java.util.Arrays.toString(coinFlip(10)));
			System.out.println("N=100: " + java.util.Arrays.toString(coinFlip(100)));
			System.out.println("N=1000: " + java.util.Arrays.toString(coinFlip(1000)));
			System.out.println("N=10000: " + java.util.Arrays.toString(coinFlip(10000)));
			}
			catch (Exception ex) {
				System.out.println(ex); 
			}
		
		//izprintesana EXERCISE 5 (dice)
		System.out.println("\nEXERCISE 5 - dice");
		try {
			int N = 5;
			System.out.println("Dice: " + Arrays.toString(rollDice(N)));
			System.out.println("Times: "+ roll2Dices());
			
	    }
		
			catch (Exception ex) {
				System.out.println(ex); 
			}
		
		//izprintesana EXERCISE 6 (bytes)
		System.out.println("\nEXERCISE 6");
		byte[] array = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
				32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33}; 
        String text = getTextFromBytes(array);
        System.out.println("Bytes to text: " + text);
        
        
        //izprintesana EXERCISE 7 (pascal triangle)
        System.out.println("\nEXERCISE 7");
        try {
        	int level = 6; // For a level of 6, use 5 because array indexing starts at 0
        	System.out.println(PascalsTriangle(level));
    		}
        
    		catch (Exception ex) {
    			System.out.println(ex); 
    		}
        
}
		
	
	

	//FUNCTIONS start here//
	
	// EXCERSICE 1
	public static double positionCalc(double initialVelocity, double initialPosition, double fallingTime) throws Exception {
		
		
		// TODO check verification
		if(initialVelocity >=0 && initialVelocity < 299792458 
			&& initialPosition >=0 && initialPosition < 20000
			&& fallingTime >= 0 && fallingTime < 80000) {
			//x(t) = 0.5 × a*t^2 + v_0*t + x_0

			return 0.5* GRAVITY * Math.pow(fallingTime, 2) //cipars norada pakapi
					+ initialVelocity * fallingTime + initialPosition;
					
		}
			throw new Exception("incorrect imput parameters"); //izņēmums, obligati janorada ari augstak
		}
		
	//EXERCISE 2 - factorials
		public static int factorialForLoop(int N) {
			if(N <0) return 0;
			else if (N == 0) return 1;
			else 
			{
				int result = 1;
				for(int i = 1; i <= N; i++ )
				{
					result = result * i;
				}
				return result;
			}
		}
		
	
	//EXERCISE 3 - generateArray
	public static double [] generateArray(int N, double lower, double upper) 
		throws Exception {
		
		if(N<=0 || (upper < lower)) throw new Exception ("wrong input parameters");
		
		double [] result = new double[N];
		Random rand = new Random(); 
		for (int i =0; i<result.length; i++) {
			result[i] = rand.nextDouble(lower,upper);
		}
		
		return result;
	}
	

	//EXERCISE 3 - getMean
	public static double getMean(double[] array) throws Exception {
		if (array == null) throw new Exception("Wrong input exceptions");
		double sum = 0;
		for (double temp : array) {
			sum += temp;
		}
		return sum/array.length;
	}
	
	//EXERCISE 3 - getMin
	public static double getMin(double[] array) throws Exception {
		if (array == null) throw new Exception("Wrong input exceptions");
		
		double min = array[0];
		
		for (int i = 1; i<array.length; i++) { 
	        if (array[i]< min) { //finding lowest value 
	            min = array[i];
	        }
	    }

	    return min;
	}
	
	
	public static double getMax(double[] array) throws Exception {
		if (array == null) throw new Exception("Wrong input exceptions");
		
		double max = array[0];
		
		for (int i = 1; i<array.length; i++) {
	        if (array[i]>max) { //finding highest value 
	            max = array[i];
	        }
	    }

	    return max;
	}
	
	
	//EXERCISE 3 - arraySort
	public static double[] arraySort (double[] array) throws Exception 
	{
		if (array == null) throw new Exception("Wrong input exceptions");
		Arrays.sort(array); //function
		
		return array; 
	
	}
	
	//EXERCISE 4 - generateMatrix
	public static double[][] generateMatrix(int N) throws Exception {
		if(N <= 0) throw new Exception("Wrong input parameters");

		double[][] result = new double[N][N];
		Random rand = new Random();

		for(int i = 0; i <result.length; i++) {  //rows
			for(int j = 0; j <result[i].length; j++) {  //columns
				result[i][j] = rand.nextDouble(100); 
			}
		}

		return result;
	}

	
	//EXERCISE 4 - getProduct
	public static double getProduct(double[][] matrix, int i, int j) throws Exception { // i- rows; j-columns
		if (matrix == null || i<0 || j< 0 ||  i>= matrix.length|| j>=  matrix.length) 
		throw new Exception("Wrong input parameters"); {
	           
			double product = 0.0;

	        for (int a=0; a<matrix.length; a++) {
	            product+= matrix[i][a] * matrix[a][j];  //matrix.length=2  i=1; j=1 [1][0]*[0][1] + [1][1]*[1][1] 
	        }
	        return product;
	        }

}
	
	//EXERCISE 5 - Part1
	
	public static double[] coinFlip(int N) throws Exception {
		if (N<=0) throw new Exception("Wrong input parameters"); {
			
			Random rand = new Random(); 
			double heads = 0; 
	        double tails = 0; 
	       
	        for (int i = 0; i < N; i++) {  
	            if (rand.nextInt(2) == 0) { //0-1 
	                heads++;
	            } else {
	                tails++;
	            }
	        }
	        double ratio = heads/tails;
	        
	        return new double[]{heads, tails, ratio};
		}
	}
	
	//EXERCISE 5 - Part2
	public static int[] rollDice(int N) throws Exception {
		if(N<=0) throw new Exception("Wrong input parameters"); {
			
			Random rand = new Random(); 
			int[] histogram = new int[6]; //array for histogram with 6 elements
			int dice = 0;
			
			
			for (int i = 0; i < N; i++) {
				dice = rand.nextInt(6) + 1; //1-6 random number
				histogram[dice - 1]++; //counting how many times for each number
	            }
            
			for (int i = 0; i < histogram.length; i++) {
	        System.out.println((i + 1) + ": " + histogram[i]);
	        }
			  
		    return histogram;
			
		}
	}
	
	//EXERCISE 5 - Part3 - 2dices
	public static int roll2Dices() {
		
		int dice1 = 0;
		int dice2 = 0;
		int times = 0;
		Random rand = new Random();
		
		
        do {
            dice1 = rand.nextInt(6) + 1; // dice1
            dice2 = rand.nextInt(6) + 1; // dice2
            times++;
        } 
        while (dice1 != 6 || dice2 != 6); // continue until both dice are 6

        return times;
	}

	
	
	//EXERCISE 6 - bytes to string
	public static String getTextFromBytes(byte[] array) {
		 return new String(array);
	}
	
	
	
	//EXERCISE 7 - pascal triangle
	public static String PascalsTriangle(int level) throws Exception {
		if(level <= 0) throw new Exception("Level must be <= 0"); { //check if level nr is correct
			
			int[] row = new int[level + 1]; // array 'row' to store values 
	        row[0] = 1; // first element is 1
	        
	        //calculate the values of the current row 
	        for (int i = 1; i <= level; i++) {
	            row[i] = row[i - 1] * (level - i + 1) / i; // binomial coefficient formula
	        }
	        
	        String pascal = "["; //initialize string for result elements
	        for (int i = 0; i < row.length; i++) {
	            pascal += row[i]; //creating string with elements
	            if (i < row.length - 1) {
	               pascal += ", "; //formatting till the last element
	            }
	        }
	        pascal += "]";
	        
	        return pascal;
	    }

}
}

