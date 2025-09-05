public class CuentaBancaria {
    // Atributo privado
    private double saldo;


    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }


    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }


    public double getSaldo() {
        return saldo;
    }
}