package NewPractice;

import java.util.Arrays;

public class ArrayPractice 
{
	public static void main(String[] args)
	{
		int a[]= {5,8,16,78,65,2,0,4,3,5};
//		//print array element
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		reverse order, 
//		for(int i=a.length-1;i>0;i--)
//		{
//			System.out.println(a[i]);
//		}
////		even element
//		for(int i=0;i<a.length;i++)
//		{
//			if((a[i]%2)==0)
//			{
//				System.out.println(a[i]);
//			}
//		}
////		odd element
//		for(int i=0;i<a.length;i++)
//		{
//			if((a[i]%2)!=0)
//			{
//				System.out.println(a[i]);
//			}
//		}
//		largest
//		int max= a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if (a[i]>max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println(max);
//		smallest
//		int small= a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if (a[i]<small)
//			{
//				small=a[i];
//			}
//		}
//		System.out.println(small);
//		
		//sorting
		 // Custom input array
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
 
        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr);
 
        // Printing the array after sorting
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));
	}
}
