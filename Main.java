import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 14;
        int[] mas = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введите элемент: ");
            mas[i] = input.nextInt();
        }
        mas = BubbleSort(mas);
        System.out.println(Arrays.toString(mas));
    }
    public static int[] BubbleSort(int[] mas){
        for (int i = 0; i < 14; i++){
            for (int j = 0; j < 14; j++){
                if (mas[i] > 0 && mas[j] > 0){
                    if (mas[i] > mas[j]){
                        int temp = mas[i];
                        mas[i] = mas[j];
                        mas[j] = temp;
                    }
                }
            }
        }
        return mas;
    }
}