package week1.day1.classroom;

import java.util.Arrays;

public class missingElement{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int diff=arr[0]-0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-i !=diff)
			{
				while(diff< arr[i]-i)
				{
				System.out.println(i+diff);
				diff++;
				break;
			}
		
		}
		
	}
	}

}