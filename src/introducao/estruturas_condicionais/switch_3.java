package introducao.estruturas_condicionais;

public class switch_3 {
    public static void main(String[] args) {
        String dia = "ter";

        String tipoDeDia = switch (dia){
            case "seg", "ter", "qua", "qui", "sex" -> "dia util";
            case "sabado", "domingo" -> "fim de semana";
            default -> "desconhecido";
        };
        System.out.println(tipoDeDia);
    }
}
