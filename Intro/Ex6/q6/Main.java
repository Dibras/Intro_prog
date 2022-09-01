import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int recebe[]=new int[3];

        for (int i=0; i<recebe.length; i++) {
            recebe[i]=in.nextInt()*3;
        }
        for(int i=0; i<recebe.length; i++){
            System.out.println(recebe[i]);
        }
        in.close();
    }
}
