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
        changeArray(arr);

    }

    public static int[][] changeArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i][j + 1];
                System.out.print(arr[i][j] + " ");
            }
            arr[i][arr[i].length - 1] = 0;
            System.out.println(arr[i][arr[i].length - 1]);
        }
        return arr;

    }
}
