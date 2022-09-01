import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        double entrada[];
        entrada = new double[3];

        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = n.nextDouble();
        }
        entrada[0] = entrada[0]*60*60;
        entrada[1] = entrada[1]*60;
        entrada[2] = entrada[2]+entrada[0]+entrada[1];
        System.out.println((int)entrada[2]);
        n.close();
    }
}
