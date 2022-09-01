import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float vet1[][]= new float[3][2];
        int n=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
               vet1[i][j]= in.nextFloat();
            }
        }
        n = in.nextInt();
        System.out.println("Matriz:");
        System.out.println(vet1[0][0]+" "+vet1[0][1]);
        System.out.println(vet1[1][0]+" "+vet1[1][1]);
        System.out.println(vet1[2][0]+" "+vet1[2][1]);
        System.out.println("\nSoma dos elementos da linha "+n+":");
        System.out.println(somaLinha(vet1,n));
        in.close();
    }

    public static float somaLinha(float matriz[][], int linha) {
        float soma =0;
        soma = matriz[linha][0]+matriz[linha][1];
        return soma;
    }
}
