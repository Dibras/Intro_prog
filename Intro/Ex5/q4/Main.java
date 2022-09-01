import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int z[];
        z = new int[3];

        for (int i = 0; i < 3; i++) {
            z[i] = n.nextInt();
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                if (z[i] > z[j]) {
                    int troca = z[i];
                    z[i] = z[j];
                    z[j] = troca;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(z[i]+"\n");
        } 
        n.close();
    }
}
