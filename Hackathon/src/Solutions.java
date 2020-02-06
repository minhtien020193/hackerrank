import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Solutions {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
			arr.add(arrItem);
		}

		List<Long> result = Result.getDistanceMetrics(arr);

		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(String.valueOf(result.get(i)));

			if (i != result.size() - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();

	}

}

class Result {

	/*
	 * Complete the 'pthFactor' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. LONG_INTEGER n 2. LONG_INTEGER p
	 */

	public static List<Long> getDistanceMetrics(List<Integer> arr) {
//		List<Long> list = new ArrayList<>();
		ArrayList<Long> list = new ArrayList<>();
		long longArray[] = null; 
		
		for (int i = 0; i < arr.size() - 1; i++) { // j
//			long value = 0;
			for (int j = i+1; j < arr.size(); j++) { // k
				if (j != i && arr.get(j).compareTo(arr.get(i)) == 0) {
					longArray[i] += Math.abs(i - j);
					longArray[j] += Math.abs(i - j);
				}
			}
			
		}
		System.out.print(longArray);
		return list;
	}

}
