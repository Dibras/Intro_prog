import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat();
        df.applyPattern(".0#");
        Scanner in = new Scanner(System.in);
        Double entrada,maior = 0.0,menor=9999999999.0, media=0.0;
        for (int i = 0; i <4; i++){
            entrada = in.nextDouble();
            media += entrada;
            if(entrada>maior){
                maior = entrada;
            }
            if(entrada<menor){
                menor = entrada;
            }
        }
        media = media/4;
        System.out.println("Maior altura: "+ maior+" metros");
        System.out.println("Menor altura: "+ menor+" metros");
        System.out.println("Altura media: "+ df.format(media)+" metros");
        in.close();
    }
}

