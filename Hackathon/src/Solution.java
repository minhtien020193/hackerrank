//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//class Result {
//
//	/*
//	 * Complete the 'pthFactor' function below.
//	 *
//	 * The function is expected to return a LONG_INTEGER. The function accepts
//	 * following parameters: 1. LONG_INTEGER n 2. LONG_INTEGER p
//	 */
//
//	public static long pthFactor(long n, long p) {
////		if (n == 1)
////			return 1;
////		List<Long> arr = new ArrayList<Long>();
////		for (long i = 1; i <= n; i++)
////			if (n % i == 0)
////				arr.add(i);
////		return p + 1 > arr.size() ? 0 : arr.get((int) (p-1));
//		
//		if (n == 1)
//			return 1;
//		ArrayList<Long> factors = new ArrayList<Long>();
//		for (long i = 1; i <= Math.sqrt(n); i ++) {
//
//	        // If there is no remainder, then the number is a factor.
//	        if (n % i == 0) {
//	            factors.add(i);
//
//	            // Skip duplicates
//	            if (i != n / i) {
//	                factors.add(n / i);
//	            }
//
//	        }
//	    }
//		Collections.sort(factors);
//		return p  > factors.size() ? 0 : factors.get((int) (p-1));
//
//	}
//
//}
//
//public class Solution {
//	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		long n = Long.parseLong(bufferedReader.readLine().trim());
//
//		long p = Long.parseLong(bufferedReader.readLine().trim());
//
//		long result = Result.pthFactor(n, p);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
//	}
//}
