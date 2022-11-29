package HW;

// простой калькулятор
import java.util.Scanner;
// package HW;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("First number ");
        int first_num = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Second number ");
        int second_num = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Choose operation: + OR - OR * OR / ");
        char operation = iScanner.next().charAt(0);
        switch (operation) {
            case ('+'): {
                System.out.println(first_num + second_num);
                break;
            }
            case ('-'): {
                System.out.println(first_num - second_num);
                break;
            }
            case ('*'): {
                System.out.println(first_num * second_num);
                break;
            }
            case ('/'): {
                System.out.println(first_num / second_num);
                break;
            }
            default: {
                System.out.println("Wrong command, try again.");
                break;
            }
        }
        iScanner.close();
    }

}
