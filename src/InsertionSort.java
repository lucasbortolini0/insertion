import java.util.*;

public class InsertionSort {

    public static void main(String args[]) {

        int i, j, aux;


        int[] vetor = {1, 50, 60, 10, 20};

        for (i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while ((j >= 0) && (aux < vetor[j]))
            {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        System.out.println(Arrays.toString(vetor));
    }
}
