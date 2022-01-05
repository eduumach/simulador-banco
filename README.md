
# Simulador Banco

Com esse projeto tenho o intuito de compartilhar meu conhecimento e estudo sobre java e rest api.


## API

#### Criar cliente

```http
POST /clientes/criar
```

| Parameter | Type     | Description            |
|:----------|:---------|:-----------------------|
| `cpf`     | `string` | **Obrigatório**. cpf.  |
| `name`    | `string` | **Obrigatório**. nome. |

#### Associar conta

```http
POST /clientes/associaconta
```

| Parameter | Type     | Description                                       |
|:----------|:---------|:--------------------------------------------------|
| `cpf`     | `string` | **Obrigatório**. CPF do cliente.                  |
| `idConta` | `string` | **Obrigatório**. Id da conta que deseja associar. |

#### Criar conta

```http
POST /contas/criar
```
Cria uma conta.

#### Associar cliente

```http
POST /contas/associacliente
```

| Parameter | Type     | Description                                       |
|:----------|:---------|:--------------------------------------------------|
| `cpf`     | `string` | **Obrigatório**. CPF do cliente.                  |
| `idConta` | `string` | **Obrigatório**. Id da conta que deseja associar. |

#### Operação saldo

```http
GET /operacao/saldo
```

| Parameter | Type   | Description                   |
|:----------|:-------|:------------------------------|
| `conta`   | `Long` | **Obrigatório**. Id da conta. |

#### Operação deposito

```http
POST /operacao/deposito
```

| Parameter | Type     | Description                         |
|:----------|:---------|:------------------------------------|
| `conta`   | `Long`   | **Obrigatório**. Id da conta.       |
| `valor`   | `double` | **Obrigatório**. Valor do deposito. |

#### Operação saque

```http
POST /operacao/saque
```

| Parameter | Type     | Description                      |
|:----------|:---------|:---------------------------------|
| `conta`   | `Long`   | **Obrigatório**. Id da conta.    |
| `valor`   | `double` | **Obrigatório**. Valor do saque. |

#### Operação transferencia

```http
POST /operacao/transferencia
```

| Parameter        | Type     | Description                              |
|:-----------------|:---------|:-----------------------------------------|
| `idConta`        | `Long`   | **Obrigatório**. Id da conta.            |
| `idContaDestino` | `Long`   | **Obrigatório**. Id da conta destino.    |
| `valor`          | `double` | **Obrigatório**. Valor da transferencia. |

## Projeto no heroku

Eu subi o projeto no heroku caso queria testar é só usar o postman e o endereço é esse:
https://simulador-banco-eduumach.herokuapp.com/