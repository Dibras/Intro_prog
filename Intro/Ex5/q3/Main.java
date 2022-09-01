import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String sigla;
        Scanner teclado = new Scanner(System.in);

        sigla = teclado.nextLine();

        switch(sigla.toLowerCase()) {
            case "rj":
                System.out.println("carioca");
                break;
            case "sp":
                System.out.println("paulista");
                break;
            case "mg":
                System.out.println("mineiro");
                break;
            case "rn":
                System.out.println("potiguar");
                break;
            case "es":
                System.out.println("capixaba");
                break;
            case "rs":
                System.out.println("gaucho");
                break;
            case "sc":
                System.out.println("catarino");
                break;
            default:
                System.out.println("outro estado");
                break;
        }

        teclado.close();
    }
    
}
