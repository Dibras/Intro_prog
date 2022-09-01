import java.util.Scanner;

class Main {
    public static void main(String[] args){
        int entrada = 0, menor = 999999999;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            entrada = ler.nextInt();
            if (entrada < menor) {
                menor = entrada;
            }
        }
        System.out.println(menor);
        ler.close();
    }
}