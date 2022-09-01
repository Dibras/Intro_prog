import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y=in.nextInt(), mult;
        if(y==0){
            mult = 1;
        }else{
            mult = 1;
            for(int i=0; i<y; i++) {
                mult = mult*x;
            }
        }

        System.out.println(mult);
        in.close();
    }
}
