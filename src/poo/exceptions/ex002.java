package poo.exceptions;

public class ex002 {
    public static int accessElement(int[] arrary, int indice){
        try {
            return arrary[indice];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: indict outside the limit");
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};

        System.out.println("Access element: " + accessElement(myArray, 2));
        System.out.println("Access element: " + accessElement(myArray, 10));
    }
}
