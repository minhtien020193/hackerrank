//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.Arrays;
//
//public class practicalTest {
//	public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        int n = Integer.parseInt(br.readLine().trim());
//        String[] arr_arr = br.readLine().trim().split(" ");
//        int[] arr = new int[n];
//        for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
//            arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
//        }
//
//        long out_ = solve(arr);
//        wr.println(out_);
//
//        wr.close();
//        br.close();
//    }
//
//    static long solve(int[] arr) {
//    	Arrays.sort(arr);
//    	int first = 0;
//    	int maxPower = arr[0];
//    	for (int last = 1; last < arr.length; last++) {
//    		if(first + 1 == last)
//    		{
//    			if(arr[first] + arr[last] > maxPower)
//    			{
//    				maxPower = arr[first] + arr[last];
//    			} 
//    		}else 
//			{
//				while(arr[first] + arr[first + 1] < arr[last])
//					first ++;
//				
//				int newPower = 0;
//				for (int i = 0; i < last; i++) {
//					newPower = newPower + arr[i];
//				}
//				
//				if(newPower > maxPower ) maxPower = newPower;
//			}
//		}
//    		
//    	
//       return maxPower;
//
//    }
//	
//	
//	
//	
//	
//	
////	public static void main(String[] args) {
////
////		Scanner myObj = new Scanner(System.in); 
////		String firstLine = myObj.nextLine();
////		String secondLine = myObj.nextLine();
////		String[] numbers = secondLine.split(" ");
////		
////		for (int i = 0; i < Integer.parseInt(firstLine); i++) {
////			for (int j = 1; j <= Integer.parseInt(numbers[i]); j++) {
////				if (j % 3 == 0 && j % 5 == 0)
////					System.out.println("FizzBuzz");
////				else if (j % 3 == 0)
////					System.out.println("Fizz");
////				else if (j % 5 == 0)
////					System.out.println("Buzz");
////				else
////					System.out.println(j);
////			}
////
////		}
////
////	}
//}