# 🏡 SmartHouse and Residente 🏡

SmartHouse and Residente é um projeto focado em praticar os tipos de dados e na criação de métodos e constructor em Java.

<strong>OBS:</strong> ESSE PROJETO FOI DESENVOLVIDO NA TRYBE.

## 📑 Informações básicas e Orientações 📑

<details>
  <summary><strong>⚙️ Técnologias usadas ⚙️</strong></summary><br>
  
  * Java;
  * Maven;
  * Eslint.
</details>

<details>
  <summary><strong>⌨️ Instalando Dependências ⌨️</strong></summary><br>
  
  Execute:  `npm install`
</details>

<details>
  <summary><strong>🛠 Executando Testes 🛠</strong></summary><br>
  
  Para executar todos os testes basta rodar o comando: `mvn test`
  
  Para executar apenas uma classe de testes: `mvn test -Dtest="TestClassName"`
</details>

## 👥 Informações gerais 👥

### 🏠 Class SmartHouse 🏠

<details>
  <summary><strong>💡 Controle da Lâmpada	💡</strong></summary><br>
  
  1 - Criei um atributo chamado `lampada` do tipo `boolean` para classificar se a lampada está ligada ou apagada;
  
  2 - Para mudar o estado da lampada, utilizei dois métodos: `ligarLampada` e `desligarLampada`;

  3 - Para verificar o estado da lampada, basta chamar o método `isLampadaLigada` que retornará `true` ou `false`. 

</details>

<details>
  <summary><strong>🌐 Conexão à Internet	🌐</strong></summary><br>
  
  1 - Criei um método chamado `conectarInternet` que irá receber o atributo `connectionRate` do tipo `double` e deverá retornar `true`ou `false`;
  
  2 - Para o atributo `connectionRate` ser true, a taxa de conexão deverá ser maior que 0.5, indicando uma conexão bem-sucedida.

  3 - Caso o atributo `connectionRate` for menor ou igual a 0.5, o método deve retornar false, indicando que a conexão falhou.

</details>

<!-- 




 -->
