import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x=in.nextInt(), y=in.nextInt(), res3, res5;
        String total="";
        for(int i = x ; i <= y ; i++){
            res3 = i % 3;
			res5 = i % 5;
            if (res3 == 0 && res5 == 0){
				total = total + "pifpaf; ";
			}
			if (res3 == 0 && res5 != 0){
				total = total + "pif; ";
			}
			if (res3 != 0 && res5 == 0){
				total = total + "paf; ";
			}
        }
        System.out.println(total);
        in.close();
    }
}
