// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

package HW;

public class task1 {
    public static void main(String[] args) {
        int n = (int) ((Math.random() * (11 - 1)) + 1);
        System.out.println(n);
        int sum = 0;
        int mult = 1;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(n + "-ое треугольного число = " + sum);

        for (int j = 1; j <= n; j++) {
            mult *= j;
        }
        System.out.println(n + "!= " + mult);
    }

}
