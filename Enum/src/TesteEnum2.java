public class TesteEnum2 {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();

        for (int i = 0; i < dias.length ; i++){
            System.out.println(dias[i].toString());
        }
        System.out.println("-".repeat(20));

        for (DiaSemana day : DiaSemana.values()){
            System.out.println(day);
        }
        System.out.println("-".repeat(20));

        DiaSemana diaTeste = Enum.valueOf(DiaSemana.class,"DOMINGO");
        System.out.println(diaTeste);
        System.out.println("-".repeat(20));


    }
}
