package poo.matriz.application;

public class Matriz {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 3};
        int [][] arrInt = new int[3][];

        arrInt[0] = new int[2];
        arrInt[1] = arrNum;
        arrInt[2] = new int[]{1,2,3,4,5,6};

        int[][] arrInt2 = {{0,0}, {0,1,2}, {1,2,3,4,5,6}};

        for (int[] arrBase : arrInt2){
            System.out.println("\n");
            for (int num : arrBase){
                System.out.print(num + "");
            }
        }
    }
}
