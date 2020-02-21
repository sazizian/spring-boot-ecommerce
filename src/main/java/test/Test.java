package test;

public class Test {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public class SpeedConverter {

        public long toMilesPerHours(double KilometersPerHour){
            if( KilometersPerHour < 0){
                return -1;
            }
            return  Math.round(.621371 * KilometersPerHour);
        }
    }

    public static boolean isPalindrome(int number){

        int reverse =0;
        int num=Math.abs(number);

        while(num > 0){

            int degit = num% 10;
            reverse =reverse* 10 + degit;
            num = num/10;
        }
        return reverse == Math.abs(number);

    }
}
