

public class task1 {
    public static void main(String[] args) {
        System.out.println("Задание: Написать программу, которая выводит на экран числа от 1 до 100. " +
                "При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz», а вместо чисел, " +
                "кратных пяти — слово «Buzz». Если число кратно и 3, и 5, " +
                "то программа должна выводить слово «FizzBuzz»");

        for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else {
                        System.out.println("Fizz");
                    }
                } else if (i % 5 == 0){
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
        }
    }
}