public class Control {
    public static void main(String[] args) {
        // TODO code application logic here
        int num_uno = 5, num_dos = 4, resultado = 0, parametro = 4;

        switch (parametro) {
            case 1:
                resultado = num_uno + num_dos;
                System.out.println("El resultado de la suma es " + resultado);
                break;
            case 2:
                resultado = num_uno - num_dos;
                System.out.println("El resultado de  la resta es " + resultado);
                break;
            case 3:
                resultado = num_uno * num_dos;
                System.out.println("El resultado de la multiplicacion es " + resultado);
                break;
            case 4:
                if (num_dos > 0) {
                    resultado = num_uno / num_dos;
                    System.out.println("El resultado de la division es " + resultado);
                } else {
                    System.out.println("La operacion no se puede realizar");
                }
                break;
            default:
                System.out.println("Error, la opcion no existe");
        }

    }
}
