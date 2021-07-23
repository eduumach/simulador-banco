
## API Simulação Banco

#### GET Extrato

```
GET /contas/extrato/${id}
```

Mostrara todo historico de transação de uma conta.

#### GET Saldo

```
GET /contas/saldo/${id}
```

Mostrara o saldo da conta.

#### POST Abrir conta

``` 
POST /contas/abrir  
```

Abrira uma nova conta.

| Parametros | Tipo     | Descrição                       |
| :--------- | :------- | :------------------------------ |
| `cpf`      | `string` | **Obrigatorio**. CPF do cliente |
| `nome`     | `string` | **Obrigatorio**. Nome do cliente|

#### POST deposito

```
POST /contas/deposito/${id}
```

| Parametros | Tipo     | Descrição                          | 
| :--------- | :------- | :--------------------------------- |
| `valor`    | `double` | **Obrigatorio**. Valor de deposito |

#### POST Saque

```
POST /contas/saque/${id}
```

| Parametros | Tipo     | Descrição                       | 
| :--------- | :------- | :------------------------------ |
| `valor`    | `double` | **Obrigatorio**. Valor de saque |

#### POST Transferencia

```
POST /contas/transferencia/${id}
```

| Parametros | Tipo     | Descrição                              | 
| :--------- | :------- | :------------------------------------- |
| `valor`    | `double` | **Obrigatorio**. Valor de tranfarencia |
| `idDestino`| `int`    | **Obrigatorio**. Id da conta de destino|