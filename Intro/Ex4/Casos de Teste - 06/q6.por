programa
{
	inteiro x, y, mult
	funcao inicio()
	{
		leia(x,y)
		se (y == 0){
			mult = 1
		}senao{
			mult = 1
			para(inteiro i = 0; i < y ; i++){
				mult = mult * x
			}
		}
	escreva(mult)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */