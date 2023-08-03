import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.get(0).size();
        int sum1 = 0;
        for (int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){
                    sum1 = sum1 + arr.get(i).get(j);
                }
            }
        }
        int i = 0;
        int j = size-1;
        int sum2 = 0;
        while (i<size&&j>-1) {
            sum2 = sum2 + arr.get(i).get(j);
            i=i+1;
            j=j-1;
        }
        int answer = Math.abs(sum1-sum2);
        return answer;
    }



}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}