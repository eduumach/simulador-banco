package eduumach.github.com.simuladorbanco.model;

import eduumach.github.com.simuladorbanco.model.Conta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaTeste {
    @Test
    void deposito() throws Exception{
        Conta conta = new Conta();
        conta.deposito(2);
        conta.deposito(3);

        assertEquals(5, conta.saldo());
    }

    @Test
    void saque() throws  Exception{
        Conta conta = new Conta();
        conta.deposito(500);
        conta.saque(400);

        assertEquals(100, conta.saldo());
    }

    @Test
    void saldo() throws Exception{
        Conta conta = new Conta();
        conta.deposito(100);

        assertEquals(100, conta.saldo());
    }

    @Test
    void transferencia() throws Exception{
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        conta1.deposito(100);
        conta1.transferencia(conta2, 50);
        System.out.println(conta1.saldo());
        System.out.println(conta2.saldo());
    }

    @Test
    void extrato() throws  Exception{
        Conta conta = new Conta();
        Conta conta2 = new Conta();
        conta.deposito(100);
        conta.saque(10);
        conta.saque(40);
        System.out.println(conta.extrato());

    }

    @Test
    void saldoNegativo() throws Exception{
        Conta conta = new Conta();
        conta.deposito(100);
        try {
            conta.saque(150);
        } catch (Exception a){
            System.out.println(conta.saldo() + "\n" + a);
        }
    }

}
