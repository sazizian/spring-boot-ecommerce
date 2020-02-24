package test;

public class Test {
    public static void main(String[] args) {
        System.out.println(getLargestPrime2(21));
     //   numberToWords(-2);
    }

    public class SpeedConverter {

        public long toMilesPerHours(double KilometersPerHour) {
            if (KilometersPerHour < 0) {
                return -1;
            }
            return Math.round(.621371 * KilometersPerHour);
        }
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = Math.abs(number);
        while (num > 0) {
            int degit = num % 10;
            reverse = reverse * 10 + degit;
            num = num / 10;
        }
        return reverse == Math.abs(number);
    }

    public static int sumFirstAndLastDigit(int number){
        if ( number <0){
            return -1;
        }
        int first = 0;
        int last = number % 10;
        while(number > 0){
            first = number % 10;
            number = number /10;
        }
        return (first+last);

    }
    public static int getEvenDigitSum(int number){
        if ( number < 0){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            if( digit % 2 == 0){
                sum+=digit;
            }
            number/=10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int a, int b){
        if((a<10 || a>99) || (b<10 || b>99)){
            return false;
        }
        int residual_a = a % 10;
        int residual_a2 = a /=10;
        while(b>0){
            if(residual_a == (b%10) || (residual_a2 == (b%10))){
                return true;
            }
            b/=10;
        }
        return false;
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if( first < 10 || second < 10){
            return -1;
        }
        if (first > second){
            int temp = first;
            first = second;
            second = temp;
        }
        int gcd = -1;
        for(int i=1; i<= first; ++i){
            if((first % i == 0) && (second %i == 0)){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void numberToWords(int number){
        if( number < 0){
            System.out.print("Invalid Value");
        }
        int rev = reverse(number);
        int countNumber = getDigitCount(number);
        int countRev = getDigitCount(rev);
        String result = "";
        if ( countNumber != countRev){
            int diff = countNumber - countRev;
            for( int i = 0 ; i< diff; ++i){
                result = result + " Zero";
            }
        }
        while(rev > 0){
            int digit = rev % 10;
            rev /=10;
            switch (digit){
                case 1:
                    result = "One " + result.trim();
                    break;
                case 2:
                    result = "Two "+ result.trim();
                    break;
                case 3:
                    result = "Three "+ result.trim();
                    break;
                case 4:
                    result = "Four "+ result.trim();
                    break;
                case 5:
                    result = "Five "+ result.trim();
                    break;
                case 6:
                    result = "Six "+ result.trim();
                    break;
                case 7:
                    result = "Seven "+ result.trim();
                    break;
                case 8:
                    result = "Eight "+ result.trim();
                    break;
                case 9:
                    result = "Nine "+ result.trim();
                    break;
            }

        }
        System.out.print(result.trim());
    }
    public static int getDigitCount(int number){
        if( number < 0){
            return -1;
        }
        int count =0;

        while( number> 0){
            number /= 10;
            ++count;
        }
        return count;
    }

    public static int reverse(int number){
        int sign = 1;
        if(number < 0){
            sign = -1;
            number = Math.abs(number);
        }
        int reverse = 0;
        while(number > 0){
            int digite = number % 10;
            number/=10;
            reverse = reverse *10 + digite;
        }
        return reverse * sign;
    }
    public static int getLargestPrime(int a){
        int max = 0;
        if( a< 0){
            return -1;
        }

        for(int i = 1; i< a; ++i){
            if( a % i == 0){
                max = i;
            }
        }
        return max;
    }
    public static int getLargestPrime2(int a){
        int max = 0;
        if( a< 0){
            return -1;
        }

        for(int i = 1; i<= a; ++i){
            boolean flage = false;
            for( int j = 2 ; j< i;++j){
                if( i % j == 0){
                    flage = true;
                }
            }
            if( !flage){
                max = i;
            }

        }
        return max;
    }
}
