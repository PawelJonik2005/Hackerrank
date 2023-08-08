import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        int totalSum = 0;
        for (int n : arr) {
            totalSum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }

        System.out.println((totalSum-max) + " " + (totalSum-min));

    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}