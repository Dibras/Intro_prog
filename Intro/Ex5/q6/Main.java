import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner n = new Scanner(System.in);

        peso = n.nextDouble();
        altura = n.nextDouble();
        imc = peso / (altura * altura);


        if( imc < 18.5 ){
            System.out.println("abaixo do peso");
        }
        if(25.0 > imc && imc > 18.5 ){
            System.out.println("peso normal");
        }
        if(30 > imc && imc > 25 ){
            System.out.println("acima do peso");
        }
        if( imc > 30 ){
            System.out.println("obeso");
        }
        n.close();
    }
}
