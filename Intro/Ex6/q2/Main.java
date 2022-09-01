import java.util.Scanner;

class Main {
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         Double vet1[][]=new Double[3][2];
         int n=0;
         for(int i=0;i<3;i++){
             for(int j=0;j<2;j++){
                vet1[i][j]=in.nextDouble();
             }
         }
         n = in.nextInt();

         System.out.println("Matriz:");
         System.out.println(vet1[0][0]+" "+vet1[0][1]);
         System.out.println(vet1[1][0]+" "+vet1[1][1]);
         System.out.println(vet1[2][0]+" "+vet1[2][1]);
        
         
         System.out.println("\nSoma dos elementos da linha "+n+":");
         System.out.println(vet1[n][0]+vet1[n][1]);
         in.close();
     }
}
