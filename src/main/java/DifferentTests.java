import hw_9.Employee;

import java.io.InputStream;
import java.util.Arrays;

public class DifferentTests {
    public static String correct(String string) {
       String i = string;
        i = string.replaceAll("1", "I");
        i = i.replaceAll("5", "S");
         i = i.replaceAll("0", "O");
//        for (int i = 0; i < chars.length; i++) {
//
//            if (chars[i] == '1') {
//                chars[i] = 'I';
//            }
//            if (chars[i] == '0') {
//                chars[i] = 'O';
//            }
//            if (chars[i] == '5') {
//                chars[i] = 'S';
//            }
//        }


        return i;
    }

    public static String correct2 (String string) {
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '1') {
                chars[i] = 'I';
            }
            if (chars[i] == '0') {
                chars[i] = 'O';
            }
            if (chars[i] == '5') {
                chars[i] = 'S';
            }
        }

       return new String(chars);

    }

    public static void main(String[] args) {
        String correct = correct("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5");
        String s = correct2("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL510");

        System.out.println(correct);
        System.out.println(s);

        Employee skdjfd = new Employee("skdjfd", 10);

        InputStream sdfsdf = DifferentTests.class.getResourceAsStream("sdfsdf");
    }
}
