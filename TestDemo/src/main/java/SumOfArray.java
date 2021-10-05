import java.io.IOException;

public class SumOfArray {

    public int Sum (int Size, int array[]){
        int rez = 0;

        for(int i = 0; i < Size; i++) {
            if (array[i] > 0)
            rez += array[i];
        }

        return  rez;
    }
}

