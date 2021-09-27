Algoritmo "Exercicio2"

Var
Par: vetor [1..5] de inteiro
i, soma: inteiro

Inicio

      Para i de 1 ate 5 faca
        Escreval("Informe o primeiro numero: ")
         leia (Par[i])
              Se(Par[i]%2=0)Entao
                 soma <- soma + Par[i]
              Fimse
       FimPara
            Escreva ("Soma de numeros pares no Vetor: ", soma)

Fimalgoritmo