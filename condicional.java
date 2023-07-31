public class condicional {
    public static void main(String[] args) {
        // TODO code application logic here
        int biologia = 4;
        int matematicas = 5;
        int quimica = 7;
        int operacion = 6;

        if (operacion == 1) {
            int promedio = (matematicas + biologia + quimica) / 3;
            System.out.println(promedio);
        } else if (operacion == 2) {
            int suma = (matematicas + biologia + quimica);
            System.out.println(suma);
        } else if (operacion == 3) {
            int resta = (matematicas - biologia - quimica);
            System.out.println(resta);
        } else if (operacion == 4) {
            int division = matematicas / 4;
            System.out.println(division);
        } else if (operacion == 5) {
            int mult = (matematicas * biologia * quimica);
            System.out.println(mult);
        } else {
            System.out.println("La operacion no existe");
        }
        ;
    }
}
