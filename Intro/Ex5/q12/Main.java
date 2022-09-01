import java.util.Scanner;

class Main {
    public static void main(String[] args){
        int x=1,y=1,soma;
        Scanner in = new Scanner(System.in);
        while(x != 0 || y != 0){
            x = in.nextInt();
            y = in.nextInt();
            soma = x + y;
            if (x != 0 || y != 0){
                System.out.println(soma);
            }
        }
        in.close();
    }
}
