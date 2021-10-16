package HomeWorkApp02;


public class HomeWorkApp02 {
    public static void main(String[] args) {
tenToTwenty(); // Объявляем методы
posOrNeg(5);
isNegative(-4);
stringAndNumbers();
leapYear(2021);

    }

    public static boolean tenToTwenty() { // Метод boolean
        int a = 11; // вводим две переменные
        int b = 10;

        if ((a + b) >= 10 && (a + b) <= 20) { // Если сумма (a + b) одновременно меньше 20(вкл) и больше 10(вкл), вернуть значение true
            System.out.println("true");
            return true;
        } else { // В противном случае вернуть значение false
            System.out.println("false");
            return false;
        }
    }


    public static void posOrNeg (int a) { // Метод void, то есть не нужно ничего возвращать
        if (a >= 0) { // Если переменная больше или равно 0, написать об этом в консоли
            System.out.println("Число положительно");
        } else { // В противном случае, написать в консоли обратное
            System.out.println("Число отрицательно");
        }
    }

    public static boolean isNegative (int x) { // Метод boolean
        if (x > 0) { // Если значение х больше 0, вернуть значение true
            System.out.println("true");
            return true;
        } else { // В противном случае вернуть значение false
            System.out.println("false");
            return false;
        }
    }


    public static void stringAndNumbers () { // Метод void
        String word = "Указанная строка"; // Вводим две переменные word и times, где первое - строка, которую мы хотим вывести в консоль, а последнее - число, обозночающее количество строк
        int times;

    for(times = 1; times <=10; times++) {                                      // При: значении переменной times = 1, и times меньше или равно 10, используя for, создает цикл.
System.out.println(word); // Есть вариант написать все значения word в одну строку, в таком случае можно использовать команду System.out.print(word)
}


    }

    public static boolean leapYear(int year) { // Метод boolean
        if(year %100 == 0&&year %400 != 0) { // Если значение переменной делится на 100 без остатка и это же значение не делится на 400 без остатка, вернуть значение false
            return false;
        } else if(year %400 == 0) { // Если переменная делится на 400 без остатка, вернуть значение true
            return true;
        } else if(year %4 == 0) { // Если переменная делится на 4 без остатка, вернуть значение true
            return true;
        } else { // В любом другом случае вернуть значение false
            return false;
        }
    }
}

