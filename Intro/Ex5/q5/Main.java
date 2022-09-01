import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int notas[];  
        Double media = 0.0;
        Scanner in = new Scanner(System.in);
        notas = new int[3];

        for (int i = 0; i < 2;i++) {
            notas[i] = in.nextInt();
            media += notas[i];
        }
        notas[2] = in.nextInt();

        if(notas[2] < 50 || media < 8){
            System.out.println("reprovado");

        }else{
            media = media/2;
            if (media<6.0 || notas[0] < 4 || notas[1] < 4){
                System.out.println("recuperacao");
            }else{
                System.out.println("aprovado");
            }
        }
     in.close();
    }
}