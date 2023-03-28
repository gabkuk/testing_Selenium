public class HW_6_1 {
    public static void main(String[] args) {
//    task1
//    Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести сумму всех значений массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

//        task 2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.
        int maxVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        System.out.println("maxVal " + maxVal);

//        task 3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        int minVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
            }
        }
        System.out.println("minVal  " + minVal);

//        task 4
//        Дан массив:
//int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//необходимо вывести среднее арифметическое всех значений массива.
        int sum1 = 0;
        float average;
        for (int i = 0; i < array.length; i++) {
            sum1 = sum1 + array[i];
        }
        average = sum1 / (float) array.length;
        System.out.println(sum1);
        System.out.println("average value  " + average);
//        task 5
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int arrMemberSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int cellArrLen = arr[i].length;
            for (int j = 0; j < cellArrLen; j++) {
                arrMemberSum = arrMemberSum + arr[i][j];
            }

        }
        System.out.println("arrMemberSum " + arrMemberSum);

//        task 6 Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести максимальное значение массива.
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            int cellArrLen = arr[i].length;
            for (int j = 0; j < cellArrLen; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("task №6 arr max value: " + max);


    }
}
