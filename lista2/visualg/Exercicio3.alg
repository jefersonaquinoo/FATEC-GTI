Algoritmo "Exercicio3"

Var
matrizA, matrizB: vetor [1..3,1..3] de inteiro
i, j, somaA, somaB, total: inteiro

Inicio

      Para i de 1 ate 3 faca
       Para j de 1 ate 3 faca
        Escreval("Informe o numero da Matriz A: [",i,",",j,"]")
        leia (matrizA[i,j])
        Escreval("Informe o numero da Matriz B: [",i,",",j,"]")
        leia (matrizB[i,j])
        somaA <- somaA + matrizA[i,j]
        somaB <- somaB + matrizB[i,j]
        FimPara
       FimPara
       total <- somaA + somaB
       limpatela
       Escreval ("---------- SOMA DE MATRIZES ----------")
       Escreva ("Soma da Matriz A e Matriz B: ", total)

Fimalgoritmo