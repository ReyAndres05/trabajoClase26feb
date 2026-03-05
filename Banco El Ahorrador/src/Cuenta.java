public class Cuenta{
    private double saldo;
    public Cuenta(){
        this.saldo = 0;
    }
    public Cuenta(double saldoInicial){
        if (saldoInicial >= 0){
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }
    public void depositar(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado con éxito");
        } else {
            System.out.println("Error: el monto a depositar debe ser mayor que 0.");
        }
    }
    public void retirar (double monto){
        if (monto <= 0){
            System.out.println("Error: el monto a retirar debe ser mayor que 0.");
            return;
        }
        if (monto > saldo){
            System.out.println("Error: Fondos insuficientes");
            return;
        }

        saldo -= monto;
        System.out.println("Retiro realizado con éxito.");
    }

    public double getSaldo() {
        return saldo;
    }
}