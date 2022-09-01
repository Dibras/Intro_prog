import java.util.Scanner;

class Main {
    public static void main(String[] args){
        int x = 1, y = 1, div1 = 0, div;
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        while( div1 == 0 ){
            y = in.nextInt();
            if(y!=0){
                div1=1;
            }
        }
        div = x/y;
        System.out.println(div);
        in.close();
    }
}
