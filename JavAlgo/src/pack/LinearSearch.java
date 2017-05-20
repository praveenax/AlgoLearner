package pack;

import java.util.Arrays;

import util.Gap;
import util.Rander;

public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inp_arr = Rander.genRandArr(10, 1, 25);
		
		System.out.println(Arrays.toString(inp_arr));
		
		int t = Rander.genTarget(1, 25);
		
		System.out.println(t);
		
		long s1 = Gap.start();
		linSearch(inp_arr,t);
		long s2 = Gap.stop();
		
		System.out.println(s2-s1+" NanoSecs");
		

	}

	private static void linSearch(int[] inp_arr, int t) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(inp_arr));
		System.out.println(t);
		
		boolean isFound = false;
		
		for(int i=0;i<inp_arr.length;i++){
			
			if(t == inp_arr[i]){
				isFound = true;
				System.out.println(i);
				break;
			
			}
		
		}
		
		if(!isFound){
		System.out.println("NOT FOUND");
		}
		
	}
	
	

}
