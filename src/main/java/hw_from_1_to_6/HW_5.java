package hw_from_1_to_6;

public class HW_5 {
    public static void main(String[] args) {
//        task 1 :
        for (int i = 9; i > -1; i--) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print(j);

            }
            System.out.println("");
        }


//        task 2 :
        String str ="";
        for (int i = 9; i > -1; i--) {
            System.out.print(str);
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j);

            }
            str = str + " ";
            System.out.println("");

        }

        //task 3
        String str1 = "";
        for (int i = 9; i > -1; i--) {
            System.out.print(str1);
            for (int k = i; k > -1; k--) {
                System.out.print(k);

            }

            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);

            }

            System.out.println("");
            str1 = str1 + " ";

        }

    }


}
