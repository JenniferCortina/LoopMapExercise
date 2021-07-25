import java.util.*;

public class LoopMapExercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numArray;

        System.out.println("Add a number");
        int num1 = scan.nextInt();

        System.out.println("Add a number");
        int num2 = scan.nextInt();

        System.out.println("Add a number");
        int num3 = scan.nextInt();

        System.out.println("Add a number");
        int num4 = scan.nextInt();

        System.out.println("Add a number");
        int num5 = scan.nextInt();


        //To find the sum//
        int numbArray[] = {num1, num2, num3, num4, num5};
        int sum = 0;

        for (int i : numbArray)
            sum += i;
        System.out.println("The sum  of the numbers is " + sum);

//        To find the product//
//        for (i = 0; i < 5; i++) {
//            Scanner in = new Scanner(System.in);
//            n = in.nextInt();
//
//            sum += n;
//        }
//        avg = sum / 5;
        System.out.println("The product of the numbers is ");

        //To find the largest and smallest number of an array//

        int numbers[] = new int[]{num1, num2, num3, num4, num5};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];

            System.out.println("The largest Number is : "+  largest);
            System.out.println("The smallest Number is : " + smallest);


        }
    }
}
