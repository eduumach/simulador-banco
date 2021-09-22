package eduumach.github.com.simuladorbanco.entity;

import javax.persistence.*;

@Entity
@Table(name = "conta")
public class ContaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "saldo")
    private double saldo;

    @Column(name = "extrato")
    private String extrato;

    public ContaEntity() {
    }

    public ContaEntity(double saldo, String extrato) {
        this.saldo = saldo;
        this.extrato = extrato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }
}
