import java.io.*;
import java.util.*;

class Result {
    public static void plusMinus(List<Integer> arr) {
        int len = arr.size();
        int p = 0;
        int n = 0;
        int z = 0;
        for (int i = 0; i < len; i++) {
            if (arr.get(i) > 0) {
                p = p + 1;
            } else if (arr.get(i) < 0) {
                n = n + 1;
            } else {
                z = z + 1;
            }
        }
        double positive = (double) p / len;
        double negative = (double) n / len;
        double zero = (double) z / len;
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

