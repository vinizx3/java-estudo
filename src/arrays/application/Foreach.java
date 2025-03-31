package arrays.application;

public class Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        String[] nomes = {"Ana", "Maria", "Amanda"};
        double[] datas = new double[]{31.03, 29.03, 17.05};
        numeros[0] = 1;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        for (String name : nomes){
            System.out.println(name);
        }
        for (double date: datas){
            System.out.println(date);
        }
    }
}
