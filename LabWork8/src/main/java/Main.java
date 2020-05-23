import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of digits ");
        int number = input.nextInt();
        int [] arr = new int[number];
        for (int i = 0; i < number; i++){
            arr[i] = rand.nextInt();
            System.out.format(" %d", arr[i]);
        }
        System.out.println();
        System.out.println(MedFinder.getMedian(arr));
    }
}
