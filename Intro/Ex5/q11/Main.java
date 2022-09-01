import java.util.Scanner;

class Main {
    public static void main(String[] args){
    int i = 1, j = 0;
    Scanner in = new Scanner(System.in);
    while (i!=0){
        i = in.nextInt();
        j += i;
    }    
    System.out.println(j);
    in.close();
    }
}
