package org.aniket.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 ** Problem **
 
Given an array of integers, find the sum of its elements.
For example, if the array ar = [1,2,3]=6
  
** Function Description **

Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
simpleArraySum has the following parameter(s):
ar: an array of integers

** Input Format **

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers representing the array's elements.

** Constraints **

0 < n , ar[i] <=1000


** Output Format **

Print the sum of the array's elements as a single integer.

** Sample Input **

6
1 2 3 4 10 11

** Sample Output **

31

** Explanation **

We print the sum of the array's elements: 1+2+3+4+10+11=31


 */

public class SimpleArraySum {

	public static void main(String[] args) throws IOException {
		
	      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> ar = new ArrayList<>();

	        for (int i = 0; i < arCount; i++) {
	            int arItem = Integer.parseInt(arTemp[i]);
	            ar.add(arItem);
	        }

	        int result = simpleArraySum(ar);

	        System.out.println(result);

	        bufferedReader.close();
		
	}
	
	 public static int simpleArraySum(List<Integer> ar) {
		 int sum=0;
		 for(int no:ar)
		 {
			 sum+=no;
		 }
		 return sum; 
	 }
}

