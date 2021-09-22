package eduumach.github.com.simuladorbanco.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class ContaTeste {
    @Test
    void deposito() throws Exception{
        Conta conta = new Conta();
        conta.deposito(2);
        conta.deposito(3);

        assertEquals(5, conta.getSaldo());
    }

    @Test
    void saque() throws  Exception{
        Conta conta = new Conta();
        conta.deposito(500);
        conta.saque(400);

        assertEquals(100, conta.getSaldo());
    }

    @Test
    void saldo() throws Exception{
        Conta conta = new Conta();
        conta.deposito(100);

        assertEquals(100, conta.getSaldo());
    }

    @Test
    void transferencia() throws Exception{
        Cliente conta1 = new Cliente();
        Cliente conta2 = new Cliente();
        conta1.getConta().deposito(100);
        conta1.getConta().transferencia(conta2, 50);
        System.out.println(conta1.getConta().getSaldo());
        System.out.println(conta2.getConta().getSaldo());
    }

    @Test
    void extrato() throws  Exception{
        Conta conta = new Conta();
        Conta conta2 = new Conta();
        conta.deposito(100);
        conta.saque(10);
        conta.saque(40);
        System.out.println(conta.extratoTotal());

    }

    @Test
    void saldoNegativo() throws Exception{
        Conta conta = new Conta();
        conta.deposito(100);
        try {
            conta.saque(150);
        } catch (Exception a){
            System.out.println(conta.getSaldo() + "\n" + a);
        }
    }

}
