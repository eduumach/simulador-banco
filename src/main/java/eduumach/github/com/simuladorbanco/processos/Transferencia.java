package eduumach.github.com.simuladorbanco.processos;


public class Transferencia {
    void transfere(Conta origen, Conta destino, double valor) throws Exception {
        if(origen.saldo() <= valor){
            origen.saque(valor);
            origen.deposito(valor);
        }else{
            throw new Exception("Saldo insuficiente.");
        }
    }
}
