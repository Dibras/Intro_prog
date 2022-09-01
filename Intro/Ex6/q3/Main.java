import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int vet1[]=new int[in.nextInt()];
        for (int i=0; i<vet1.length; i++) {
            vet1[i]=in.nextInt();
        }
        System.out.print("Numeros informados: ");
        for (int i=0; i<vet1.length; i++){
            System.out.print(vet1[i]+", ");
        }
        for (int i = 1; i < vet1.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vet1[i] < vet1[j]) {
                    int troca = vet1[i];
                    vet1[i] = vet1[j];
                    vet1[j] = troca;
                }
            }
        }
        System.out.print("\n\nNumeros em ordem crescente: ");
        for (int i=0; i<vet1.length; i++){
            System.out.print(vet1[i]+", ");
        }
        in.close();
    }
}
