# java-step-counter
## Описание приложения
Бекэнд сервиса для подсчета пройденных шагов: пользователю достаточно ввести данные статистики за промежуток времени в консоль и приложение выведет результат на экран.

Приложение имеет следующие функции:
1. Хранение данных о количестве пройденных шагов за несколько месяцев;
2. Ввод цели по количеству шагов в день;
3. Ввод пройденного количества шагов за день;
4. Вывод статистики за определённый месяц.

## Стек
- Java SE 11

## Шаги по запуску приложения
- Склонировать репозиторий 
- Запустить билд через консоль или среду разработки
- Следовать инструкции на экране

----
Приложение написано на Java. Пример кода:
```java
MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        int[] days = new int[30];
    }
}
```
----
Приложение создано в рамках прохождения курса Java-разработчик от [Яндекс-Практикум](https://practicum.yandex.ru/java-developer/ "Тут учат Java!") 
