//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//class Result {
//
//	/*
//	 * Complete the 'getDistanceMetrics' function below.
//	 *
//	 * The function is expected to return a LONG_INTEGER_ARRAY. The function
//	 * accepts INTEGER_ARRAY arr as parameter.
//	 */
//
////	public static List<Long> getDistanceMetrics(List<Integer> arr) {
//		List<Long> list = new ArrayList<>();
//		for (int i = 0; i < arr.size(); i++) { // j
//			int value = 0;
//			for (int j = 0; j < arr.size(); j++) { // k
//				if (j != i && arr.get(j) == arr.get(i)) {
//					value += Math.abs(i - j);
//				}
//			}
//			list.add((long) value);
//		}
//		return list;
//	}
//
//}
//
//public class main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//		List<Integer> arr = new ArrayList<>();
//
//		for (int i = 0; i < arrCount; i++) {
//			int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
//			arr.add(arrItem);
//		}
//
//		List<Long> result = Result.getDistanceMetrics(arr);
//
//		for (int i = 0; i < result.size(); i++) {
//			bufferedWriter.write(String.valueOf(result.get(i)));
//
//			if (i != result.size() - 1) {
//				bufferedWriter.write("\n");
//			}
//		}
//
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
//	}
//}
