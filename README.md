# Contador

### Resumo do Programa

Este programa em Java lê dois números inteiros do usuário e imprime uma contagem sequencial do menor para o maior. Se o primeiro número for maior que o segundo, lança uma exceção customizada.

### Estrutura

- **Classe Principal `Contador`**:
  - Lê dois números do usuário.
  - Tenta contar do primeiro número até o segundo.
  - Lança exceção se o primeiro número for maior que o segundo.

- **Classe `ParametrosInvalidosException`**:
  - Exceção customizada para quando o segundo número é menor que o primeiro.

### Funcionamento

1. Usuário digita dois números.
2. O programa imprime a contagem de 1 até a diferença entre os números.
3. Se o primeiro número for maior, lança exceção com mensagem de erro.
