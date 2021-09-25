Algoritmo "Exercicio4"

Var
vetorA: vetor [1..10] de inteiro
i, intervalo, fora: inteiro

Inicio

      Para i de 1 ate 10 faca
         Escreval("Informe o numero da Matriz A: [",i,"]")
        leia (vetorA[i])
        Se(vetorA[i] >=10) e (vetorA[i] <= 20)Entao
         intervalo <- intervalo + 1
        senao
         fora <- fora + 1
       Fimse
       FimPara
       limpatela
       Escreval ("---------- EXERCICIO 4 ----------")
       Escreval ("Quantidade de numeros no intervalo entre 10 e 20: ", intervalo)
       EscrevaL ("Quantidade de numeros fora do intervalo: ", fora)

Fimalgoritmo