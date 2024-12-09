import java.util.Scanner;
import java.util.Random;

public class Main {

    //Задание 1 №1
    public double fraction(double x) {
        //integer - целое число
        int integer = (int) x;

        //fraction - дробная часть
        double fraction = x - integer;

        return fraction;
    }

    //Задание 1 №3
    public int charToNum(char x) {
        //integer - целое число
        int code = (int) x;

        return code;
    }

    //Задание 1 №5
    public boolean is2Digits(int x) {
        String str = Integer.toString(x);
        boolean flag = (str.length() == 2);
        return flag;
    }

    //Задание 1 №7
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        return num >= min && num <= max;
    }

    //Задание 1 №9
    public boolean isEqual(int a, int b, int c) {
        return a==b && b==c;
    }

    //Задание 2 №1
    public int abs (int x) {
        int res = x;

        if (x<0) {
            res=res*(-1);
        }
        return res;
    }

    //Задание 2 №3
    public boolean is35 (int x) {
        if (x%3==0) {
            return x%3==0;
        }
        if (x%5==0) {
            return x%5==0;
        }
        else {
            return false;
        }
    }

    //Задание 2 №5
    public int max3 (int x, int y, int z) {
        int max = x;

        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }

        return max;
    }

    //Задание 2 №7
    public int sum2 (int x, int y) {
        int result;

        if (x+y>=10 & x+y<=19) {
            result=20;
        }
        else {
            result=x+y;
        }

        return result;
    }

    //Задание 2 №9
    public String day (int x) {
        String answer;
        switch (x){
            case 1:
                answer = "Понедельник";
                break;
            case 2:
                answer = "Вторник";
                break;
            case 3:
                answer = "Среда";
                break;
            case 4:
                answer = "Четверг";
                break;
            case 5:
                answer = "Пятница";
                break;
            case 6:
                answer = "Суббота";
                break;
            case 7:
                answer = "Воскресенье";
                break;
            default:
                answer = "Это не день недели";
        }
        return answer;
    }

    //Задание 3 №1
    public String listNums (int x) {
        StringBuilder line = new StringBuilder();

        for (int i=0;i<=x;i++) {
            line.append(i);
            if (i < x) {
                line.append(" ");
            }
        }

        return line.toString();
    }

    //Задание 3 №3
    public String chet (int x) {
        StringBuilder line = new StringBuilder();

        for (int i=0;i<=x;i=i+2) {
            line.append(i);
            if (i < x) {
                line.append(" ");
            }
        }

        return line.toString();
    }

    //Задание 3 №5
    public int numLen (long x) {
        String str = Long.toString(x);

        return str.length();
    }

    //Задание 3 №7
    public void square (int x) {
        //Цикл для строк
        for (int i = 0; i < x; i++) {
            //Цикл для столбцов
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Задание 3 №9
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            //Цикл для вывода пробелов
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            //Цикл для вывода символов
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //Задание 4 №1
    public int findFirst(int[] arr, int x) {
        //Проходим по всем элементам массива
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //Задание 4 №3
    public int maxAbs (int[] arr) {
        // Инициализация переменной для хранения максимального значения
        int max = arr[0];

        // Проходим по всем элементам массива
        for (int i = 1; i < arr.length; i++) {
            // Сравниваем модули текущего элемента и максимального значения
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    //Задание 4 №5
    public static int[] add(int[] arr, int[] ins, int pos) {
        //Создание нового массива
        int[] result = new int[arr.length + ins.length];

        //Копирование элементов arr до позиции pos
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        //Вставка элементов ins в позицию pos
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        //Копирование оставшихся элементов arr после позиции pos
        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }

        return result;
    }

    //Задание 4 №7
    public int[] reverseBack(int[] arr) {
        int length = arr.length;
        int[] reversedArr = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArr[i] = arr[length - 1 - i];
        }

        return reversedArr;
    }

    //Задание 4 №9
    public int[] findAll(int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        //Создаем массив для хранения индексов
        int[] indices = new int[count];
        int index = 0;

        //Заполняем массив
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[index++] = i;
            }
        }

        return indices;
    }

    public static void main(String[] args) {

        //Задание 1 №1
        System.out.println("\nЗадание 1 №1");
        Main num1_1 = new Main();
        Scanner scan = new Scanner(System.in);

        //Ввод пользователя
        System.out.print("Введите число:");
        double num = scan.nextDouble();

        double fraction = num1_1.fraction(num);
        System.out.println("Дробная часть:" + fraction);


        //Задание 1 №3
        System.out.println("\nЗадание 1 №3");
        Main num1_3 = new Main();

        //Ввод пользователя
        System.out.print("Введите число от 0 до 9:");

        while (!scan.hasNext("[0-9]")) {
            System.out.println("\nОшибка ввода! Пожалуйста, введите корректный символ от 0 до 9");
            scan.next();
            System.out.print("\nВведите символ от 0 до 9: ");
        }
        char input = scan.next().charAt(0);

        int result = num1_3.charToNum(input);
        System.out.print("Код:" + result);


        //Задание 1 №5
        System.out.println("\n\nЗадание 1 №5");
        Main num1_5 = new Main();

        //Ввод пользователя
        System.out.print("Введите число:");
        int ans = scan.nextInt();

        boolean flag = num1_5.is2Digits(ans);
        System.out.println(flag);


        //Задание 1 №7
        System.out.print("\nЗадание 1 №7");
        Main num1_7 = new Main();

        //Ввод пользователя
        System.out.print("\nВведите левую границу:");
        int left = scan.nextInt();
        System.out.print("\nВведите правую границу:");
        int right = scan.nextInt();
        System.out.print("\nВведите число:");
        int number = scan.nextInt();

        flag = num1_7.isInRange(left,right,number);
        System.out.print(flag);


        //Задание 1 №9
        System.out.print("\n\nЗадание 1 №9");
        Main num1_9 = new Main();

        //Ввод пользователя
        System.out.print("\nВведите значение a:");
        int a = scan.nextInt();
        System.out.print("Введите значение b:");
        int b = scan.nextInt();
        System.out.print("Введите значение c:");
        int c = scan.nextInt();

        flag = num1_9.isEqual(a,b,c);
        System.out.print(flag);


        //Задание 2 №1
        System.out.print("\n\nЗадание 2 №1");
        Main num2_1 = new Main();

        //Ввод пользователя
        System.out.print("\nВведите число:");
        number = scan.nextInt();

        result = num2_1.abs(number);
        System.out.print(result);


        //Задание 2 №3
        System.out.print("\n\nЗадание 2 №3");
        Main num2_3 = new Main();

        System.out.print("\nВведите число:");
        number = scan.nextInt();

        flag = num2_3.is35(number);
        System.out.print(flag);


        //Задание 2 №5
        System.out.print("\n\nЗадание 2 №5");
        Main num2_5 = new Main();

        System.out.print("\nВведите число x:");
        int x = scan.nextInt();
        System.out.print("Введите число y:");
        int y = scan.nextInt();
        System.out.print("Введите число z:");
        int z = scan.nextInt();

        result = num2_5.max3(x,y,z);
        System.out.print(result);


        //Задание 2 №7
        System.out.print("\n\nЗадание 2 №7");
        Main num2_7 = new Main();

        System.out.print("\nВведите число x:");
        x = scan.nextInt();
        System.out.print("Введите число y:");
        y = scan.nextInt();

        result = num2_7.sum2(x,y);
        System.out.print(result);


        //Задание 2 №9
        System.out.print("\n\nЗадание 2 №9");
        Main num2_9 = new Main();

        System.out.print("\nВведите номер дня недели:");
        result = scan.nextInt();

        String line = num2_9.day(result);
        System.out.print(line);


        //Задание 3 №1
        System.out.print("\n\nЗадание 3 №1");
        Main num3_1 = new Main();

        System.out.print("\nВведите число:");
        number = scan.nextInt();

        line = num3_1.listNums(number);
        System.out.print(line);


        //Задание 3 №3
        System.out.print("\n\nЗадание 3 №3");
        Main num3_3 = new Main();

        System.out.print("\nВведите число:");
        number = scan.nextInt();

        line = num3_3.chet(number);
        System.out.print(line);


        //Задание 3 №5
        System.out.print("\n\nЗадание 3 №5");
        Main num3_5 = new Main();

        System.out.print("\nВведите число:");
        number = scan.nextInt();

        result = num3_5.numLen(number);
        System.out.print(result);


        //Задание 3 №7
        System.out.print("\n\nЗадание 3 №7");
        Main num3_7 = new Main();

        System.out.print("\nВведите число:");
        number = scan.nextInt();

        num3_7.square(number);


        //Задание 3 №9
        System.out.print("\n\nЗадание 3 №9");
        Main num3_9 = new Main();

        System.out.print("\nВведите число:");
        number = scan.nextInt();

        num3_9.rightTriangle(number);


        //Задание 4 №1
        System.out.print("\n\nЗадание 4 №1");
        Main num4_1 = new Main();

        System.out.print("\nВведите размер массива:");
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите число массива:");
            arr[i] = scan.nextInt();
        }

        System.out.print("Введите число x: ");
        x = scan.nextInt();

        result = num4_1.findFirst(arr, x);
        System.out.println(result);


        //Задание 4 №3
        System.out.print("\n\nЗадание 4 №3");
        Main num4_3 = new Main();

        System.out.print("\nВведите размер массива:");
        size = scan.nextInt();

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите число массива:");
            arr[i] = scan.nextInt();
        }

        result = num4_3.maxAbs(arr);
        System.out.println(result);


        //Задание 4 №5
        System.out.print("\n\nЗадание 4 №5");
        Main num4_5 = new Main();

        System.out.print("\nВведите размер массива arr:");
        size = scan.nextInt();

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите число массива:");
            arr[i] = scan.nextInt();
        }

        System.out.print("\nВведите размер массива ins:");
        size = scan.nextInt();

        int[] ins = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите число массива:");
            ins[i] = scan.nextInt();
        }

        System.out.print("\nВведите индекс для вставки:");
        int pos = scan.nextInt();

        int[] resultArr = add(arr, ins, pos);

        for (int i : resultArr) {
            System.out.print(i + " ");
        }

        //Задание 4 №7
        System.out.print("\n\nЗадание 4 №7");
        Main num4_7 = new Main();

        System.out.print("\nВведите размер массива:");
        size = scan.nextInt();

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите число массива:");
            arr[i] = scan.nextInt();
        }

        int[] reversedArr = num4_7.reverseBack(arr);

        //Вывод результата
        for (int i : reversedArr) {
            System.out.print(i + " ");
        }


        //Задание 4 №9
        System.out.print("\n\nЗадание 4 №9");
        Main num4_9 = new Main();

        System.out.print("\nВведите размер массива:");
        size = scan.nextInt();

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите число массива:");
            arr[i] = scan.nextInt();
        }

        System.out.print("\nВведите число для поиска в массиве:");
        number = scan.nextInt();

        int[] indices = num4_9.findAll(arr, number);

        // Вывод результата
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }
}
