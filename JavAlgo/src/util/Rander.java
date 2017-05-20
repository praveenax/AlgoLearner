package util;
import java.util.Random;
public class Rander {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<10;i++){
			System.out.println(randInt(1,10));
		}
	}
	
	public static int[] genRandArr(int n,int min,int max){
		
		int arr[] = new int[n];

		for(int i=0;i<n;i++){
//			System.out.println();
			arr[i] = randInt(min,max);
		}
		
		return arr;
	}
	
public static int genTarget(int min,int max){
		
		int op = randInt(min,max);

		
//			System.out.println();
			
		
		
		return op;
	}
	
	public static int randInt(int min, int max) {

	    
	    Random rand = new Random();

	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
