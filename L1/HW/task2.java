// Вывести все простые числа от 1 до 1000

package HW;

public class task2 {
    static int is_prime(int num) {
        var j = 2;
        while (j <= num / 2) {
            if (num % j == 0) {
                return 0;
            }
            j++;
        }
        return 1;
    }

    public static void main(String[] args) {
        int x = 2;
        while (x <= 1000) {
            if (is_prime(x) == 1) {
                System.out.println(x);
            }
            x++;
        }
    }
}