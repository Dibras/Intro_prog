import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x=in.nextInt(), maior = 0, menor=1000000000, media=0,y;
        for (int i = 0; i < x; i++){
            y = in.nextInt();
            media += y;
            if (y>maior) maior = y;
            if (y<menor) menor = y;
        }


        System.out.println("Quantidade produzida nos "+x+" dias: "+media+
		"\nMedia diaria de producao: "+media/x);
        System.out.println("Menor producao diaria: "+menor+"\nMaior producao diaria: "+maior);
        in.close();
    }
}
