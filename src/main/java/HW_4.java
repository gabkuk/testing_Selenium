public class HW_4 {
    public static void main(String[] args) {
        // task 1:
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }
        //task 2 :
        boolean a = true;
        int n = 5;
        int result= 5;
        int counter = 0;
        while (a){

           if ((result = result * n) < 10000){
               counter++;
               System.out.println(result);

           }else {
               a = false;
               System.out.println(counter);
           }
        }
    }


}
