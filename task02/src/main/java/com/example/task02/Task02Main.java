package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int pred = -1;
        int b;
        while ((b = System.in.read()) != -1) {
            if (pred == '\r' && b == '\n') {
                System.out.write('\n');
                pred = -1;
            } else {
                if (pred != -1) {
                    System.out.write(pred);
                }
                pred = b;
            }
        }
        if (pred != -1) {
            System.out.write(pred);
        }
        System.out.flush();
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с src/test/resources/expected.test
        // то же самое делает тест main_testFiles
    }
}
