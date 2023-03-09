import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n1 = 0,n2 = 1,res;
        System.out.print("Digite um valor: ");
        Integer numUsuario = sc.nextInt();

        while(n1 <= numUsuario) {
            System.out.println(n1);
            if(n1 == numUsuario) {
                System.out.println("O número pertence a sequência de Fibonacci");
                return;
            }

            res = n1 + n2;
            n2 = n1;
            n1 = res;
        }

        System.out.println("O número não pertence a sequência de Fibonacci");
        sc.close();
    }
}
