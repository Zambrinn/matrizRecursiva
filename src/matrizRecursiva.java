import java.util.Scanner;

public class matrizRecursiva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma quantidade de linhas para a matriz: ");
        int row = scanner.nextInt();
        System.out.println("Informe uma quantidade de colunas para a matriz: ");
        int col = scanner.nextInt();

        if ( row <= 0 || col <= 0 ) {
            System.out.println("O numero de linhas e colunas deve ser maior que zero");
            return;
        }

        int matrix[][] = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("Agora, informe um valor para a linha " + ( i + 1 ) + " e coluna " + ( j + 1 ));
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Aqui esta a matriz: ");
        showRecursiveMatrix(matrix, 0, 0);

    }

    public static void showRecursiveMatrix(int matrix[][], int row, int col) {
        if ( row >= matrix.length ) {
            return;
        }

        System.out.print(" " + matrix[row][col]);

        if ( col == matrix[row].length - 1 ) {
            System.out.println();
            showRecursiveMatrix(matrix, row + 1, 0);
        } else {
            showRecursiveMatrix(matrix, row, col + 1);
        }

    }
}