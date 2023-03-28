public class HW_3 {
    public static void main(String[] args) {
        int a = 52;
        int b = 13;
//        task 1:
        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }

//        task 2:
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else System.out.println("some variable is odd");


//        task 3 :
        float c;
        if ( a > 10){
            System.out.println("больше 10");
        }if (a <100){
            System.out.println("меньше 100");
        }if (( c = a /2) > 20){
            System.out.println("результат деления на 2 больше 20");
        }if( a >= 5 && a <= 40){
            System.out.println("значение переменной между 5 и 40 включительно");
        }else System.out.println("значение переменной меньше 5 или больше 40");


//task 3 :
        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0){
                System.out.println("task 3: " + i);
            }
        }

        for (int i = 40; i < 61; i = i + 4) {
            System.out.println("task 3: " + i);
        }
    }
}
