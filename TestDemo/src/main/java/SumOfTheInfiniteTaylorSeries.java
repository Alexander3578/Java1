import java.util.Random;
import java.util.Scanner;

public class SumOfTheInfiniteTaylorSeries {

    public static void main(String[] args) {

        int SizeOfArr = 7;
        int array[] = new int[SizeOfArr];
        array = new int[]{1, 2, 3, 4, 5, -6, 8};


        SumOfArray Sum = new SumOfArray();
        int Result = Sum.Sum(SizeOfArr, array);

        System.out.println("Сумма элементов массива равна: " + Result);
    }
}
