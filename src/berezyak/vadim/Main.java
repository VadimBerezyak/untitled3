package berezyak.vadim;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]
                {
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

                };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i][j + 1];
            }
            arr[i][arr[i].length - 1] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
