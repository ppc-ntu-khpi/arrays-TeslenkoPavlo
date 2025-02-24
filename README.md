
# 🧮 Практична робота: Пошук простих чисел у діапазоні

## 📝 Опис завдання
Програма знаходить та виводить усі прості числа у заданому користувачем діапазоні. Це завдання демонструє роботу з:
- Алгоритмами пошуку простих чисел
- Обробкою користувацького введення
- Оптимізацією коду
- Форматуванням виведення результатів

## 🎯 Функціональність
- ✨ Перевірка чисел на простоту
- 📊 Робота з діапазонами чисел
- 🔍 Оптимізований алгоритм пошуку
- 📝 Форматоване виведення результатів

## 🚀 Використання
1. Запустіть програму
2. Введіть початок діапазону
3. Введіть кінець діапазону
4. Отримайте список усіх простих чисел у вказаному діапазоні

## 💻 Приклад роботи
```java
Введіть початок діапазону: 1
Введіть кінець діапазону: 20
Прості числа в діапазоні від 1 до 20: 2 3 5 7 11 13 17 19
```

## 🛠️ Технічні деталі
### Клас Exercise
```java
public class Exercise {
    /**
     * Метод для перевірки чи є число простим
     * @param number число для перевірки
     * @return true якщо число просте, false якщо ні
     */
    private static boolean isPrime(int number)
    
    /**
     * Метод для створення масиву простих чисел у заданому діапазоні
     * @param start початок діапазону
     * @param end кінець діапазону
     * @return рядок, що містить всі прості числа у вказаному діапазоні
     */
    public static String findPrimes(int start, int end)
}
```

## ⚡ Оптимізація
- Використання StringBuilder для ефективної побудови результуючого рядка
- Оптимізований алгоритм перевірки на простоту числа
- Ефективна робота з пам'яттю

## 👨‍💻 Автор
- Створено в рамках практичної роботи з ООП
- [Посилання на репозиторій]()

## 📱 Приклади використання

### Приклад 1: Пошук простих чисел від 1 до 10
```
Введіть початок діапазону: 1
Введіть кінець діапазону: 10
Прості числа в діапазоні від 1 до 10: 2 3 5 7
```
![](https://github.com/ppc-ntu-khpi/arrays-TeslenkoPavlo/blob/master/img/picture1.png?raw=true)

### Приклад 2: Пошук простих чисел від 10 до 50
```
Введіть початок діапазону: 10
Введіть кінець діапазону: 50
Прості числа в діапазоні від 10 до 50: 11 13 17 19 23 29 31 37 41 43 47
```
![](https://github.com/ppc-ntu-khpi/arrays-TeslenkoPavlo/blob/master/img/picture2.png?raw=true)

### Приклад 3: Пошук простих чисел від 90 до 100
```
Введіть початок діапазону: 90
Введіть кінець діапазону: 100
Прості числа в діапазоні від 90 до 100: 97
```
![](https://github.com/ppc-ntu-khpi/arrays-TeslenkoPavlo/blob/master/img/picture3.png?raw=true)

