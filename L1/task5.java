// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

public class task5 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
            if (arr[i] == 0) {
                count = 0;
            }
        }
        System.out.printf("" + count);
    }
}
