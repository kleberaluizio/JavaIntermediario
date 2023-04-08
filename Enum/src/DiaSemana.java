import java.util.Scanner;

public enum DiaSemana {

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    DiaSemana(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public static final String encontreDia(int value){
        DiaSemana[] dias = DiaSemana.values();
        return dias[value].toString();
    }
    public static void encontreDia(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1 para segunda, 2 para terca, ..., 7 para sabado: ");
        int day = Integer.parseInt(s.nextLine());
        DiaSemana[] dias = DiaSemana.values();

/*        return switch (day) {
            case 1 -> dias[1];
            case 2 -> dias[2];
            case 3 -> dias[3];
            case 4 -> dias[4];
            case 5 -> dias[5];
            case 6 -> dias[6];
            case 7 -> dias[7];
        };*/
    }
}
// enumerados seguem o mesmo padrao de constante
// enumerados me ajudam a controlar as entradas, garantir o controle que os valores atribuidos a variavel esta no ENUM

