public class aula003 {
    public static void main(String[] args){
          // criando a conta
          Conta minhaConta;
          minhaConta = new Conta();
  
          // alterando os valores de minhaConta
          minhaConta.titular = "Duke";
          minhaConta.saldo = 1000;
  
          // saca 200 reais
          minhaConta.saca(200);
  
          // deposita 500 reais
          minhaConta.deposita(500);
          System.out.println(minhaConta.saldo);
    }
}

class Conta {

    int numero;
    String titular;
    double saldo;

    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            // não deu pra sacar!
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }

    void deposita(double quantidade) {
    this.saldo += quantidade;
    
    }
}

class TestaDuasContas {
    public static void main(String[] args) {

        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.saldo = 1000;

        Conta meuSonho;
        meuSonho = new Conta();
        meuSonho.saldo = 1500000;
    }
}