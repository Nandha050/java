import java.util.*;

public class day4 {

    public static boolean isprimeChecker(int n) {

        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String a = "xf1RfuQS3DzMl1nqamaEuP47jF9Q";
        ArrayList<Character> arr = new ArrayList<>();

        String b = "";

        for (char i : a.toCharArray()) {
            System.out.println(i);

            arr.add(i);

        }
        System.out.println(arr);

        for (int i = 0; i <= arr.size(); i++) {
            if (isprimeChecker(i)) {

                b += (arr.get(i));
            }

        }

        System.out.println(b);

    }

}
