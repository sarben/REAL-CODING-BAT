/**
 * Created by h205p2 on 9/20/17.
 */
public class Runner {
    public static void main(String args[]) {

        System.out.println(hasTeen(13,20,10));
        System.out.println(stringTimes("Hi", 2));
        System.out.println(helloName("Bob"));

        int[] x = new int[3];
        x[0] = 1;
        x[1] = 2;
        x[2] = 6;
        x[3] = 3;
        x[4] = 0;

        System.out.println(firstLast6(x));
        System.out.println(cigarParty(30, false));
        System.out.println(loneSum(1,2,3));
        System.out.println(bobThere("abcbob"));
        System.out.println(countYZ("fez day"));
        System.out.println(has77(x));
        System.out.println(canBalance(x));

    }

    public static boolean hasTeen(int a, int b, int c) {
        if ((12 < a && a < 20) || (12 < b && b < 20) || (12 < c && c < 20)) {
            return (true);
        } else {
            return (false);
        }
    }

    public static String stringTimes(String str, int n) {
        String x = "";
        for (int i = 0; i < n; i++) {
            x = x + str;
        }
        return (x);
    }

    public static String helloName(String name) {
        return ("Hello " + name + "!");
    }

    public static boolean firstLast6(int[] nums) {
        if ((nums[0] == 6) || (nums[nums.length - 1] == 6)) {
            return (true);
        } else {
            return (false);
        }
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if ((!isWeekend) && (40 <= cigars && cigars <= 60)) {
            return (true);
        } else if ((isWeekend) && (cigars >= 40)) {
            return (true);
        } else {
            return (false);
        }
    }

    public static int loneSum(int a, int b, int c) {
        int sum = 0;
        if ((a != b) && (a != c) && (b != c)) {
            sum = sum + a + b + c;
        } else if ((a == c) && (b == a)) {
            sum = 0;
        } else if (a == b) {
            sum = c;
        } else if (b == c) {
            sum = a;
        } else {
            sum = b;
        }
        return sum;
    }

    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if ((str.charAt(i) == 'b') && (str.charAt(i + 2) == 'b')) {
                return true;
            }
        }
        return false;
    }

    public static int countYZ(String str) {
        int count = 0;
        String string = str.toLowerCase() + " ";
        for (int i = 0; i < str.length(); i++){
            if(((string.charAt(i) == 'y') || ((string.charAt(i) == 'z')))){
                if(!Character.isLetter(string.charAt(i+1))){
                    count++;
            }
         }
        }
        return count;
    }

    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == 7){
                if (nums[i + 1] == 7) {
                    return true;
                } else if (i < nums.length - 2){
                    if (nums[i + 2] == 7){
                        return true;
                    }
                }
            }
        } return false;
    }

    public static boolean canBalance(int[] nums) {
            int count = 0;

            for (int i = 0; i < nums.length; i++){
                count += nums[i];
                int bcount = 0;
                for(int x = nums.length - 1; x > i; x--){
                    bcount += nums[x];
                }
                if (count == bcount){
                    return true;
                }
            }
            return false;
        }
}