package com.example.task02;

import java.io.IOException;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int b;
        boolean pendingCR = false;

        while ((b = System.in.read()) != -1) {
            if (pendingCR) {
                if (b == 10) {
                    System.out.write(10);
                    pendingCR = false;
                } else {
                    System.out.write(13);
                    pendingCR = false;

                    if (b == 13) {
                        pendingCR = true;
                    } else {
                        System.out.write(b);
                    }
                }
            } else {
                if (b == 13) {
                    pendingCR = true;
                } else {
                    System.out.write(b);
                }
            }
        }

        if (pendingCR) {
            System.out.write(13);
        }

        System.out.flush();
    }
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с src/test/resources/expected.test
        // то же самое делает тест main_testFiles

}
