programa
{
inclua biblioteca Matematica --> mat
real x, media = 0.0, arredondar
real maior[3],menor[3]
	funcao inicio()
	{
		para (inteiro y = 0 ; y < 3 ; y++){
			para( inteiro i = 0 ; i < 4 ; i++){
				leia(x)
				media = media + x
				se(x > maior[y]){
					maior[y] = x																
				}
				se(x < menor[y] ou menor[y]==0){
					menor[y] = x
				}
			}
			
		}
		media = media/12
		media = mat.arredondar(media, 2)
		escreva("Maior altura")
		escreva("\nDelegacao 1: " +maior[0])
		escreva("\nDelegacao 2: " +maior[1])
		escreva("\nDelegacao 3: " +maior[2])
		escreva("\n")
		escreva("\nMenor altura")
		escreva("\nDelegacao 1: " +menor[0])
		escreva("\nDelegacao 2: " +menor[1])
		escreva("\nDelegacao 3: " +menor[2])
		escreva("\n")
		escreva("\nAltura media: "+ media)
	}
}

/*
Maior altura
Delegacao 1: 1.0
Delegacao 2: 2.0
Delegacao 3: 3.0

Menor altura
Delegacao 1: 1.0
Delegacao 2: 2.0
Delegacao 3: 3.0

Altura media: 2.0
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 785; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */