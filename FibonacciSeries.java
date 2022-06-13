package week1.day1;
//	 * input(range): 8 output: 2, 3, 5, 8, 13

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range =8;
		int firstNum = 0;
		int secNum = 1;
		int Sum=0;
//sum = 2+3=5, 3+5 =8, 5+j8=13
		System.out.print(firstNum + " " + secNum);
		
		for (int i = 1; i <=(range-2); i++) {
			Sum=firstNum +secNum;
			firstNum=secNum;
			secNum=Sum;
			//System.out.println("Fibonacci value for range " + i  + " is " + Sum);
			System.out.print( " "+Sum);
				
		}
		
		System.out.println("\n\rFibonacci value for range " + range  + " is " + Sum);
			 
	}
	    
	

}
