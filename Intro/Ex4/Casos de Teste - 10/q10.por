programa
{
	inteiro x, maior = 0, menor=1000000000, media=0,y
	funcao inicio()
	{
		leia(x)
		para ( inteiro i = 0; i < x; i++){
			leia(y)
			media = media + y
			se (y > maior){
				maior = y
			}
			se (y < menor){
				menor = y
			}
		}
		escreva("Quantidade produzida nos "+x+" dias: "+media+
		"\nMedia diaria de producao: "+media/x)
		escreva("\nMenor producao diaria: "+menor+"\nMaior producao diaria: "+maior)
	}
}





/*
Quantidade produzida nos 3 dias: 6
Media diaria de producao: 2
Menor producao diaria: 1
Maior producao diaria: 3
3
1
2
3
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */