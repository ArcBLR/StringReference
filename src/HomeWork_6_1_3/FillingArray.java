package HomeWork_6_1_3;

import java.util.ArrayList;
import java.util.Scanner;

public class FillingArray {
    public static void main(String[] args) {
        ArrayList fillingArray = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        boolean isStop = false;
        while (!isStop) {
            System.out.println("Введите элемент для добавления (для окончания введите \"stop\"): ");
            String next = scanner.nextLine();
            isStop = next.equals("stop");
            fillingArray.add(next);
            fillingArray.remove("stop");
        }
        for (int j = 0; j < fillingArray.size(); j++) {
            System.out.print(fillingArray.get(j) + " ");
        }
    }
}

//          Сразу было так, потом немного почитал теорию и сделал через while,
//          но приходится каждый раз удалять последний элемент (stop) иначе он выводится в итоговой строке.

//        for (int i = 1; i < i + 1 & i > 0; i++) {
//            System.out.println("Введите элемент для добавления (для окончания введите \"stop\"): ");
//            String next = scanner.nextLine();
//            switch (next) {
//                case "stop":
//                    i = -1;
//                    for (int j = 0; j < fillingArray.size(); j++) {
//                        System.out.print(fillingArray.get(j) + " ");
//                    }
//                    break;
//        }
//            fillingArray.add(next);
//      }
//   }
//}