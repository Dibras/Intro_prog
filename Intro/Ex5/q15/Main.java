import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int x, soma = 0;
        x = in.nextInt();
        for(int i = 0; i <= x; i++){
            if (i % 2 == 1 ){
                soma += i;
            }
        }
        System.out.println(soma);
        in.close();
    }
}