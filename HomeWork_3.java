import java.util.Scanner;

public class HomeWork_3 {

        public static void main(String[] args) {
            new Scanner(System.in);
            System.out.print("Как Вас зовут: ");
            Scanner name = new Scanner(System.in);
            String personName = name.nextLine();
            System.out.println("Добро пожаловать, " + personName + "!");
            System.out.println("Давайте проверим, как хорошо Вы знаете мировые столицы!");
            String[][] tests = new String[][]{{"Столица России?", "Москва", "Вашингтон", "Лондон", "Рим", "Москва"}, {"Столица Германии?", "Пекин", "Берлин", "Осло", "Париж", "Берлин"}, {"Столица Узбекистана?", "Ташкент", "Мадрид", "Варшава", "Минск", "Ташкент"}, {"Столица Мексики?", "Киев", "Нурсултан", "Мехико", "Москва", "Мехико"}, {"Столица Японии?", "Рим", "Оттава", "Токио", "Афины", "Токио"}};
            int summary = 0;

            for(int i = 0; i < 5; ++i) {
                System.out.println(i + 1 + " вопрос: " + tests[i][0] + " Выберите правильный ответ от 1, 2, 3 или 4?");

                for(int j = 1; j < 5; ++j) {
                    System.out.println("    " + j + ". " + tests[i][j]);
                }

                System.out.print("Ваш ответ: ");
                Scanner number = new Scanner(System.in);
                int answer = number.nextInt();
                if (tests[i][5].equals(tests[i][answer])) {
                    System.out.println("Поздравляю! Вы ответили правильно!");
                    ++summary;
                } else {
                    System.out.println("Вы ответили не верно, правильный ответ " + tests[i][5] + "!");
                }
            }

            System.out.println("Правильных ответов: " + summary + " из 5!");
        }
}

