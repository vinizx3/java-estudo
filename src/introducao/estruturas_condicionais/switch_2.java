package introducao.estruturas_condicionais;

public class switch_2 {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1 -> System.out.println("segunda");
            case 2 -> System.out.println("terça");
            case 3 -> System.out.println("quarta");

            default -> System.out.println("desconhecido");
        }
    }
}
