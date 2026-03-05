import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta;

        System.out.println("|===Banco El Ahorrador===|\n");
        System.out.println("Ingrese su saldo inicial (0 en caso de querer iniciar con la cuenta vacía): ");
        double saldoInicial = scanner.nextDouble();

        if (saldoInicial == 0){
            cuenta = new Cuenta();
        } else {
            cuenta = new Cuenta(saldoInicial);
        }
        int opcion;

        do {
            System.out.println("\n______________________");
            System.out.println("|------- MENÚ -------|");
            System.out.println("|1. Depositar dinero |");
            System.out.println("|2. Retirar dinero   |");
            System.out.println("|3. Consultar saldo  |");
            System.out.println("|4. Salir            |");
            System.out.println("----------------------\n");
            System.out.print("Seleccione una opción: \n");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su monto a depositar: \n");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("¿Cuánto dinero desea retirar? \n");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;

                case 3:
                    System.out.print("Su saldo actual es de: $" + cuenta.getSaldo());
                    break;

                case 4:
                    System.out.print("Gracias por usar nuestro sistema.\n");
                    break;

                default:
                    System.out.print("Opción inválida, seleccione una de las opción que salen en la pantalla. \n");
            }
        } while (opcion != 4);
        scanner.close();
    }
}
