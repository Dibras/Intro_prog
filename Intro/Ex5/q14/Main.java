import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble(),z = 1.0,soma = 0.0;
        int y = 0;

        for (int i = 0;i<x;i++) {
            y = in.nextInt();
            z = in.nextDouble();
            if(y>30){
                soma += z;
            }

        }
        System.out.println(soma);
        
        in.close();
    }
}
