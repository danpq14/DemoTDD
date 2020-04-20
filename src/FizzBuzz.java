public class FizzBuzz {
    public static String fizzBuzz(int number){
        String result = null;
        int numberSub3 = number % 3;
        int numberSub5 = number % 5;

        if (numberSub3 == 0 && numberSub5 == 0) {
            result = "FizzBuzz";
        }
        if (numberSub3 == 0 && numberSub5 != 0 ) {
            result = "Fizz";
        }
        if (numberSub5 == 0 && numberSub3 != 0) {
            result = "Buzz";
        }
        if (numberSub3 != 0 && numberSub5 !=0 ) {
            result = Integer.toString(number);
        }
        return result;
    }
}
