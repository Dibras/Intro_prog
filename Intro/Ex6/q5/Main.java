import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int entrada = in.nextInt(),vet1[]= new int[entrada],vet2[]= new int[entrada];

        for (int i=0; i<vet1.length; i++) {
            vet1[i]=in.nextInt();
            vet2[vet1.length-(i+1)]= vet1[i];
        }

        for (int i=0; i<vet2.length; i++) {
            if(vet1[i]!=vet2[i]) {
                System.out.println("false");
            in.close();
            return;
            }
        }
        System.out.println("true");
        in.close();
    }

}
