import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int salario = 0, taxa = 0;
        float porcentagem = 0;
        Scanner n = new Scanner(System.in);

        salario = n.nextInt();
        taxa = n.nextInt();
        
        porcentagem = (float) (salario*0.3);
        
        if(porcentagem >= taxa){
            System.out.println("sim");
        }else{
            System.out.println("nao");
        }
        n.close();
    }
}
