package poo.imutabilidade;
//enum é usado para definir constantes
enum DiaDaSemana{
    //variáveis são por padrão final e static
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

public class TesteEnum {
    public static void main(String[] args) {
        DiaDaSemana dia = DiaDaSemana.SEGUNDA;
        System.out.println("Hoje é: " + dia);
    }
}
