import java.util.Arrays;

public class Main {

    /*- Задача: Дан массив строк, необходимо удалить из него все дубли,
    оставшиеся строки объединить в одну в порядке следования в массиве. */
    public static void main(String[] args) {
        // Инициализируем тестовый архив строк
        String[] testArray = {"ясень", "тополь", "береза", "сосна", "ясень", "дуб", "береза", "Ясень", "тополь", "сосна", "сосна"};
        System.out.println(Arrays.toString(testArray));
        // поиск дублей полным перебором, сложность O(n^2) без учета времени на сравнение string.equals()
        System.out.println(allOneString(deleteDubs(testArray)));
        // поиск дублей полным перебором
    }

    /**
     * Метод поиска дубликатов полным перебором брут форс
     * @param arr -- массив строк
     */
    public static String[] deleteDubs(String[] arr) {
        String[] uniqArr = Arrays.copyOf(arr, arr.length );
        for (int i = 0; i < (uniqArr.length - 1); i++) { // цикл по элементам массива
            if (uniqArr[i] != null) { // проверка на то, что ссылка на объект не пустая
                // цикл сравнения с последующими элементами массива
                for (int j = i + 1; j < uniqArr.length - 1; j++) {
                    if (uniqArr[i].equals(uniqArr[j])) {  // сравниваем содержание экземпляров объектов
                        uniqArr[j] = null; // если встретили дубликат -- ссылку на него "теряем"
                    }
                } // внутренний цикл
            }
        } //внешний цикл
        return uniqArr;
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