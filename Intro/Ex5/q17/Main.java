import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), mult=1;
        for (int i = 1; i <= x ; i++){
            mult = mult * i;
        }
        System.out.println(mult);
        in.close();
    }
}
