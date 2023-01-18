package Class10;
import java.util.Scanner;
import java.util.Arrays;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 5 numbers");
        // below code manually store numbers in the array
         int [] numbers=new int[5];
         /*numbers[0]=40;
         numbers[1]=50;
        numbers[2]=60;
        numbers[3]=70;
        numbers[4]=80; */

        //Below code take the numbers from user and store them in the array its good but a lot of code
        /* numbers[0]=scanner.nextInt();
        numbers[1]=scanner.nextInt();
        numbers[2]=scanner.nextInt();
        numbers[3]=scanner.nextInt();
        numbers[4]=scanner.nextInt(); */

        // below code uses a normal for loop to ask the user for numbers and store them in the array
        for (int i=0; i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
