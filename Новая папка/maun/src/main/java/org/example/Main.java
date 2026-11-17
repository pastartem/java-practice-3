package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> textList = new ArrayList<>();

        while (true) {
            System.out.println("\nНажмите 1 = Напишите текст который добавить");
            System.out.println("Нажмите 2 = Удалить первый текст");
            System.out.println("Нажмите 3 = Удалить текст по индексу");
            System.out.println("Нажмите 4 = Показать весь массив");
            System.out.println("Нажмите 5 = Закончить программу");

            int action = scanner.nextInt();
            scanner.nextLine();


            if (action == 5 || action == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            if (action == 1) {
                System.out.print("Введите ваш текст: ");
                String userText = scanner.nextLine();
                textList.add(userText);
                System.out.println("Добавлено!");
            }
            else if (action == 2) {
                if (!textList.isEmpty()) {
                    textList.remove(0);
                    System.out.println("Первый элемент удален.");
                } else {
                    System.out.println("Список пуст!");
                }
            }
            else if (action == 3) {
                if (!textList.isEmpty()) {
                    System.out.print("Введите индекс для удаления (от 0 до " + (textList.size() - 1) + "): ");
                    int index = scanner.nextInt();

                    if (index >= 0 && index < textList.size()) {
                        textList.remove(index);
                        System.out.println("Элемент удален.");
                    } else {
                        System.out.println("Неверный индекс!");
                    }
                } else {
                    System.out.println("Список пуст!");
                }
            }
            else if (action == 4) {
                System.out.println("Весь массив: " + textList);
            }
        }

    }
}
