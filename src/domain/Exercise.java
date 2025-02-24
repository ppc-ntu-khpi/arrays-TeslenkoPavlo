
package domain;

/**
 * Клас для роботи з простими числами
 */
public class Exercise {
    
    /**
     * Метод для перевірки чи є число простим
     * @param number число для перевірки
     * @return true якщо число просте, false якщо ні
     */
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    /**
     * Метод для створення масиву простих чисел у заданому діапазоні
     * @param start початок діапазону
     * @param end кінець діапазону
     * @return рядок, що містить всі прості числа у вказаному діапазоні
     */
    public static String findPrimes(int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                result.append(i).append(" ");
            }
        }
        return result.toString().trim();
    }
}
