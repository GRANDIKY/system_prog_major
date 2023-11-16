public class Main {
    // Функция для поиска мажоритарного элемента
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Проход по массиву
        for (int num : nums) {
            // Если счетчик сброшен до 0, устанавливаем новый кандидат на мажоритарный элемент
            if (count == 0) {
                candidate = num;
            }

            // Если текущий элемент равен кандидату, увеличиваем счетчик, иначе уменьшаем
            count += (num == candidate) ? 1 : -1;
        }

        // Возвращаем кандидата на мажоритарный элемент
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 4, 2, 1, 2, 2}; // Пример массива

        Integer majorityElement = findMajorityElement(nums);

        if (majorityElement != null) {
            System.out.println("Мажоритарный элемент: " + majorityElement);
        } else {
            System.out.println("Мажоритарный элемент отсутствует");
        }
    }
}