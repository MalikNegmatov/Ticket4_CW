import java.util.Arrays;

public class Main {

    /*- Задача: Дан массив строк, необходимо удалить из него все дубли,
    оставшиеся строки объединить в одну в порядке следования в массиве. */
    public static void main(String[] args) {
        // Инициализируем тестовый архив строк
        String[] testArray = {"ясень", "тополь", "береза", "сосна", "ясень", "дуб", "береза", "Ясень", "тополь", "сосна", "сосна",};
        System.out.println(Arrays.toString(testArray));
    }
}