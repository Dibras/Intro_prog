import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    int nota;double media = 0;
    Scanner n = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
        nota = n.nextInt();
        media += nota;
    }
    media = media/4;
    if (media>=7){
        System.out.println("aprovado");
    }
    if (media<5){
        System.out.println("reprovado");
    }
    if (media < 7 && media>=5){
        System.out.println("recuperacao");
    }
    n.close();
    }
}
