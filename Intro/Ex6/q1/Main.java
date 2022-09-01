import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int vet1[] = new int[5] ,vet2[] = new int[5] ;;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            vet1[i] = in.nextInt();
            if (i%2==0){
                vet2[i] = (int) (vet1[i]* 1.02);
            }else{
                vet2[i] = (int) (vet1[i] * 1.05);
            }
        }
        System.out.print("Vetor inicial: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(vet1[i]+" ");

        }
        System.out.print("\n\nVetor resultante: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(vet2[i]+" ");
        }
        in.close();
    }
}