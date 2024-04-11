package conta;

public class ContaPoupanca {

  private int saldo = 0;

  public int getSaldo() {
    return saldo;
  }

  public int depositar(int valor) {
    this.saldo += valor;
    return saldo;
  }

  public int sacar(int valor) {
    this.saldo -= valor;
    return saldo;
  }

  public int verSaldo() {
    return getSaldo();
  }
}
