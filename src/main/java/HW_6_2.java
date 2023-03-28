public class HW_6_2 {
    public static void main(String[] args) {
//        Задача №1
//
//Дана строка:
//String s = “Перестановочный алгоритм быстрого действия”;
//необходимо вывести все буквы “о” из этой строки.
//Для указанной строки ответ будет “ооооо” (или в столбик)
        String s = "Перестановочный алгоритм быстрого действия";
        char[] charsArr = s.toCharArray();
        String resultStr = "";
        for (int i = 0; i < charsArr.length; i++) {
            if (charsArr[i] == 'о') {
                resultStr = resultStr + "o";
            }

        }
        System.out.println("задача 1 : " + resultStr);


//        Задача №2
//
//Дана строка:
//String s = “Перевыборы выбранного президента”;
//необходимо подсчитать количество букв “е” в строке.
//Для указанной строки ответ будет 4.

        String s1 = "Перевыборы выбранного президента";
        char[] chars = s1.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'е') {
                counter++;
            }
        }
        System.out.println(" задача 2 количество букв е равно : " + counter);


//        Задача №3
//
//Дана строка:
//String s = “Посмотрите как Рите нравится ритм”;
//необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//Для указанной строки ответ будет 6, 15, 29.
        String str2 = "трите как Рите нравится ритм";
        for (int i = 0; i < str2.length() - 3; i++) {
            if (str2.substring(i, i + 3).toLowerCase().equals("рит")) {
                System.out.println(i);
            }
        }


    }
}
