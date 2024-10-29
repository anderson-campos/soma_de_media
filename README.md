<h1>Programa de Cálculo de Média de Números</h1>

<p>Este é um programa em Java que solicita ao usuário que insira dez números inteiros, calcula a soma desses números e, em seguida, exibe a média aritmética dos mesmos. O programa utiliza uma estrutura de repetição do-while para coletar as entradas do usuário e calcular os valores necessários.</p>

<h2>Funcionalidades do Programa</h2>
<ul>
  <li>Solicita ao usuário que insira dez números inteiros, um por vez.</li>
  <li>Exibe uma mensagem específica para cada entrada, indicando a posição do número solicitado (ex.: "Digite o PRIMEIRO número", "Digite o SEGUNDO número" etc.).</li>
  <li>Armazena a soma dos números inseridos pelo usuário.</li>
  <li>Calcula a média aritmética dos números inseridos.</li>
  <li>Exibe o valor total da soma dos números.</li>
  <li>Exibe o valor da média aritmética dos números.</li>
</ul>

<h2>Estrutura e Funcionamento</h2>
<h3>Classes e Métodos</h3>
<ul>
  <li><strong>scam</strong>: Instância da classe Scanner, usada para receber a entrada do usuário pelo console.</li>
  <li><strong>soma</strong>: Variável int que acumula a soma dos números inseridos pelo usuário.</li>
  <li><strong>numeroUsuario</strong>: Variável int que armazena temporariamente o valor do número atual inserido pelo usuário.</li>
  <li><strong>media</strong>: Variável int que armazena o valor da média dos números após a soma ter sido concluída.</li>
  <li><strong>i</strong>: Variável int que serve como contador para garantir que o programa solicite exatamente dez números.</li>
</ul>

<h2>Estrutura de Repetição do-while</h2>
<p>O loop do-while é usado para garantir que o programa solicite a entrada do usuário exatamente dez vezes. A cada iteração:</p>
<ol>
  <li>Exibe uma mensagem no console solicitando o próximo número.</li>
  <li>Armazena o número inserido pelo usuário na variável numeroUsuario.</li>
  <li>Incrementa o valor de soma com o número inserido.</li>
  <li>Incrementa o contador i para acompanhar o número de entradas fornecidas.</li>
</ol>
<p>A estrutura do-while garante que o código no bloco do seja executado antes de verificar a condição no while. Dessa forma, a entrada do usuário é solicitada antes da verificação do contador i, permitindo que o programa sempre solicite os dez números conforme esperado.</p>

<h2>Cálculo da Média</h2>
<p>Após a execução do loop, o programa calcula a média dividindo o valor total de soma pelo número de entradas (i). O valor da média é então armazenado na variável media.</p>

<h2>Exibição dos Resultados</h2>
<ul>
  <li>O programa exibe a soma total dos números inseridos pelo usuário.</li>
  <li>Em seguida, exibe a média aritmética calculada.</li>
</ul>
