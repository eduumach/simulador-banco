package eduumach.github.com.simuladorbanco.entity;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long Id;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "nome")
    private String nome;

    @OneToOne
    @JoinColumn(name="conta_id", referencedColumnName="id",nullable=false)
    private ContaEntity conta;

    public ClienteEntity() {
    }

    public ClienteEntity(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public ContaEntity getConta() {
        return conta;
    }

    public void setConta(ContaEntity conta) {
        this.conta = conta;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
