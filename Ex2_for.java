import java.util.Scanner;

public class Ex2_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //ler um número

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++){ // Começa em 0 < i for menor que o n < soma mais 1
            int x = sc.nextInt(); //Entrar com os valores até chegar ao numero de vezes de n
            if(x >= 10 && x <= 20){ 
                in = in + 1;
            } else {
                out = out + 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
