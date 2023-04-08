public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia.toString() + " - " + dia.getValor());


        Data data = new Data(1, 4,2016,DiaSemana.SEXTA);
        System.out.println(data.toString());
        System.out.println(data.getDiaSemana());

        Formulario formulario = new Formulario("Nomes Fermininos", Formulario.Genero.FEMININO);
        System.out.println(Formulario.Genero.FEMININO.getValor());
        System.out.println("-".repeat(15));

    }
}
