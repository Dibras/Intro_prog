programa
{
	
inteiro x, y, res3, res5
cadeia total = ""
	funcao inicio()
	{
		leia(x,y)
		para( inteiro i = x ; i <= y ; i++){
			res3 = i % 3
			res5 = i % 5
			se (res3 == 0 e res5 == 0){
				total = total + "pifpaf; "
			}
			se (res3 == 0 e res5 != 0){
				total = total + "pif; "
			}
			se (res3 != 0 e res5 == 0){
				total = total + "paf; "
			}
		}
	escreva(total)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {x, 4, 8, 1}-{y, 4, 11, 1}-{res3, 4, 14, 4}-{res5, 4, 20, 4}-{total, 5, 7, 5}-{i, 9, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */