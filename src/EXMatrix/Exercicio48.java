package EXMatrix;
import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR: ");
        int value = scanner.nextInt();
        boolean found = false;
        
        for(int i = 0; i < vector.length; i++){
            if (vector[i]==value) {
                System.out.println("Valor " + value + " encontrado na posição " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Valor não encontrado");
        }
        scanner.close();
    }
}
