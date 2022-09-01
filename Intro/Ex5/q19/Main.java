
import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        float altura, maiorAltura[], menorAltura[],somaAltura=0;
        Scanner n = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern(".0#");

        maiorAltura = new float[3];
        menorAltura = new float[3];

        for (int y = 0 ; y < 3 ; y++){
            for (int x = 0 ; x < 4 ; x++){
                altura = n.nextFloat();
                somaAltura += altura;
                
                if (altura > maiorAltura[y]){
                    maiorAltura[y] = altura;
                }
                if(altura < menorAltura[y] || menorAltura[y]== 0){
                    menorAltura[y] = altura;
                }
            }
        }
        somaAltura = (float) (somaAltura/12.0);

        System.out.println("Maior altura");
        for(int y = 0 ; y < 3 ; y++){
            System.out.println("Delegacao "+ (y+1) + ": "+  maiorAltura[y]);
        }
        System.out.println("\nMenor altura");
        for(int y = 0 ; y < 3 ; y++){
            System.out.println("Delegacao "+ (y+1) + ": "+ menorAltura[y]);
        }
        System.out.println("\nAltura media: "+ df.format(somaAltura));
        n.close();
    }
}
