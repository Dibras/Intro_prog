import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int entrada= n.nextInt();

        if( entrada%2 != 0 ) {
            entrada += 8;
            System.out.println(entrada);
        }
        if( entrada%5 == 0 || entrada%2 == 0  ) {
            entrada += 5;
            System.out.println(entrada);
        }

        n.close();
    }
}
