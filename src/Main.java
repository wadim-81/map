import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Пользователи вводят поисковые запросы (просто строка в консоли),
//        2. В ответ пользователю напишите, сколько раз такая строка уже искалась другими пользователями
//        2.1 Если строка искалась более 100 раз, то дальнейшее количество попыток поиска не учитывается (значение замирает на 100)
//
//        Дополнительное задание:
//
//     1. Придумать, как проверить решение, передав в код какую-либо строку более 100 раз (сделать можно любым способом: код на джаве, каким-либо сочетанием клавиш)

        Map<String, Integer> searchCounts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите поисковый запрос (или 'exit' для выхода):");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                break;
            }

            Integer count = searchCounts.get(line);
            if (count == null) {
                count = 1;
            } else if (count < 100) {
                count++;
            }
            searchCounts.put(line, count);


            System.out.println("Запрос '" + line + "' был найден " + searchCounts.get(line) + " раз(а).");


        }
    }
}




















