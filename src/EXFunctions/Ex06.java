package EXFunctions;

public class Ex06 {
    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Elemento não encontrado
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Elemento encontrado
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right); // Busca na metade direita
        } else {
            return binarySearch(arr, target, left, mid - 1); // Busca na metade esquerda
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Elemento encontrado na posição " + result);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
}
