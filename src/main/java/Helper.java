import java.util.ArrayList;
import java.util.Objects;

/**
 * @author satheesh
 */
public class Helper {

    public StringBuilder stringReverseAdv(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse();
    }

    public String stringReverse(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }
        return temp;
    }

    public long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public void fibonacci(int num) {
        int a = 0, b = 1;
        for (int i = 0; i <= num; i++) {
            if (i <= 1) {
                System.out.print(i + " ");
                continue;
            }
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + " ");
        }
    }

    public boolean armstrongNumberCheck(int num) {
        int total = 0;
        ArrayList<Integer> digits = digits(num);
        for (Integer digit1 : digits) {
            int tempTotal = 1;
            for (Integer digit : digits) {
                tempTotal = tempTotal * digit1;
            }
            total = total + tempTotal;
        }
        return num == total;
    }

    public ArrayList digits(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        while (num > 0) {
            result.add(num % 10);
            num = num / 10;
        }
        return result;
    }

    public int reverseNumber(int num) {
        int temp = 1, result = 0;
        ArrayList<Integer> digits = digits(num);
        for (int i = digits.size() - 1; i >= 0; i--) {
            result = result + (temp * digits.get(i));
            temp = temp * 10;
        }
        return result;
    }

    public boolean magicNumberCheck(int num) {
        ArrayList<Integer> digits = digits(num);
        while (digits.size() != 1) {
            int total = 0;
            for (int i = 0; i < digits.size(); i++) {
                total = total + digits.get(i);
            }
            digits = digits(total);
        }
        return digits.get(0) == 1;
    }

    public boolean palindromeCheck(int num) {
        ArrayList<Integer> digits = digits(num);
        ArrayList<Object> result = new ArrayList<>();
        int j = digits.size() - 1;
        for (int i = 0; i < digits.size(); i++) {
            if (Objects.equals(digits.get(i), digits.get(j))) {
                result.add(true);
            } else {
                result.add(false);
            }
            j--;
        }
        return !result.contains(false);
    }

    public boolean palindromeCheck(String str) {
        String forward = str.replaceAll(" ", "");
        String reversed = stringReverse(forward);
        return forward.equalsIgnoreCase(reversed);
    }

    public void floydPattern(int rows) {
        int temp = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public boolean primeNumberCheck(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void primeNumbers(int max){
        for(int n=1; n <= max; n++){
            if(primeNumberCheck(n)) System.out.print(n + " ");
        }
    }

}
