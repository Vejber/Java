// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, 
// нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) 
// элементов массива должны быть отличны от заданного, 
// а остальные - равны ему.

public class task6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 3, 2, 3 };
        int val = 3;
        var temp = 0;
        for (int j = 0; j <= arr.length; j++) {

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != val) {
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        for (int number : arr) {
            System.out.format("%d ", number);
        }
        System.out.println();
    }

}
