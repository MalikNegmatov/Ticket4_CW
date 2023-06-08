import java.util.Arrays;

public class Main {

    /*- Задача: Дан массив строк, необходимо удалить из него все дубли,
    оставшиеся строки объединить в одну в порядке следования в массиве. */
    public static void main(String[] args) {
        // Инициализируем тестовый архив строк
        String[] testArray = {"ясень", "тополь", "береза", "сосна", "ясень", "дуб", "береза", "Ясень", "тополь", "сосна", "сосна",};
        System.out.println(Arrays.toString(testArray));
        System.out.println(allOneString(testArray));
    }

    /**
     * Метод объединения всех строк в одну в порядке следования в массиве
     * @param arr -- передаваемый в метод массив строк
     * @return -- возвращает переменную строку объединением всех строк массива
     */
    public static String allOneString(String[] arr) {
        // используем StringBuilder, чтобы не плодить экземпляры класса String
        StringBuilder result = new StringBuilder();
        for (String w : arr ) {
            if ( w != null ) result.append(w);
        }
        return String.valueOf(result);
        // В условии задачи нет требования к добавлению разделителя между строками
    }
}