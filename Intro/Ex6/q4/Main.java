import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(primo(a));
        in.close();
    }
    static String primo(int a) {
        for (int j = 2; j < a; j++) {
            if (a % j == 0){
                return "nao e primo";
            }
        }
        return "primo";
    }
    
}
