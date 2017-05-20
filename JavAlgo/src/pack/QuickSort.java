package pack;

import java.util.Arrays;

import util.Gap;
import util.Rander;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inp_arr = Rander.genRandArr(10, 1, 25);
		
		System.out.println(Arrays.toString(inp_arr));
		
		int t = Rander.genTarget(1, 25);
		
		System.out.println(t);
		
		long s1 = Gap.start();
//		linSearch(inp_arr,t);
		quiSort(inp_arr,0,inp_arr.length-1);
		long s2 = Gap.stop();
		
		System.out.println(s2-s1+" NanoSecs");
		

	}

	private static void quiSort(int[] inp_arr, int l, int h) {
		// TODO Auto-generated method stub
		
		int p = inp_arr[l+(h-l)/2];
		
		while(l <= h){
			
			
			
		}
		
		
		
	}
	
	private static void partition(int[] inp_arr, int l, int h) {
		// TODO Auto-generated method stub
		
		int p = inp_arr[0];
		
		
		
	}
	
	

	

}
